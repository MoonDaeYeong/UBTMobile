package com.nsdevil.ubtmobilev3.ui.setting

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.nsdevil.ubtmobilev3.R

public class SettingHomeFragmentDirections private constructor() {
  public companion object {
    public fun actionSettingHomeFragmentToEditProfileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_settingHomeFragment_to_editProfileFragment)

    public fun actionSettingHomeFragmentToPassChangeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_settingHomeFragment_to_passChangeFragment)
  }
}
