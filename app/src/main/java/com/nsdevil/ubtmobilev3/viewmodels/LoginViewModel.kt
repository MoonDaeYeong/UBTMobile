package com.nsdevil.ubtmobilev3.viewmodels

import androidx.lifecycle.MutableLiveData
import com.nsdevil.ubtmobilev3.base.BaseViewModel
import com.nsdevil.ubtmobilev3.data.repository.LoginRepository
import com.nsdevil.ubtmobilev3.data.request.LoginRequest
import com.nsdevil.ubtmobilev3.data.response.LoginResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor (private val loginRepository: LoginRepository) : BaseViewModel() {

    val loginResult = MutableLiveData<LoginResponse>()

    fun login(email: String, password: String) {
        viewLoading.postValue(true)

        val loginRequest = LoginRequest(usernameOrEmail = email, password = password)

        CompositeDisposable().add(loginRepository.ubtLogin(loginRequest).subscribeOn(Schedulers.io())
            .observeOn(Schedulers.single())
            .subscribe({
                viewLoading.postValue(false)
                loginResult.postValue(it)
            }, {
                viewLoading.postValue(false)
                getThrowable.postValue(it)
            }))
    }
}