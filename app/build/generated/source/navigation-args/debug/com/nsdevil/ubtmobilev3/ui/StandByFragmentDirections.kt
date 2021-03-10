package com.nsdevil.ubtmobilev3.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.nsdevil.ubtmobilev3.R

public class StandByFragmentDirections private constructor() {
  public companion object {
    public fun actionStandByFragmentToExamFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_standByFragment_to_examFragment)
  }
}
