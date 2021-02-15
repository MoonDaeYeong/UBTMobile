package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.nsdevil.ubtmobilev3.BuildConfig
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.databinding.FragmentLoginBinding
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.viewmodels.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment() {

    private lateinit var binding: FragmentLoginBinding

    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        context ?: return binding.root

        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {

        binding.apply {
            tvVersion.text = String.format("Version: %s", BuildConfig.VERSION_NAME)

            btnLogin.setOnClickListener {
               etEmail.setText("test17@nsdevil.com")
               etPassword.setText("123456")
println("체크")
                val email = etEmail.text.toString()
                val password = etPassword.text.toString()

                if(!validate(email,password)) {
                    btnLogin.isEnabled = true
                } else {
                    btnLogin.isEnabled = false
                    viewModel.login(email,password)
                }
            }

            btnSignUp.setOnClickListener {
                val directions = LoginFragmentDirections.actionLoginFragmentToSignUpFragment()
                findNavController().navigate(directions)
            }
        }

    }
    private fun subscribeUi() {
        with(viewModel) {
            viewLoading.observe(viewLifecycleOwner) { if(it) showLoading() else hideLoading() }
            getThrowable.observe(viewLifecycleOwner) {
                customThrowableHandle(it)
                binding.btnLogin.isEnabled = true
            }

            loginResult.observe(viewLifecycleOwner) {
                CommonUtils.setToken(it.tokenType,it.accessToken)
                navigateToHomeFragment()
            }
        }
    }
    
    private fun navigateToHomeFragment() {
        val directions = LoginFragmentDirections.actionLoginFragmentToHomeFragment()
        findNavController().navigate(directions)
    }

    private fun validate(email: String, password: String): Boolean {
        var valid = true
        if (email.isEmpty() || email.length < 3) {
            binding.etEmail.error = "enter a valid Code"
            valid = false
        } else {
            binding.etEmail.error = null
        }
        if (password.isEmpty() || password.length < 6 || password.length > 10) {
            binding.etPassword.error = "between 6 and 10 alphanumeric characters"
            valid = false
        } else {
            binding.etPassword.error = null
        }
        return valid
    }
}