package com.nsdevil.ubtmobilev3.viewmodels

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.nsdevil.ubtmobilev3.api.UbtService
import com.nsdevil.ubtmobilev3.base.BaseViewModel
import com.nsdevil.ubtmobilev3.data.db.InExamInfo
import com.nsdevil.ubtmobilev3.data.repository.StandByRepository
import com.nsdevil.ubtmobilev3.utilities.*
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import java.io.BufferedInputStream
import java.io.File
import java.io.InputStream
import java.nio.channels.Channels
import java.nio.charset.Charset
import java.util.zip.ZipFile
import javax.inject.Inject

@HiltViewModel
class StandByViewModel @Inject constructor (private val repository: StandByRepository) : BaseViewModel() {

    val readyCheck = MutableStateFlow(false)
    val continueCheck = MutableStateFlow(false)
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
                        continueCheck.value = true
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

    val downloadZipFileName = MutableLiveData<String>()
    private suspend fun createExamInfo() {
        val secondTime = CommonUtils.userExam.examTime.toInt() * 60
        val examData = CommonUtils.userExam
        val examInfo = InExamInfo(examId = examData.examId,examCode = examData.examCode,examName = examData.examName,totalTime = secondTime,remainTime = secondTime,submissionYN = false)
        repository.insertExamInfo(examInfo)

        val questions = repository.getQuestionSus(CommonUtils.userExam.examId).result.questions
        repository.initInsertReadyData(questions)

        val zipName = repository.getQuestionSus(CommonUtils.userExam.examId).result.zipName
        downloadZipFileName.postValue(zipName)
    }

    fun downloadZipFile(onAttachmentDownloadUpdate: (Int, String) -> Unit, fileName: String) {
        val newFileName = fileName.substring(fileName.lastIndexOf("_")+1, fileName.length)
        val newFile = File(_context.filesDir, newFileName)
        if(!newFile.exists())
            CompositeDisposable().add (
                UbtService.downloadCreate(onAttachmentDownloadUpdate, newFileName).requestFile(CommonUtils.tokenForm, fileName).subscribeOn(Schedulers.single()).observeOn(Schedulers.io()).subscribe({
                    it.byteStream().saveToFile(newFile.absolutePath)
            }, {
                getThrowable.postValue(it)
            })
        )
        else
            readyCheck.value = true
    }

    private fun InputStream.saveToFile(file: String) = use { input ->
        File(file).outputStream().use { output ->
            input.copyTo(output)
            val rbc = Channels.newChannel(input)
            output.channel.transferFrom(rbc, 0, Long.MAX_VALUE)
            output.close()

            val newPath = File(file).parentFile.path
            val questionFolder = File(newPath, "question")
            if(!questionFolder.exists())
                questionFolder.mkdirs()
            val answerFolder = File(newPath, "answer")
            if(!answerFolder.exists())
                answerFolder.mkdirs()
            unZip(file, newPath)
        }
    }

    val status = MutableLiveData<String>()
    fun getExamStatus() {
        viewModelScope.launch(exceptionHandler + Dispatchers.IO) {
            viewLoading.postValue(true)
            status.postValue(repository.getExamStatus().result.status)
            viewLoading.postValue(false)
        }
    }

    private fun unZip(zipFilePath: String, targetPath: String) {
        ZipFile(zipFilePath).use { zip ->
            zip.entries().asSequence().forEach { entry ->
                zip.getInputStream(entry).use { input ->
                    when {
                        entry.name.startsWith("uestion") -> {
                            val newPathName = String.format("question"+entry.name.substring(entry.name.indexOf("/"), entry.name.length)); File(targetPath, newPathName).outputStream().use { output -> input.copyTo(output) }
                        }
                        entry.name.startsWith("nswer") -> {
                            val newPathName = String.format("answer"+entry.name.substring(entry.name.indexOf("/"), entry.name.length)); File(targetPath, newPathName).outputStream().use { output -> input.copyTo(output) }
                        }
                        else -> {
                            File(targetPath, entry.name).outputStream().use { output -> input.copyTo(output) }
                        }
                    }
                }
            }
            readyCheck.value = true
        }
    }

    fun reTake() = repository.reTakeExam(
        onStart= {viewLoading.postValue(true)},
        onComplete = {viewLoading.postValue(false)},
        onThrowable = {getThrowable.postValue(it)}
    ).asLiveData(viewModelScope.coroutineContext)

    fun updateAddTime(addTime: Int) {
        viewModelScope.launch {
            repository.updateAddTime(addTime)
        }
    }

    companion object {
        private lateinit var _context:Context
    }
}