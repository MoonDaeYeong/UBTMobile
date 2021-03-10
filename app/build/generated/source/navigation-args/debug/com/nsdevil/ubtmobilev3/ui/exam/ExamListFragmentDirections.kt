package com.nsdevil.ubtmobilev3.ui.exam

import android.os.Bundle
import androidx.navigation.NavDirections
import com.nsdevil.ubtmobilev3.R
import kotlin.Int

public class ExamListFragmentDirections private constructor() {
  private data class ActionExamListFragmentToExamTestFragment(
    public val initPosition: Int
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_examListFragment_to_examTestFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("initPosition", this.initPosition)
      return result
    }
  }

  public companion object {
    public fun actionExamListFragmentToExamTestFragment(initPosition: Int): NavDirections =
        ActionExamListFragmentToExamTestFragment(initPosition)
  }
}
