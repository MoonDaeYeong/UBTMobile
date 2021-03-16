package com.nsdevil.ubtmobilev3.data.repository

import com.nsdevil.ubtmobilev3.api.UbtService
import com.nsdevil.ubtmobilev3.data.request.SurveyRequest
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import javax.inject.Inject

class SurveyRepository @Inject constructor(private val ubtService: UbtService) {

    suspend fun sendSurvey(params: SurveyRequest) = ubtService.sendSurvey(CommonUtils.tokenForm, params)
}