package com.nsdevil.ubtmobilev3.data.repository

import com.nsdevil.ubtmobilev3.api.UbtService
import com.nsdevil.ubtmobilev3.data.request.PasswordRequest
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import okhttp3.MultipartBody
import okhttp3.RequestBody
import javax.inject.Inject

class SettingRepository @Inject constructor(private val ubtService: UbtService) {

    suspend fun editProfile(firstname: RequestBody, lastname: RequestBody, phone: RequestBody) = ubtService.editProfile(CommonUtils.tokenForm, firstname, lastname, phone)

    suspend fun changePicture(image: MultipartBody.Part) = ubtService.changePicture(CommonUtils.tokenForm, image)

    suspend fun changePassword(params: PasswordRequest) = ubtService.changePassword(CommonUtils.tokenForm, params)
}