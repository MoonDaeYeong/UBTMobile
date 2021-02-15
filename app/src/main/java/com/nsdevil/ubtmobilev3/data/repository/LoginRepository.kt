package com.nsdevil.ubtmobilev3.data.repository

import com.nsdevil.ubtmobilev3.api.UbtService
import com.nsdevil.ubtmobilev3.data.request.LoginRequest
import javax.inject.Inject
import javax.inject.Singleton

class LoginRepository @Inject constructor(private val ubtService: UbtService) {

    fun ubtLogin(loginRequest: LoginRequest) = ubtService.signInMobile(loginRequest)
}