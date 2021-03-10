package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class OrgFragmentArgs(
  public val orgData: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("orgData", this.orgData)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): OrgFragmentArgs {
      bundle.setClassLoader(OrgFragmentArgs::class.java.classLoader)
      val __orgData : String?
      if (bundle.containsKey("orgData")) {
        __orgData = bundle.getString("orgData")
        if (__orgData == null) {
          throw IllegalArgumentException("Argument \"orgData\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orgData\" is missing and does not have an android:defaultValue")
      }
      return OrgFragmentArgs(__orgData)
    }
  }
}
