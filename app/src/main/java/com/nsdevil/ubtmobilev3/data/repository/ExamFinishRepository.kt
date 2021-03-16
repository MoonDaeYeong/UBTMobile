package com.nsdevil.ubtmobilev3.data.repository

import com.nsdevil.ubtmobilev3.api.UbtService
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import javax.inject.Inject

class ExamFinishRepository @Inject constructor(private val ubtService: UbtService) {

    suspend fun getSurveyItem(examId: Int) = ubtService.getSurveyItem(CommonUtils.tokenForm, examId)
}