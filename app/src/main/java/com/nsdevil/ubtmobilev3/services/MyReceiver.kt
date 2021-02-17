package com.nsdevil.ubtmobilev3.services

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.lifecycle.MutableLiveData
import com.nsdevil.ubtmobilev3.dialog.AiAlertDialog
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog

class MyReceiver : BroadcastReceiver() {

    private var headCount = 30
    private var facialCount = 30
    private var onShowCheck = false

    val aiAlertCheck = MutableLiveData(false)

    override fun onReceive(context: Context, intent: Intent) {
        val text = intent.getStringExtra("omsg")

        if (text == "Left" || text == "Right") {
            headCount -= 1
        } else if (text == "0") {
            facialCount -= 1
        }

        if (headCount == 0) {
            onFaceDialog(context, "고개를 돌리지 마세요.")
        } else if (facialCount == 0) {
            onFaceDialog(context, "자리를 비우지 마세요.")
        }
    }

    private fun onFaceDialog(ctx: Context, msg: String) {
        val zDialog = AiAlertDialog(ctx, "경고", msg, ZAlertDialog.WARNING_TYPE)
        zDialog.setSingleEventListener(object : AiAlertDialog.SingleEventListener {
            override fun confirmClick(dialogSelf: AiAlertDialog) {
                onShowCheck = false
                headCount = 30
                facialCount = 30
                dialogSelf.dismiss()
                aiAlertCheck.postValue(false)
            }
        })
        if(!onShowCheck) {
            onShowCheck = true
            aiAlertCheck.postValue(true)
            zDialog.show()
        }
    }
}