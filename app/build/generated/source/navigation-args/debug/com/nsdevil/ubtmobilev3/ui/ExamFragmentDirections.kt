package com.nsdevil.ubtmobilev3.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.nsdevil.ubtmobilev3.R

public class ExamFragmentDirections private constructor() {
  public companion object {
    public fun actionExamFragmentToExamFinishFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_examFragment_to_examFinishFragment)
  }
}
