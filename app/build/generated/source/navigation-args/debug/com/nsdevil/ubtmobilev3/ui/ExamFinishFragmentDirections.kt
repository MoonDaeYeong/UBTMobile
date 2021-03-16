package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import androidx.navigation.NavDirections
import com.nsdevil.ubtmobilev3.R
import kotlin.Int
import kotlin.String

public class ExamFinishFragmentDirections private constructor() {
  private data class ActionExamFinishFragmentToSurveyFragment(
    public val surveyData: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_examFinishFragment_to_surveyFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("surveyData", this.surveyData)
      return result
    }
  }

  public companion object {
    public fun actionExamFinishFragmentToSurveyFragment(surveyData: String): NavDirections =
        ActionExamFinishFragmentToSurveyFragment(surveyData)
  }
}
