package com.nsdevil.ubtmobilev3.base

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    val aiAlertCheck get() = (requireActivity() as BaseActivity).aiAlertCheck

    fun simpleDialog(title: String, msg: String, type: Int) {
        (requireActivity() as BaseActivity).simpleDialog(title, msg, type)
    }
    fun showLoading() {
        (requireActivity() as BaseActivity).showLoading()
    }
    fun hideLoading() {
        (requireActivity() as BaseActivity).hideLoading()
    }
    fun customThrowableHandle(throwable: Throwable) {
        (requireActivity() as BaseActivity).customThrowableHandle(throwable)
    }

    fun startFaceService() {
        (requireActivity() as BaseActivity).startFaceService()
    }

    fun stopFaceService() {
        (requireActivity() as BaseActivity).stopFaceService()
    }

    fun registerMyReceiver() {
        (requireActivity() as BaseActivity).registerMyReceiver()
    }

    fun unRegisterMyReceiver() {
        (requireActivity() as BaseActivity).unRegisterMyReceiver()
    }
}