package com.nsdevil.ubtmobilev3.ui.exam

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class ExamTestFragmentArgs(
  public val initPosition: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("initPosition", this.initPosition)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ExamTestFragmentArgs {
      bundle.setClassLoader(ExamTestFragmentArgs::class.java.classLoader)
      val __initPosition : Int
      if (bundle.containsKey("initPosition")) {
        __initPosition = bundle.getInt("initPosition")
      } else {
        throw IllegalArgumentException("Required argument \"initPosition\" is missing and does not have an android:defaultValue")
      }
      return ExamTestFragmentArgs(__initPosition)
    }
  }
}
