package com.nsdevil.ubtmobilev3.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nsdevil.ubtmobilev3.data.request.SurveyRequest
import com.nsdevil.ubtmobilev3.data.response.SurveyResponse
import com.nsdevil.ubtmobilev3.ui.SurveyItemFragment

class SurveyItemViewPagerAdapter (fragment: Fragment, private val researchList: List<SurveyResponse.SurveyResult.Researchs>, private val resData: (SurveyRequest.SubResearch) -> Unit) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = researchList.size

    override fun createFragment(position: Int): Fragment {
        return SurveyItemFragment(researchList[position], resData)
    }

}