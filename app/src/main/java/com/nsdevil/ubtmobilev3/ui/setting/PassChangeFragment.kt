package com.nsdevil.ubtmobilev3.ui.setting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.databinding.FragmentPassChangeBinding
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog
import com.nsdevil.ubtmobilev3.ui.SettingFragment
import com.nsdevil.ubtmobilev3.utilities.ZIP_DATA_API_URL
import com.nsdevil.ubtmobilev3.viewmodels.SettingViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PassChangeFragment : BaseFragment() {

    private lateinit var binding: FragmentPassChangeBinding

    private val settingFragment get() = parentFragment?.parentFragment as SettingFragment

    private val viewModel: SettingViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentPassChangeBinding.inflate(inflater,container,false)
        context ?: return binding.root

        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {
        binding.apply {
            tvName.text = settingFragment.profileForm.userName

            btnSaveChange.setOnClickListener {
                val currentPw = etCurrentPw.text.toString()
                val newPw = etNewPw.text.toString()
                val repeatPw = etRepeatPw.text.toString()

                if(!validate(currentPw, newPw, repeatPw)) {
                    btnSaveChange.isEnabled = true
                } else {
                    btnSaveChange.isEnabled = false
                    viewModel.changePassword(currentPw,newPw)
                }
            }
        }
    }

    private fun subscribeUi() {
        with(viewModel) {
            viewLoading.observe(viewLifecycleOwner) { if(it) showLoading() else hideLoading() }
            getThrowable.observe(viewLifecycleOwner) {
                customThrowableHandle(it)
                binding.btnSaveChange.isEnabled = true
            }

            passChangeResult.observe(viewLifecycleOwner) {
                if(it.success)
                    simpleDialog("Success", it.message, ZAlertDialog.SUCCESS_TYPE)
                else {
                    simpleDialog("Warning", it.message, ZAlertDialog.WARNING_TYPE)
                    binding.btnSaveChange.isEnabled = true
                }

            }
        }
    }

    private fun validate(currentPw: String, newPw: String, repeatPw: String): Boolean {
        var valid = true

        if(currentPw.isEmpty() || currentPw.length < 6 || currentPw.length > 10) {
            binding.tilCurrentPw.error = "between 6 and 10 alphanumeric characters"
            valid = false
        } else {
            binding.tilCurrentPw.error = null
        }

        if(newPw.isEmpty() || newPw.length < 6 || newPw.length > 10) {
            binding.tilNewPw.error = "between 6 and 10 alphanumeric characters"
            valid = false
        } else {
            binding.tilNewPw.error = null
        }

        if(repeatPw.isEmpty() || repeatPw.length < 6 || repeatPw.length > 10) {
            binding.tilRepeatPw.error = "between 6 and 10 alphanumeric characters"
            valid = false
        } else {
            binding.tilRepeatPw.error = null
        }

        if(newPw != repeatPw) {
            simpleDialog("Warning", "Please check newPw and RepeatPw again.", ZAlertDialog.WARNING_TYPE)
            valid = false
        }

        return valid
    }
}