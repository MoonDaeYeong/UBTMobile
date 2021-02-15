package com.nsdevil.ubtmobilev3.viewmodels

import android.content.Context
import androidx.lifecycle.*
import com.nsdevil.ubtmobilev3.base.BaseViewModel
import com.nsdevil.ubtmobilev3.data.db.InAnswer
import com.nsdevil.ubtmobilev3.data.db.InQuestion
import com.nsdevil.ubtmobilev3.data.model.QuestionAnswer
import com.nsdevil.ubtmobilev3.data.model.UploadReturnData
import com.nsdevil.ubtmobilev3.data.repository.ExamRepository
import com.nsdevil.ubtmobilev3.data.request.HeadPosRequest
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flatMapLatest
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.File
import javax.inject.Inject

@HiltViewModel
class ExamViewModel @Inject constructor (private val repository: ExamRepository) : BaseViewModel() {

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        getThrowable.postValue(throwable)
        viewLoading.postValue(false)
    }

    private var sendResultCheck = false

    private var timerJob: Job? = null

    val remainTime: MutableStateFlow<Int> = MutableStateFlow(0)

    val questionAnswerList: LiveData<List<QuestionAnswer>> = liveData {
        emit(repository.getQuestionAnswer())
    }

    fun timerSetting(ctx: Context) {
        timerJob?.cancel()
        timerJob = viewModelScope.launch(exceptionHandler + Dispatchers.IO) {
            repository.getRemainTime().collect { time ->
                if (time > 0) {
                    remainTime.value = time
                    delay(1000L)
                    repository.updateRemainTime()
                } else {
                    remainTime.value = 0
                    if (!sendResultCheck)
                        submissionProcess(ctx)
                }
            }
        }
    }

    val uploadResultMsg = MutableLiveData<UploadReturnData>()

    suspend fun submissionProcess(ctx: Context) {
        viewLoading.postValue(true)

        sendResultCheck = true

        val signFile = File(ctx.getExternalFilesDir(null),String.format("sign_%s.png", CommonUtils.userExam.examCode))
        val aiLogFile = File(ctx.getExternalFilesDir(null),String.format("Logfile-%s-%s-%s.txt",CommonUtils.getDate(),CommonUtils.userExam.examId,CommonUtils.userExam.examCode))
        if (!signFile.exists())
            signFile.createNewFile()
        if (!aiLogFile.exists())
            aiLogFile.createNewFile()

        val aiBodyPart = MultipartBody.Part.createFormData("ailog",aiLogFile.name,aiLogFile.asRequestBody("multipart/form-data".toMediaTypeOrNull()))
        val signBodyPart = MultipartBody.Part.createFormData("signature",signFile.name,signFile.asRequestBody("multipart/form-data".toMediaTypeOrNull()))

        val submitForm = CommonUtils.submissionRequest(repository.getQuestionAnswer())
        val answerResult = repository.submit(submitForm)
        if (answerResult.success) {
            val resultId = answerResult.result.resultId.toRequestBody("multipart/form-data".toMediaTypeOrNull())
            val fileUploadResult = repository.uploadResultFile(resultId, aiBodyPart, signBodyPart)
            uploadResultMsg.postValue(UploadReturnData(true, "응시 답안 업로드 성공", "TEXT"))
            sendResultCheck = if (fileUploadResult.success) {
                repository.updateSubmitCheck()
                uploadResultMsg.postValue(UploadReturnData(true, "파일 업로드 성공", "FILE"))
                timerJob?.cancel()
                false
            } else {
                uploadResultMsg.postValue(UploadReturnData(false, "파일 업로드 실패", "FILE"))
                timerJob?.cancel()
                false
            }
        } else {
            uploadResultMsg.postValue(UploadReturnData(false, "응시 답안 업로드 실패", "TEXT"))
            sendResultCheck = false
        }
        viewLoading.postValue(false)
    }

    val getTotalCount = repository.getTotalCount().asLiveData()
    val getRemainCount = repository.getRemainCount().asLiveData()

    private val viewListState: MutableStateFlow<Int> = MutableStateFlow(0)

    val getQuestionList: LiveData<List<InQuestion>> = viewListState.flatMapLatest {
        when (it) {
            0 -> repository.getQuestionList()
            1 -> repository.getCompletedList()
            2 -> repository.getUnCompletedList()
            3 -> repository.getCheckList()
            else -> repository.getQuestionList()
        }
    }.asLiveData()

    fun setViewListState(viewState: Int) {
        viewListState.value = viewState
    }

    fun questionAnswer(index: Int) = repository.getQuestionAnswer(index).asLiveData()

    fun getDataList(index: Int) = repository.getDataList(index).asLiveData()

    fun updateUserCheck(index: Int) {
        viewModelScope.launch {
            repository.updateUserCheck(index)
        }
    }

    val updateCompleted: MutableLiveData<Int> = MutableLiveData()
    fun updateAnswer(answerList: List<InAnswer>, index: Int, stayingTime: Int) {
        viewModelScope.launch {
            if (!answerList.isNullOrEmpty())
                repository.updateAnswerData(answerList, stayingTime)

            updateCompleted.postValue(index)
        }
    }

    fun aiAlertSignal(ctx: Context) {
        val logFile = File(ctx.getExternalFilesDir(null), String.format("Logfile-%s-%s-%s.txt",CommonUtils.getDate(),CommonUtils.userExam.examId,CommonUtils.userExam.examCode))
        val reFormAiDataList: MutableSet<List<String>> = mutableSetOf()

        if(!logFile.exists())
            return

        logFile.readLines().forEach {log ->
            val aiStringList: MutableList<String> = mutableListOf()

            val dateString = String.format("\"%s\"",log.split(',')[0])
            aiStringList.add(dateString)
            aiStringList.add(log.split(',')[1])

            val direction = String.format("\"%s\"",log.split(',')[2])
            aiStringList.add(direction)
            reFormAiDataList.add(aiStringList)
        }
        val headPosRequest = HeadPosRequest(CommonUtils.userExam.examId, CommonUtils.userExam.examCode, CommonUtils.userExam.variants.first(), reFormAiDataList.toList())
        viewModelScope.launch {
            repository.aiAlertSignal(headPosRequest)
        }
    }
}