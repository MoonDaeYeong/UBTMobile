package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.nsdevil.ubtmobilev3.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToOrgFragment(
    public val orgData: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_homeFragment_to_orgFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("orgData", this.orgData)
      return result
    }
  }

  private data class ActionHomeFragmentToMoreFragment(
    public val category: String,
    public val subClass: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_homeFragment_to_moreFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("category", this.category)
      result.putString("subClass", this.subClass)
      return result
    }
  }

  public companion object {
    public fun actionHomeFragmentToStandByFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_standByFragment)

    public fun actionHomeFragmentToOrgFragment(orgData: String): NavDirections =
        ActionHomeFragmentToOrgFragment(orgData)

    public fun actionHomeFragmentToMoreFragment(category: String, subClass: String): NavDirections =
        ActionHomeFragmentToMoreFragment(category, subClass)
  }
}
