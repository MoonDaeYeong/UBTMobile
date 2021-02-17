package com.nsdevil.ubtmobilev3.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nsdevil.ubtmobilev3.base.BaseViewModel
import com.nsdevil.ubtmobilev3.data.model.ProfileData
import com.nsdevil.ubtmobilev3.data.repository.HomeRepository
import com.nsdevil.ubtmobilev3.data.response.ExamCodeResponse
import com.nsdevil.ubtmobilev3.data.response.HomeDataResponse
import com.nsdevil.ubtmobilev3.data.response.MeResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor (private val repository: HomeRepository) : BaseViewModel() {

    private val exceptionHandler = CoroutineExceptionHandler { _, error ->
        getThrowable.postValue(error)
        viewLoading.postValue(false)
    }

    val meDataResult = MutableLiveData<MeResponse>()
    fun getMeData() {
        viewLoading.postValue(true)
        CompositeDisposable().add(repository.getMeData().subscribeOn(Schedulers.io())
            .observeOn(Schedulers.single())
            .subscribe({
                viewLoading.postValue(false)
                meDataResult.postValue(it)

                imgUrl = it.image
                userName = it.lastName
                userEmail = it.email
                point = it.point
            }, {
                viewLoading.postValue(false)
                getThrowable.postValue(it)
            }))
    }

    val homeDataResult = MutableLiveData<HomeDataResponse>()
    fun getHomeData() {
        viewLoading.postValue(true)
        CompositeDisposable().add(repository.getHomeData().subscribeOn(Schedulers.io())
            .observeOn(Schedulers.single())
            .subscribe({
                viewLoading.postValue(false)
                homeDataResult.postValue(it)

                examCount = it.result.myExamCount
                orgCount = it.result.myOrganizCount
            }, {
                viewLoading.postValue(false)
                getThrowable.postValue(it)
            }))
    }

    val examCodeResult = MutableLiveData<ExamCodeResponse>()
    fun examCodeRegister(examCode: String) {
        viewLoading.postValue(true)
        viewModelScope.launch (exceptionHandler + Dispatchers.IO) {
            val result = repository.examCodeRegister(examCode)
            examCodeResult.postValue(result)
            viewLoading.postValue(false)
        }
    }

    companion object {
        var imgUrl: String = ""
        var userName: String = ""
        var userEmail: String = ""
        var point: Int = 0
        var examCount: Int = 0
        var orgCount: Int = 0
    }
}