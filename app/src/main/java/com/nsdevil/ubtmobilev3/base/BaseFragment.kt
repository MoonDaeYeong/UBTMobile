package com.nsdevil.ubtmobilev3.base

import androidx.fragment.app.Fragment
import com.nsdevil.ubtmobilev3.MainActivity

abstract class BaseFragment : Fragment() {

    val aiAlertCheck get() = (requireActivity() as MainActivity).aiAlertCheck

    fun simpleDialog(title: String, msg: String, type: Int) {
        (requireActivity() as MainActivity).simpleDialog(title, msg, type)
    }
    fun showLoading() {
        (requireActivity() as MainActivity).showLoading()
    }
    fun hideLoading() {
        (requireActivity() as MainActivity).hideLoading()
    }
    fun customThrowableHandle(throwable: Throwable) {
        (requireActivity() as MainActivity).customThrowableHandle(throwable)
    }

    fun startFaceService() {
        (requireActivity() as MainActivity).startFaceService()
    }

    fun stopFaceService() {
        (requireActivity() as MainActivity).stopFaceService()
    }

    fun registerMyReceiver() {
        (requireActivity() as MainActivity).registerMyReceiver()
    }

    fun unRegisterMyReceiver() {
        (requireActivity() as MainActivity).unRegisterMyReceiver()
    }

    fun setAiUseCheck(check: Boolean) {
        (requireActivity() as MainActivity).aiUseCheck = check
    }

    fun setReTakeCheck(check: Boolean) {
        (requireActivity() as MainActivity).reTakeCheck = check
    }
}