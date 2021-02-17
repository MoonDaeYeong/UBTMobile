package com.nsdevil.ubtmobilev3.dialog

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import com.bumptech.glide.Glide
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.databinding.DialogZAlertBinding

class ZAlertDialog(context: Context, private val lifecycleOwner: LifecycleOwner) : AlertDialog(context, R.style.AlertDialogLightX) {

    private lateinit var binding: DialogZAlertBinding

    private val modelInAnim: Animation by lazy { AnimationUtils.loadAnimation(context, R.anim.modal_in) }

    private var singleEventListener: SingleEventListener? = null

    private var multiEventLister: MultiEventLister? = null

    private val titleStr = MutableLiveData<String>()
    private val msgStr = MutableLiveData<String>()
    private val confirmStr = MutableLiveData<String>()
    private val cancelStr = MutableLiveData<String>()
    private val typeInt = MutableLiveData<Int>()

    fun setSingleEventListener(singleEventListener: SingleEventListener) {
        this::singleEventListener.set(singleEventListener)
    }

    fun setMultiEventListener(multiEventLister: MultiEventLister) {
        this::multiEventLister.set(multiEventLister)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.dialog_z_alert, null, false)
//        binding = DialogZAlertBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnAction()
        subscribeUi()
    }

    private fun btnAction() {
        binding.confirm.setOnClickListener {
            singleEventListener?.confirmClick(this)
            multiEventLister?.confirmClick(this)

            binding.title.visibility = View.GONE
            binding.message.visibility = View.GONE
            binding.confirm.visibility = View.GONE
            binding.cancel.visibility = View.GONE
            typeInt.postValue(0)
        }

        binding.cancel.setOnClickListener {
            multiEventLister?.cancelClick(this)

            binding.title.visibility = View.GONE
            binding.message.visibility = View.GONE
            binding.confirm.visibility = View.GONE
            binding.cancel.visibility = View.GONE
            typeInt.postValue(0)
        }
    }

    private fun subscribeUi() {
        titleStr.observe(lifecycleOwner) {
            if(!it.isNullOrEmpty()){
                binding.title.text = it
                binding.title.visibility = View.VISIBLE
            } else
                binding.title.visibility = View.GONE
        }

        msgStr.observe(lifecycleOwner) {
            if(!it.isNullOrEmpty()){
                binding.message.text = it
                binding.message.visibility = View.VISIBLE
            } else
                binding.message.visibility = View.GONE
        }

        confirmStr.observe(lifecycleOwner) {
            if(!it.isNullOrEmpty()) {
                binding.confirm.text = it
                binding.confirm.visibility = View.VISIBLE
            } else
                binding.confirm.visibility = View.GONE
        }

        cancelStr.observe(lifecycleOwner) {
            if(!it.isNullOrEmpty()) {
                binding.cancel.text = it
                binding.cancel.visibility = View.VISIBLE
            }
            else
                binding.confirm.visibility = View.GONE
        }

        typeInt.observe(lifecycleOwner) {
            binding.layoutSuccess.visibility = View.GONE
            binding.layoutWarning.visibility = View.GONE
            binding.layoutError.visibility = View.GONE
            binding.layoutProgress.visibility = View.GONE

            when(it) {
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
    }

    fun setTitle(title: String) {
        titleStr.postValue(title)
    }
    fun setMsg(msg: String) {
        msgStr.postValue(msg)
    }
    fun setConfirm(confirm: String) {
        confirmStr.postValue(confirm)
    }
    fun setCancel(cancel: String) {
        cancelStr.postValue(cancel)
    }
    fun setType(type: Int) {
        typeInt.postValue(type)
    }

    override fun onStart() {
        super.onStart()
        binding.root.startAnimation(modelInAnim)
    }

    interface SingleEventListener {
        fun confirmClick(dialogSelf: ZAlertDialog)
    }

    interface MultiEventLister {
        fun confirmClick(dialogSelf: ZAlertDialog)
        fun cancelClick(dialogSelf: ZAlertDialog)
    }

    companion object {
        const val SUCCESS_TYPE = 1
        const val WARNING_TYPE = 2
        const val ERROR_TYPE = 3
        const val PROGRESS_TYPE = 4

        @Volatile
        private var instance: ZAlertDialog? = null

        fun getInstance(context: Context, lifecycleOwner: LifecycleOwner): ZAlertDialog {
            return instance ?: synchronized(this) {
                instance ?: ZAlertDialog(context, lifecycleOwner).also { instance = it }
            }
        }
    }
}