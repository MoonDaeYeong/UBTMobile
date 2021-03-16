package com.nsdevil.ubtmobilev3.ui.setting

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.adapter.bindCirclePicUrl
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.databinding.FragmentEditProfileBinding
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog
import com.nsdevil.ubtmobilev3.ui.SettingFragment
import com.nsdevil.ubtmobilev3.utilities.IMAGE_API_URL
import com.nsdevil.ubtmobilev3.viewmodels.SettingViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EditProfileFragment : BaseFragment() {

    private lateinit var binding: FragmentEditProfileBinding

    private val settingFragment get() = parentFragment?.parentFragment as SettingFragment

    private val viewModel: SettingViewModel by viewModels()

    var resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data = result.data
            val imageBitmap = data?.extras?.get("data") as Bitmap

            viewModel.changePicture(imageBitmap, requireContext())

            Glide.with(requireContext()).load(imageBitmap).apply(RequestOptions.circleCropTransform()).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).into(binding.ivPicture)
        }
    }


    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        binding = FragmentEditProfileBinding.inflate(inflater, container, false)
        context ?: return binding.root

        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {
        bindCirclePicUrl(binding.ivPicture, settingFragment.profileForm.imgUrl)
        binding.apply {
            tvEmail.text = settingFragment.profileForm.userEmail
            etName.setText(settingFragment.profileForm.userName)

            btnSaveChange.setOnClickListener {
                val name = binding.etName.text.toString()
                val phoneNumber = binding.etPhoneNumber.text.toString()

                if(!validate(name, phoneNumber)) {
                    btnSaveChange.isEnabled = true
                } else {
                    btnSaveChange.isEnabled = false
                    viewModel.editProfile(name, binding.ccp.selectedCountryCodeWithPlus + phoneNumber)
                }
            }

            btnPicture.setOnClickListener {
                dispatchPictureIntent()
            }
        }
    }

    private fun subscribeUi() {

        with(viewModel) {
            viewLoading.observe(viewLifecycleOwner) { if(it) showLoading() else hideLoading() }
            getThrowable.observe(viewLifecycleOwner) { customThrowableHandle(it) }

            editProfileResult.observe(viewLifecycleOwner) {
                if(it.success)
                    simpleDialog("Success", it.message, ZAlertDialog.SUCCESS_TYPE)
                else
                    simpleDialog("Warning", it.message, ZAlertDialog.WARNING_TYPE)
            }
        }
    }

    private fun validate(name: String, phone: String) : Boolean {
        var valid = true
        if(name.isEmpty() || name.length < 2) {
            binding.etName.error = "input your name"
            valid = false
        } else {
            binding.etName.error = null
        }

        if(phone.isEmpty() || phone.length < 2) {
            binding.etPhoneNumber.error = "input your phoneNumber"
            valid = false
        } else {
            binding.etPhoneNumber.error = null
        }

        return valid
    }

    private fun dispatchPictureIntent() {
        val pm = requireContext().packageManager
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(pm)?.also {
                resultLauncher.launch(takePictureIntent)
            }
        }
    }
}