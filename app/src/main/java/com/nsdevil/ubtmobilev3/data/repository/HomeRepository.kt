package com.nsdevil.ubtmobilev3.data.repository

import com.nsdevil.ubtmobilev3.api.UbtService
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import retrofit2.http.Header
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Singleton

class HomeRepository @Inject constructor(private val ubtService: UbtService) {

    fun getMeData() = ubtService.me(CommonUtils.tokenForm)

    fun getHomeData() = ubtService.homeData(CommonUtils.tokenForm)

    suspend fun examCodeRegister(examCode: String) = ubtService.examCodeRegister(CommonUtils.tokenForm, examCode)

    suspend fun getExamCodeStatus() = ubtService.getExamCodeStatus(CommonUtils.tokenForm)
}