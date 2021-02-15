package com.nsdevil.ubtmobilev3.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {
    val getThrowable = MutableLiveData<Throwable>()
    val viewLoading = MutableLiveData<Boolean>()
}