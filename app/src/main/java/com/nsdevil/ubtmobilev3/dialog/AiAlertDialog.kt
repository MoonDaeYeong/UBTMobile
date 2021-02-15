package com.nsdevil.ubtmobilev3.dialog

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AlertDialog
import com.bumptech.glide.Glide
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.databinding.DialogZAlertBinding

class AiAlertDialog( context: Context, private val title: String, private val msg: String, private val type: Int ) : AlertDialog(context, R.style.AlertDialogLightX) {

    private lateinit var binding: DialogZAlertBinding

    private val modelInAnim: Animation by lazy {
        AnimationUtils.loadAnimation( context, R.anim.modal_in )
    }

    private var singleEventListener: SingleEventListener? = null

    fun setSingleEventListener(singleEventListener: SingleEventListener) {
        this::singleEventListener.set(singleEventListener)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogZAlertBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnAction()
        subscribeUi()
    }

    private fun btnAction() {
        binding.confirm.setOnClickListener {
            singleEventListener?.confirmClick(this)
        }
    }

    private fun subscribeUi() {

        binding.title.text = title
        binding.title.visibility = View.VISIBLE

        binding.message.text = msg
        binding.message.visibility = View.VISIBLE

        binding.confirm.text = "OK"
        binding.confirm.visibility = View.VISIBLE

        binding.cancel.visibility = View.GONE

        setType(type)
    }

    private fun setType(type: Int) {

        binding.layoutSuccess.visibility = View.GONE
        binding.layoutWarning.visibility = View.GONE
        binding.layoutError.visibility = View.GONE
        binding.layoutProgress.visibility = View.GONE

        when (type) {
            SUCCESS_TYPE -> {
                binding.layoutSuccess.visibility = View.VISIBLE
            }
            WARNING_TYPE -> {
                binding.layoutWarning.visibility = View.VISIBLE
            }
            ERROR_TYPE -> {
                binding.layoutError.visibility = View.VISIBLE
            }
            PROGRESS_TYPE -> {
                binding.layoutProgress.visibility = View.VISIBLE
                Glide.with(binding.root).load(R.drawable.loading_ubt).into(binding.loading)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        binding.root.startAnimation(modelInAnim)
    }

    interface SingleEventListener {
        fun confirmClick(dialogSelf: AiAlertDialog)
    }

    companion object {
        const val SUCCESS_TYPE = 1
        const val WARNING_TYPE = 2
        const val ERROR_TYPE = 3
        const val PROGRESS_TYPE = 4
    }
}