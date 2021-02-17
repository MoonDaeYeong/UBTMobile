package com.nsdevil.ubtmobilev3.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.nsdevil.ubtmobilev3.base.BaseViewModel
import com.nsdevil.ubtmobilev3.data.repository.OrgRepository
import com.nsdevil.ubtmobilev3.data.response.ExamCodeResponse
import com.nsdevil.ubtmobilev3.data.response.RegisterExamResponse
import com.nsdevil.ubtmobilev3.data.response.RegisterOrgResponse
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OrgViewModel @Inject constructor (private val repository: OrgRepository) : BaseViewModel() {

    private val exceptionHandler = CoroutineExceptionHandler { _, error ->
        getThrowable.postValue(error)
        viewLoading.postValue(false)
    }

    fun getOrgData(orgId: Int) = liveData (exceptionHandler) {
        viewLoading.postValue(true)
        emit(repository.getOrgExampleData(orgId))
        viewLoading.postValue(false)
    }

    val registerOrgResult = MutableLiveData<RegisterOrgResponse>()
    fun registerOrg(orgId: Int, studentCode: String) {
        viewLoading.postValue(true)
        viewModelScope.launch (exceptionHandler) {
            registerOrgResult.postValue(repository.registerOrg(orgId, studentCode))
            viewLoading.postValue(false)
        }
    }

    val registerExamResult = MutableLiveData<RegisterExamResponse>()
    fun registerExam(examId: Int) {
        viewLoading.postValue(true)
        viewModelScope.launch (exceptionHandler) {
            registerExamResult.postValue(repository.registerExam(examId))
            viewLoading.postValue(false)
        }
    }

    val examCodeResult = MutableLiveData<ExamCodeResponse>()
    fun examCodeRegister(examCode:String) {
        viewLoading.postValue(true)
        viewModelScope.launch (exceptionHandler) {
            val result = repository.examCodeRegister(examCode)
            examCodeResult.postValue(result)
            viewLoading.postValue(false)
        }
    }
}