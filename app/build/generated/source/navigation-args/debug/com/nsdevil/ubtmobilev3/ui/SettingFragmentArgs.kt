package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SettingFragmentArgs(
  public val ProfileDataString: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("ProfileDataString", this.ProfileDataString)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SettingFragmentArgs {
      bundle.setClassLoader(SettingFragmentArgs::class.java.classLoader)
      val __ProfileDataString : String?
      if (bundle.containsKey("ProfileDataString")) {
        __ProfileDataString = bundle.getString("ProfileDataString")
        if (__ProfileDataString == null) {
          throw IllegalArgumentException("Argument \"ProfileDataString\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"ProfileDataString\" is missing and does not have an android:defaultValue")
      }
      return SettingFragmentArgs(__ProfileDataString)
    }
  }
}
