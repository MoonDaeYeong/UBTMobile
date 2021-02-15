package com.nsdevil.ubtmobilev3.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nsdevil.ubtmobilev3.ui.exam.TestQuestionFragment
import com.nsdevil.ubtmobilev3.utilities.CommonUtils


class ExamTestViewPagerAdapter (fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = CommonUtils.totalQuestionNumber

    override fun createFragment(position: Int): Fragment {
        return TestQuestionFragment(position)
    }
}