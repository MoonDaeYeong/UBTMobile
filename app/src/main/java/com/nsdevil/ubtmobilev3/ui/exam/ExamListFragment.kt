package com.nsdevil.ubtmobilev3.ui.exam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.adapter.*
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.databinding.FragmentExamListBinding
import com.nsdevil.ubtmobilev3.dialog.TestPreviewDialog
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog
import com.nsdevil.ubtmobilev3.ui.ExamFragment
import com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

class ExamListFragment : Fragment() {

    private lateinit var binding: FragmentExamListBinding

    private val examFragment get() = (parentFragment?.parentFragment as ExamFragment)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        binding = FragmentExamListBinding.inflate(inflater, container, false)
        context ?: return binding.root

        setBindItem()

        return binding.root
    }

    private fun setBindItem() {
        binding.apply {
            val examListViewPagerAdapter = ExamListViewPagerAdapter(this@ExamListFragment)
            vpExamList.adapter = examListViewPagerAdapter

            TabLayoutMediator(tlExamList, vpExamList) {tab, position ->
                tab.customView = setCustomTab(position)
            }.attach()

            btnPreview.setOnClickListener {
                val dialog = TestPreviewDialog()
                dialog.show(childFragmentManager, null)
            }

            btnSubmission.setOnClickListener {
                onShowSubmitDialog()
            }

            tlExamList.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    tab?.let {
                        when(it.position) {
                            WHOLE_PAGE_INDEX -> binding.tvTabCategoryInfo.text = "Whole Questions"
                            COMPLETED_PAGE_INDEX -> binding.tvTabCategoryInfo.text = "Completed Questions"
                            UNCOMPLETED_PAGE_INDEX -> binding.tvTabCategoryInfo.text = "UnCompleted Questions"
                            CHECK_PAGE_INDEX -> binding.tvTabCategoryInfo.text = "Check Questions"
                        }
                    }
                }
                override fun onTabUnselected(tab: TabLayout.Tab?) = Unit
                override fun onTabReselected(tab: TabLayout.Tab?) = Unit
            })
        }
    }

    private fun setCustomTab(position: Int) : View {
        binding.tvTabCategoryInfo.text = "Whole Questions"

        val views = layoutInflater.inflate(R.layout.item_exam_list_tab, null, false)
        val img = views.findViewById<MaterialButton>(R.id.iv_tab_img)
        val text= views.findViewById<TextView>(R.id.tv_tab_text)

        when(position) {
            WHOLE_PAGE_INDEX -> {
                img.setBackgroundResource(R.drawable.bg_whole_question_button)
                text.text = "Whole Question"
            }
            COMPLETED_PAGE_INDEX -> {
                img.setBackgroundResource(R.drawable.bg_completed_button)
                text.text = "Completed"

            }
            UNCOMPLETED_PAGE_INDEX -> {
                img.setBackgroundResource(R.drawable.bg_uncompleted_button)
                text.text = "Uncompleted"
            }
            CHECK_PAGE_INDEX -> {
                img.setBackgroundResource(R.drawable.bg_check_button)
                text.text = "Check"
            }
            else -> {
                img.setBackgroundResource(R.drawable.bg_whole_question_button)
                text.text = "Whole Question"
            }
        }
        return  views
    }

    private fun onShowSubmitDialog() {
        val dialog = ZAlertDialog(requireContext(), viewLifecycleOwner)
        dialog.apply {
            setTitle("Warning")
            setMsg("Once submitted, it cannot be released again.")
            setType(ZAlertDialog.WARNING_TYPE)
            setConfirm("Confirm")
            setCancel("Cancel")
            setMultiEventListener(object : ZAlertDialog.MultiEventLister {
                override fun confirmClick(dialogSelf: ZAlertDialog) {
                    examFragment.submitTest()
                    dialogSelf.dismiss()
                }
                override fun cancelClick(dialogSelf: ZAlertDialog) {
                    dialogSelf.dismiss()
                }
            })
        }.show()
    }
}