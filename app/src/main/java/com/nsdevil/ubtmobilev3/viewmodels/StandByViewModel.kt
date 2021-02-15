package com.nsdevil.ubtmobilev3.viewmodels

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nsdevil.ubtmobilev3.api.UbtService
import com.nsdevil.ubtmobilev3.base.BaseViewModel
import com.nsdevil.ubtmobilev3.data.db.InExamInfo
import com.nsdevil.ubtmobilev3.data.repository.StandByRepository
import com.nsdevil.ubtmobilev3.utilities.ANSWER_DATA_API_URL
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.utilities.ProgressResponseBody
import com.nsdevil.ubtmobilev3.utilities.QUESTION_DATA_API_URL
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.Flowable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import java.io.File
import java.io.InputStream
import javax.inject.Inject

@HiltViewModel
class StandByViewModel @Inject constructor (private val repository: StandByRepository) : BaseViewModel() {

    val readyCheck = MutableStateFlow(false)
    val continueCheck = MutableLiveData<Boolean>()
    val endCheck = MutableLiveData<Boolean>()

    private val exceptionHandler = CoroutineExceptionHandler { _, error ->
        getThrowable.postValue(error)
        viewLoading.postValue(false)
    }

    fun getExamInfo(context: Context) {
        _context = context

        viewModelScope.launch(exceptionHandler + Dispatchers.IO) {
            viewLoading.postValue(true)

            val examInfo = repository.getExamInfo()

            if (examInfo == null) {
                createExamInfo()
            } else {
                when {
                    examInfo.totalTime != examInfo.remainTime && !examInfo.submissionYN -> {
                        continueCheck.postValue(true)
                        readyCheck.value = true
                    }
                    examInfo.submissionYN -> {
                        endCheck.postValue(true)
                    }
                    else -> {
                        createExamInfo()
                    }
                }
            }
            viewLoading.postValue(false)
        }
    }

    val downloadFileNameList = MutableLiveData<List<String>>()
    private suspend fun createExamInfo() {
        val secondTime = CommonUtils.userExam.examTime.toInt() * 60
        val examData = CommonUtils.userExam
        val examInfo = InExamInfo(examId = examData.examId,examCode = examData.examCode,examName = examData.examName,totalTime = secondTime,remainTime = secondTime,submissionYN = false)
        repository.insertExamInfo(examInfo)

        val questions = repository.getQuestionSus(CommonUtils.userExam.examId).result.questions
        repository.initInsertReadyData(questions)

        val downloadFileList: MutableList<String> = mutableListOf()
        repository.getMediaList().forEach { mediaX ->
            if(!mediaX.fileName.isNullOrEmpty())
                downloadFileList.add("q"+mediaX.fileName)
        }
        repository.getInAnswerList().forEach { answer ->
            if(!answer.fileName.isNullOrEmpty())
                downloadFileList.add("a"+ answer.fileName)
        }
        if(!downloadFileList.isNullOrEmpty()) {
            downloadFileNameList.postValue(downloadFileList)
        } else {
            readyCheck.value = true
        }
    }

    fun downloadData(fileNameList: List<String>, onAttachmentDownloadUpdate: (Int, String) -> Unit) {
        var fileCount = 0
        CompositeDisposable().add(
            Flowable.fromIterable(fileNameList).subscribeOn(Schedulers.io()).observeOn(Schedulers.single()).flatMap { singleFile ->
                val base = if (singleFile.substring(0,1) == "a") ANSWER_DATA_API_URL else QUESTION_DATA_API_URL
                val newName = singleFile.substring(1, singleFile.length)

                Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create()).baseUrl(base).client(createOkHttpProgressClient(onAttachmentDownloadUpdate, newName))
                    .build()
                    .create(UbtService::class.java)
                    .requestFile(CommonUtils.tokenForm, newName)
                    .subscribeOn(Schedulers.io()).observeOn(Schedulers.single()).map {
                        val newFile = File(_context.filesDir, newName)
                        it.byteStream().saveToFile(newFile.absolutePath)
                    }
            }.subscribe({
                fileCount += 1
                if(fileCount == fileNameList.size) {
                    readyCheck.value = true
                }
            }, {
                getThrowable.postValue(it)
            })
        )
    }


    private fun InputStream.saveToFile(file: String) = use { input ->
        File(file).outputStream().use { output ->
            input.copyTo(output)
        }
    }

    private fun createOkHttpProgressClient(onAttachmentDownloadUpdate: (Int, String) -> Unit, fileName: String) : OkHttpClient {
        val builder = OkHttpClient.Builder()
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BASIC
        builder.addInterceptor(interceptor)
        builder.addInterceptor { chain ->
            val originalReponse = chain.proceed(chain.request())
            originalReponse.newBuilder().body(originalReponse.body?.let {
                ProgressResponseBody(it, onAttachmentDownloadUpdate, fileName)
            }).build()
        }
        return builder.build()
    }

    val status = MutableLiveData<String>()
    fun getExamStatus() {
        viewModelScope.launch(exceptionHandler + Dispatchers.IO) {
            viewLoading.postValue(true)
            status.postValue(repository.getExamStatus().result.status)
            viewLoading.postValue(false)
        }
    }

    companion object {
        private lateinit var _context:Context
    }
}