package com.nsdevil.ubtmobilev3.dialog

import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.databinding.DialogOrgRegisterBinding

class OrgRegisterDialog(context: Context, private val yesAction:(AlertDialog) -> Unit): AlertDialog(context, R.style.AlertDialogLightX) {

    private lateinit var binding: DialogOrgRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.dialog_org_register, null, false)
        setContentView(binding.root)
        setCancelable(false)

        setBind()
    }

    private fun setBind() {
        binding.btnYes.setOnClickListener {
            yesAction(this)
        }

        binding.btnNo.setOnClickListener {
            dismiss()
        }
    }

    override fun show() {
        super.show()
        showCheck = true
    }

    override fun dismiss() {
        super.dismiss()
        showCheck = false
    }

    companion object {
        var showCheck = false
    }
}