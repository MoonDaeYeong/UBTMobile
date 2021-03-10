package com.nsdevil.ubtmobilev3.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.nsdevil.ubtmobilev3.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_homeFragment)

    public fun actionLoginFragmentToSignUpFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_signUpFragment)
  }
}
