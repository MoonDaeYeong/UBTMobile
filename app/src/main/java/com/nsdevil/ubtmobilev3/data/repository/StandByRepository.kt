package com.nsdevil.ubtmobilev3.data.repository

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.nsdevil.ubtmobilev3.api.UbtService
import com.nsdevil.ubtmobilev3.data.db.*
import com.nsdevil.ubtmobilev3.data.response.QuestionResponse
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import javax.inject.Inject
import javax.inject.Singleton

class StandByRepository @Inject constructor(private val ubtService: UbtService, private val examInfoDao: InExamInfoDao, private val answerDao: InAnswerDao, private val dataDao: InDataDao, private val questionDao: InQuestionDao) {

    val examCode = CommonUtils.userExam.examCode

    fun requestFile(fileName: String) = ubtService.requestFile(CommonUtils.tokenForm, fileName)

    suspend fun getQuestionSus(examId: Int) = ubtService.questionsSus(CommonUtils.tokenForm, examId)

    suspend fun getExamStatus() = ubtService.getExamStatus(CommonUtils.tokenForm, CommonUtils.userExam.examId)

    suspend fun getExamInfo() = examInfoDao.getExamInfo(examCode)

    suspend fun getInAnswerList() = answerDao.getInAnswerList(examCode)

    suspend fun getMediaList() = dataDao.getMediaList(examCode)

    suspend fun insertExamInfo(examInfo: InExamInfo) = examInfoDao.insertExamInfo(examInfo)

    suspend fun initInsertReadyData(questions: List<QuestionResponse.Result.Question>) {

        val qType = object : TypeToken<List<InQuestion>>(){}.type
        val dType = object : TypeToken<List<InData>>(){}.type
        val aType = object : TypeToken<List<InAnswer>>(){}.type
        val responQ:String = Gson().toJson(questions)
        val inQ: List<InQuestion> = Gson().fromJson(responQ, qType)
        for(i in inQ.indices) {
            val responA:String = Gson().toJson(questions[i].answers)
            val inA: List<InAnswer> = Gson().fromJson(responA, aType)

            inQ[i].examQACode = examCode + inQ[i].viewOrder

            for(j in inA.indices) {
                inA[j].examCode = examCode
                inA[j].viewOrder = questions[i].viewOrder
                inA[j].questionType = questions[i].questionType
                inA[j].questionId = questions[i].id
                inA[j].checkCount = questions[i].checkCount
                inA[j].examQACode = inQ[i].examQACode
                inA[j].answerType = inQ[i].answerType

                if(!questions[i].answers[j].media?.fileName.isNullOrEmpty()) {
                    inA[j].fileName = questions[i].answers[j].media?.fileName
                    inA[j].mediaType = questions[i].answers[j].media?.mediaType
                }
            }
            answerDao.insertAnswer(inA)

            inQ[i].category = String.format("%s %s %s", questions[i].cate1, questions[i].cate2, questions[i].cate3)
            inQ[i].examCode = examCode

            val dataQ = Gson().toJson(questions[i].datas)
            val inD: List<InData> = Gson().fromJson(dataQ, dType)
            for(j in inD.indices) {
                inD[j].viewOrder = questions[i].viewOrder
                inD[j].examCode = examCode
                if(questions[i].datas[j].media != null) {
                    inD[j].media = questions[i].datas[j].media
                } else {
                    inD[j].media = QuestionResponse.Result.Question.Data.MediaX(null, null, null, null)
                }
            }
            dataDao.insertData(inD)
        }
        questionDao.insertQuestion(inQ)
    }

}