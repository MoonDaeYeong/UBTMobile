package com.nsdevil.ubtmobilev3.dialog

import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.databinding.DialogTextInputBinding

class TextInputDialog(context: Context, private val lifecycleOwner: LifecycleOwner, private val inputString: (String) -> Unit) : AlertDialog(context, R.style.AlertDialogLightX) {

    private lateinit var binding: DialogTextInputBinding

    private val modelInAnim: Animation by lazy { AnimationUtils.loadAnimation(context, R.anim.modal_in) }

    private val titleStr = MutableLiveData<String>()
    private val confirmStr = MutableLiveData<String>()
    private val cancelStr = MutableLiveData<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogTextInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnAction()
        subscribeUi()
    }

    private fun btnAction() {
        binding.btnConfirm.setOnClickListener {
            if(binding.etTextCode.text.isNullOrEmpty())
                binding.etTextCode.error = "is Empty"
            else {
                inputString(binding.etTextCode.text.toString())
                dismiss()
            }
        }
        binding.btnClose.setOnClickListener {
            dismiss()
        }
    }

    private fun subscribeUi() {
        titleStr.observe(lifecycleOwner) {
            binding.tvTitle.text = it
        }
        confirmStr.observe(lifecycleOwner) {
            binding.btnConfirm.text = it
        }
        cancelStr.observe(lifecycleOwner) {
            binding.btnClose.text = it
        }
    }

    fun setTitle(title: String) {
        titleStr.postValue(title)
    }

    fun setConfirm(confirm: String) {
        confirmStr.postValue(confirm)
    }

    fun setCancel(cancel: String) {
        cancelStr.postValue(cancel)
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