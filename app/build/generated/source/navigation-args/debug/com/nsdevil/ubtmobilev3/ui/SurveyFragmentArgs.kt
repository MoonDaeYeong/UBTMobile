package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SurveyFragmentArgs(
  public val surveyData: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("surveyData", this.surveyData)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SurveyFragmentArgs {
      bundle.setClassLoader(SurveyFragmentArgs::class.java.classLoader)
      val __surveyData : String?
      if (bundle.containsKey("surveyData")) {
        __surveyData = bundle.getString("surveyData")
        if (__surveyData == null) {
          throw IllegalArgumentException("Argument \"surveyData\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"surveyData\" is missing and does not have an android:defaultValue")
      }
      return SurveyFragmentArgs(__surveyData)
    }
  }
}
