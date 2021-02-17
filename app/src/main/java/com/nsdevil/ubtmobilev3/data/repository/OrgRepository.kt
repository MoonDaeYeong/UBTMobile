package com.nsdevil.ubtmobilev3.data.repository

import com.nsdevil.ubtmobilev3.api.UbtService
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import retrofit2.http.Header
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Singleton


class OrgRepository @Inject constructor(private val ubtService: UbtService) {

    suspend fun getOrgExampleData(orgId: Int) = ubtService.getOrgExampleData(CommonUtils.tokenForm, orgId)

    suspend fun registerOrg(orgId: Int, studentCode: String) = ubtService.registerOrg(CommonUtils.tokenForm, orgId, studentCode)

    suspend fun registerExam(examId: Int) = ubtService.registerExam(CommonUtils.tokenForm, examId)

    suspend fun examCodeRegister(examCode: String) = ubtService.examCodeRegister(CommonUtils.tokenForm, examCode)
}