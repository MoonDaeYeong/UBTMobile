package com.nsdevil.ubtmobilev3.dialog

import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.LifecycleOwner
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.databinding.DialogAddTimeBinding

class AddTimeDialog(context: Context, private val inputString:(String) -> Unit) : AlertDialog(context, R.style.AlertDialogLightX) {

    private lateinit var binding: DialogAddTimeBinding

    private val modelInAnim: Animation by lazy { AnimationUtils.loadAnimation(context, R.anim.modal_in) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogAddTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnAction()
    }

    private fun btnAction() {
        binding.btnClose.setOnClickListener {
            dismiss()
        }

        binding.btnConfirm.setOnClickListener {
            if(binding.etAdminCode.text.isNullOrEmpty()) {
                binding.etAdminCode.error = "is Empty"
            } else if (binding.etTextCode.text.isNullOrEmpty()) {
                binding.etTextCode.error = "is Empty"
            } else if (binding.etAdminCode.text.toString() != "1878") {
                binding.etAdminCode.error = "Admin Code Error"
            } else if (binding.etAdminCode.text.toString() == "1878" && !binding.etTextCode.text.isNullOrEmpty()) {
                inputString(binding.etTextCode.text.toString())
                dismiss()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        binding.root.startAnimation(modelInAnim)
    }

    override fun show() {
        super.show()
        window?.clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM)
        window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
    }
}