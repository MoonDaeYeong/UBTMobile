package com.nsdevil.ubtmobilev3.data.repository

import com.nsdevil.ubtmobilev3.api.UbtService
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import retrofit2.http.Header
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Singleton

class MoreRepository @Inject constructor(private val ubtService: UbtService) {

    suspend fun getAllMyExamList(examName: String) = ubtService.getAllMyExam(CommonUtils.tokenForm, examName)

    suspend fun getAllOtherExamList(examName: String) = ubtService.getAllOtherExam(CommonUtils.tokenForm, examName)

    suspend fun getAllOrg(type: String, organizName: String) = ubtService.getAllOrg(CommonUtils.tokenForm, type, organizName)
}