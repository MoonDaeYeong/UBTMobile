package com.nsdevil.ubtmobilev3.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nsdevil.ubtmobilev3.base.BaseViewModel
import com.nsdevil.ubtmobilev3.data.repository.ExamFinishRepository
import com.nsdevil.ubtmobilev3.data.response.SurveyResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExamFinishViewModel @Inject constructor(private val repository: ExamFinishRepository) : BaseViewModel() {

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        getThrowable.postValue(throwable)
        viewLoading.postValue(false)
    }

    val surveyResult = MutableLiveData<SurveyResponse>()
    fun getSurveyItem(examId: Int) {
        viewLoading.postValue(true)
        viewModelScope.launch (exceptionHandler) {
            val reuslt = repository.getSurveyItem(examId)
            surveyResult.postValue(reuslt)
            viewLoading.postValue(false)
        }
    }
}