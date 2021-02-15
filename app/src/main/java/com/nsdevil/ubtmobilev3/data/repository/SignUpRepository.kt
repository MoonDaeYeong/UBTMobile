package com.nsdevil.ubtmobilev3.data.repository

import com.nsdevil.ubtmobilev3.api.UbtService
import com.nsdevil.ubtmobilev3.data.request.SignUpRequest
import javax.inject.Inject
import javax.inject.Singleton

class SignUpRepository @Inject constructor(private val ubtService: UbtService) {

    suspend fun signUp(signUpRequest: SignUpRequest) = ubtService.signUp(signUpRequest)
}