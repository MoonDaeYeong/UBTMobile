package com.nsdevil.ubtmobilev3.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nsdevil.ubtmobilev3.base.BaseViewModel
import com.nsdevil.ubtmobilev3.data.repository.MoreRepository
import com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse
import com.nsdevil.ubtmobilev3.data.response.AllOrgResponse
import com.nsdevil.ubtmobilev3.data.response.AllOtherExamResponse
import com.nsdevil.ubtmobilev3.ui.MoreFragmentArgs
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoreViewModel @Inject constructor(private val repository: MoreRepository) : BaseViewModel() {

    private val exceptionHandler = CoroutineExceptionHandler { _, error ->
        getThrowable.postValue(error)
        viewLoading.postValue(false)
    }

    val myExamResult = MutableLiveData<AllMyExamResponse>()
    val otherExamResult = MutableLiveData<AllOtherExamResponse>()
    val orgResult = MutableLiveData<AllOrgResponse>()
    fun getInitSetting(args: MoreFragmentArgs) {
        viewLoading.postValue(true)
        viewModelScope.launch (exceptionHandler) {
            when (args.category) {
                "exam" -> {
                    when (args.subClass) {
                        "my" -> myExamResult.postValue(repository.getAllMyExamList(""))
                        "other" -> otherExamResult.postValue(repository.getAllOtherExamList(""))
                        else -> myExamResult.postValue(repository.getAllMyExamList(""))
                    }
                }
                else -> {
                    when (args.subClass) {
                        "my" -> orgResult.postValue(repository.getAllOrg("my", ""))
                        else -> orgResult.postValue(repository.getAllOrg("other", ""))
                    }
                }
            }
            viewLoading.postValue(false)
        }
    }

    fun getFindExam(examName: String) {
        viewLoading.postValue(true)
        viewModelScope.launch (exceptionHandler) {
            myExamResult.postValue(repository.getAllMyExamList(examName))
            viewLoading.postValue(false)
        }
    }
}