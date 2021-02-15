package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class MoreFragmentArgs(
  public val category: String,
  public val subClass: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("category", this.category)
    result.putString("subClass", this.subClass)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): MoreFragmentArgs {
      bundle.setClassLoader(MoreFragmentArgs::class.java.classLoader)
      val __category : String?
      if (bundle.containsKey("category")) {
        __category = bundle.getString("category")
        if (__category == null) {
          throw IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue")
      }
      val __subClass : String?
      if (bundle.containsKey("subClass")) {
        __subClass = bundle.getString("subClass")
        if (__subClass == null) {
          throw IllegalArgumentException("Argument \"subClass\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"subClass\" is missing and does not have an android:defaultValue")
      }
      return MoreFragmentArgs(__category, __subClass)
    }
  }
}
