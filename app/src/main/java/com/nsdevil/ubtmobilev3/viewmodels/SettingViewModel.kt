package com.nsdevil.ubtmobilev3.viewmodels

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Environment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nsdevil.ubtmobilev3.base.BaseViewModel
import com.nsdevil.ubtmobilev3.data.repository.SettingRepository
import com.nsdevil.ubtmobilev3.data.request.PasswordRequest
import com.nsdevil.ubtmobilev3.data.response.ChangePassResponse
import com.nsdevil.ubtmobilev3.data.response.EditProfileResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.Scheduler
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream
import javax.inject.Inject

@HiltViewModel
class SettingViewModel @Inject constructor(private val settingRepository: SettingRepository) : BaseViewModel() {

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        getThrowable.postValue(throwable)
        viewLoading.postValue(false)
    }

    val editProfileResult = MutableLiveData<EditProfileResponse>()

    fun editProfile(name: String, phone: String) {
        viewLoading.postValue(true)

        val firstName = name.toRequestBody("multipart/form-data".toMediaTypeOrNull())
        val lastName = name.toRequestBody("multipart/form-data".toMediaTypeOrNull())
        val phoneNumber = phone.toRequestBody("multipart/form-data".toMediaTypeOrNull())

        viewModelScope.launch (exceptionHandler) {
            val result = settingRepository.editProfile(firstName, lastName, phoneNumber)
            editProfileResult.postValue(result)
            viewLoading.postValue(false)
        }
    }

    fun changePicture(userPicture: Bitmap, ctx: Context) {
        val fileName = userPicture.byteCount.toString()+".jpeg"

        val file = bitmapToFile(userPicture, fileName, ctx)
        if(file != null) {
            val img = MultipartBody.Part.createFormData("image",fileName,file.asRequestBody("multipart/form-data".toMediaTypeOrNull()))

            viewModelScope.launch(exceptionHandler) {
                val result = settingRepository.changePicture(img)
                editProfileResult.postValue(result)
            }
        }

    }

    private fun bitmapToFile(bitmap: Bitmap, fileNameToSave: String, ctx: Context): File? {
        var file: File? = null
        return try {
            file = File(ctx.filesDir, fileNameToSave)
            file.createNewFile()

            val bos = ByteArrayOutputStream()
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bos)
            val bitmapdata = bos.toByteArray()

            val fos = FileOutputStream(file)
            fos.write(bitmapdata)
            fos.flush()
            fos.close()
            file
        } catch (e: Exception) {
            e.printStackTrace()
            file
        }
    }

    val passChangeResult = MutableLiveData<ChangePassResponse>()

    fun changePassword(cuPw: String, newPw: String) {
        viewLoading.postValue(true)
        val params = PasswordRequest(newpass = newPw, oldpass = cuPw)
        viewModelScope.launch (exceptionHandler) {
            passChangeResult.postValue(settingRepository.changePassword(params))
            viewLoading.postValue(false)
        }
    }
}