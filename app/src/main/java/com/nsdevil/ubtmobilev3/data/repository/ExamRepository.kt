package com.nsdevil.ubtmobilev3.data.repository

import com.nsdevil.ubtmobilev3.api.UbtService
import com.nsdevil.ubtmobilev3.data.db.*
import com.nsdevil.ubtmobilev3.data.request.HeadPosRequest
import com.nsdevil.ubtmobilev3.data.request.SubmissionRequest
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import okhttp3.MultipartBody
import okhttp3.RequestBody
import javax.inject.Inject
import javax.inject.Singleton

class ExamRepository @Inject constructor(private val examInfoDao: InExamInfoDao, private val questionDao: InQuestionDao, private val dataDao: InDataDao, private val answerDao: InAnswerDao, private val ubtService: UbtService) {

    val examCode = CommonUtils.userExam.examCode

    fun getQuestionList() = questionDao.getWholeList(examCode)
    fun getCompletedList() = questionDao.getCompletedList(examCode)
    fun getUnCompletedList() = questionDao.getUnCompletedList(examCode)
    fun getCheckList() = questionDao.getCheckList(examCode)

    fun getQuestionAnswer(index: Int) = questionDao.getQuestionAnswer(examCode, index)

    fun getDataList(index: Int) = dataDao.getDataList(examCode, index)

    fun getRemainTime() = examInfoDao.getRemainTime(examCode)
    suspend fun updateRemainTime() = examInfoDao.updateRemainTime(examCode)

    fun getTotalCount() = questionDao.getTotalCount(examCode)
    fun getRemainCount() = questionDao.getRemainCount(examCode)

    suspend fun updateUserCheck(index: Int) = questionDao.updateUserCheck(examCode, index)

    suspend fun updateAnswerData(answerList: List<InAnswer>, stayingTime: Int) = answerDao.updateAnswerData(answerList, stayingTime)

    suspend fun getQuestionAnswer() = questionDao.getQuestionAnswerList(examCode)

    suspend fun submit (params: SubmissionRequest) = ubtService.submit(CommonUtils.tokenForm, params)

    suspend fun uploadResultFile(resultId: RequestBody, signature: MultipartBody.Part, ailog: MultipartBody.Part) = ubtService.uploadResultFile(CommonUtils.tokenForm, resultId, signature, ailog)

    suspend fun updateSubmitCheck() = examInfoDao.updateSubmitCheck(examCode)

    suspend fun aiAlertSignal(params: HeadPosRequest) = ubtService.aiAlertSignal(CommonUtils.tokenForm, params)
}