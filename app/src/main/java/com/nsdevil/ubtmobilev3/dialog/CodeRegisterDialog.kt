package com.nsdevil.ubtmobilev3.dialog

import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AlertDialog
import androidx.core.widget.addTextChangedListener
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.databinding.DialogCodeRegisterBinding

class CodeRegisterDialog (context: Context, private val confirmClick: (String?) -> Unit) : AlertDialog(context, R.style.AlertDialogLightX) {

    private lateinit var binding: DialogCodeRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogCodeRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
        subscribeUi()
    }

    private fun subscribeUi() {
        binding.apply {
            btnClose.setOnClickListener {
                dismiss()
            }

            btnConfirm.setOnClickListener {
                confirmClick(etExamCode.text.toString())
                dismiss()
            }
        }
    }
}