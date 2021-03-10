package com.nsdevil.ubtmobilev3.base

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.nsdevil.ubtmobilev3.data.model.CustomErrorBody
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog
import com.nsdevil.ubtmobilev3.services.MyReceiver
import com.nsdevil.ubtmobilev3.services.PoseNetService
import retrofit2.HttpException

abstract class BaseActivity : AppCompatActivity() {

    private lateinit var simpleDialog: ZAlertDialog
    private lateinit var loadingDialog: ZAlertDialog

    private val myReceiver: MyReceiver = MyReceiver()

    val aiAlertCheck get() = myReceiver.aiAlertCheck

    var aiUseCheck = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadingDialog = ZAlertDialog(this, this)
        loadingDialog.setType(ZAlertDialog.PROGRESS_TYPE)
        loadingDialog.setMsg("Loading...")
    }

    fun showLoading() {
        if(!loadingDialog.isShowing)
            loadingDialog.show()
        else {
            loadingDialog.dismiss()
            loadingDialog.show()
        }
    }

    fun hideLoading() {
        if(loadingDialog.isShowing)
            loadingDialog.dismiss()
    }

    fun simpleDialog(title: String, msg: String, type: Int) {
        simpleDialog = ZAlertDialog.getInstance(this, this)
        simpleDialog.apply {
            setTitle(title)
            setMsg(msg)
            setType(type)
            setConfirm("Confirm")

            setSingleEventListener( object : ZAlertDialog.SingleEventListener {
                override fun confirmClick(dialogSelf: ZAlertDialog) {
                    dialogSelf.dismiss()
                }
            })
        }
        simpleDialog.show()
    }

    fun customThrowableHandle(throwable: Throwable) {
        if(throwable.message.toString().contains("HTTP", true)) {
            val httpError = throwable as HttpException
            try {
                val customErrorBody = Gson().fromJson(httpError.response()?.errorBody()?.charStream(), CustomErrorBody::class.java)
                simpleDialog("Warning", customErrorBody.message.toString(), ZAlertDialog.WARNING_TYPE)
            } catch (ex: Exception) {
                Toast.makeText(this, throwable.toString(), Toast.LENGTH_LONG).show()
            }
        } else {
            simpleDialog("Error", throwable.message.toString(), ZAlertDialog.ERROR_TYPE)
        }
    }

    // 바탕 클릭시 키보드 숨기기
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
        return super.dispatchTouchEvent(ev)
    }

    fun startFaceService() {
        if(!aiUseCheck)
            return

        val intent = Intent(applicationContext, PoseNetService::class.java)
        startService(intent)
    }

    fun stopFaceService() {
        if(!aiUseCheck)
            return

        var chkStartService = false
        val manager = (getSystemService(ACTIVITY_SERVICE) as ActivityManager)
        for (service in manager.getRunningServices(Int.MAX_VALUE)) {
            if (PoseNetService::class.java.name == service.service.className) {
                chkStartService = true
            }
        }
        if (chkStartService) {
            val stopService = Intent(baseContext, PoseNetService::class.java)
            stopService(stopService)
        }
    }

    fun registerMyReceiver() {
        if(!aiUseCheck)
            return

        val intentFilter = IntentFilter("com.nsdevil.ubt_headpos_test.intent.action.MESSAGE_PROCESSED")
        intentFilter.addCategory(Intent.CATEGORY_DEFAULT)
        if (myReceiver != null) registerReceiver(myReceiver, intentFilter)
    }

    fun unRegisterMyReceiver() {
        if(!aiUseCheck)
            return

        if (myReceiver != null) unregisterReceiver(myReceiver)
    }
}