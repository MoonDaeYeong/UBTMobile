package com.nsdevil.ubtmobilev3.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nsdevil.ubtmobilev3.ui.exam.CategoryFragment


const val WHOLE_PAGE_INDEX = 0
const val COMPLETED_PAGE_INDEX = 1
const val UNCOMPLETED_PAGE_INDEX = 2
const val CHECK_PAGE_INDEX = 3

class ExamListViewPagerAdapter (fragment: Fragment) : FragmentStateAdapter(fragment) {

    private val tabFragmentCreators: Map<Int, () -> Fragment> = mapOf(
        WHOLE_PAGE_INDEX to { CategoryFragment(WHOLE_PAGE_INDEX) },
        COMPLETED_PAGE_INDEX to { CategoryFragment(COMPLETED_PAGE_INDEX) },
        UNCOMPLETED_PAGE_INDEX to { CategoryFragment(UNCOMPLETED_PAGE_INDEX) },
        CHECK_PAGE_INDEX to { CategoryFragment(CHECK_PAGE_INDEX) }
    )

    override fun getItemCount(): Int = tabFragmentCreators.size

    override fun createFragment(position: Int): Fragment {
        return tabFragmentCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }
}