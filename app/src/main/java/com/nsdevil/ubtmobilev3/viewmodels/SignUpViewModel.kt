package com.nsdevil.ubtmobilev3.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nsdevil.ubtmobilev3.base.BaseViewModel
import com.nsdevil.ubtmobilev3.data.repository.SignUpRepository
import com.nsdevil.ubtmobilev3.data.request.SignUpRequest
import com.nsdevil.ubtmobilev3.data.response.SignUpResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
data class SignUpViewModel @Inject constructor (private val repository: SignUpRepository) : BaseViewModel() {

    private val exceptionHandler = CoroutineExceptionHandler { _, error ->
        getThrowable.postValue(error)
        viewLoading.postValue(false)
    }

    val signResult = MutableLiveData<SignUpResponse>()
    fun signUp(name: String, email: String, pw: String) {
        viewLoading.postValue(true)
        val signUp = SignUpRequest(firstname = name, lastname = name, username = email, email = email, password = pw)

        viewModelScope.launch (exceptionHandler + Dispatchers.IO) {
            signResult.postValue(repository.signUp(signUp))
            viewLoading.postValue(false)
        }
    }
}
