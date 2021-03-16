package com.nsdevil.ubtmobilev3.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nsdevil.ubtmobilev3.base.BaseViewModel
import com.nsdevil.ubtmobilev3.data.repository.ExamFinishRepository
import com.nsdevil.ubtmobilev3.data.repository.SurveyRepository
import com.nsdevil.ubtmobilev3.data.request.SurveyRequest
import com.nsdevil.ubtmobilev3.data.response.SendSurveyResponse
import com.nsdevil.ubtmobilev3.data.response.SurveyResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SurveyViewModel @Inject constructor(private val repository: SurveyRepository) : BaseViewModel() {

    private val exceptionHandler = CoroutineExceptionHandler { _, error ->
        getThrowable.postValue(error)
        viewLoading.postValue(false)
    }

    val surveyResult = MutableLiveData<SendSurveyResponse>()

    fun sendSurvey(params: SurveyRequest) {
        viewLoading.postValue(true)
        viewModelScope.launch (exceptionHandler) {
            val result = repository.sendSurvey(params)
            surveyResult.postValue(result)
            viewLoading.postValue(false)
        }
    }
}