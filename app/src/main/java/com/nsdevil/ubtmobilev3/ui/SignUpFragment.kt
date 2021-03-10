package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.databinding.FragmentSignUpBinding
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog
import com.nsdevil.ubtmobilev3.viewmodels.SignUpViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpFragment : BaseFragment() {

    private lateinit var binding: FragmentSignUpBinding

    private val viewModel: SignUpViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        context ?: return binding.root

        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {
        binding.apply {

            btnSignUp.setOnClickListener {
                val name = etName.text.toString()
                val email = etEmail.text.toString()
                val pw = etPassword.text.toString()

                if(!validate(name, email, pw)) {
                    btnSignUp.isEnabled = true
                } else {
                    viewModel.signUp(name, email, pw)
                    btnSignUp.isEnabled = false
                }
            }

            btnBackToLogin.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }

    private fun subscribeUi() {
        with(viewModel) {
            viewLoading.observe(viewLifecycleOwner) { if(it) showLoading() else hideLoading() }
            getThrowable.observe(viewLifecycleOwner) {
                customThrowableHandle(it)
                binding.btnSignUp.isEnabled = true
            }

            signResult.observe(viewLifecycleOwner) {
                if(it.success)
                    simpleDialog("Success", "Sign up complete", ZAlertDialog.SUCCESS_TYPE)
                else if (!it.success)
                    simpleDialog("Warning", it.message, ZAlertDialog.WARNING_TYPE)
            }
        }
    }

    private fun validate(name: String?, email:String?, pw: String?) : Boolean {
        var valid = true
        if(name.isNullOrEmpty() || name.length < 2 ) {
            binding.etName.error = "enter a valid Name"
            valid = false
        } else {
            binding.etName.error = null
        }
        if(email.isNullOrEmpty() || email.length < 3 || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.etEmail.error = "Please make sure the email format is correct."
            valid = false
        } else {
            binding.etEmail.error = null
        }
        if(pw.isNullOrEmpty() || pw.length < 6 || pw.length > 10) {
            binding.etPassword.error = "between 6 and 10 alphanumeric characters"
            valid = false
        } else {
            binding.etPassword.error = null
        }

        return valid
    }
}