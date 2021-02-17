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
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

class ExamListFragment : BaseFragment() {

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
                            WHOLE_PAGE_INDEX -> binding.tvTabCategoryInfo.text = "전체문제"
                            COMPLETED_PAGE_INDEX -> binding.tvTabCategoryInfo.text = "푼 문제"
                            UNCOMPLETED_PAGE_INDEX -> binding.tvTabCategoryInfo.text = "안푼 문제"
                            CHECK_PAGE_INDEX -> binding.tvTabCategoryInfo.text = "체크한 문제"
                        }
                    }
                }
                override fun onTabUnselected(tab: TabLayout.Tab?) = Unit
                override fun onTabReselected(tab: TabLayout.Tab?) = Unit
            })
        }
    }

    private fun setCustomTab(position: Int) : View {
        binding.tvTabCategoryInfo.text = "전체 문제"

        val views = layoutInflater.inflate(R.layout.item_exam_list_tab, null, false)
        val img = views.findViewById<MaterialButton>(R.id.iv_tab_img)
        val text= views.findViewById<TextView>(R.id.tv_tab_text)

        when(position) {
            WHOLE_PAGE_INDEX -> {
                img.setBackgroundResource(R.drawable.bg_whole_question_button)
                text.text = "전체 문제"
            }
            COMPLETED_PAGE_INDEX -> {
                img.setBackgroundResource(R.drawable.bg_completed_button)
                text.text = "푼 문제"
            }
            UNCOMPLETED_PAGE_INDEX -> {
                img.setBackgroundResource(R.drawable.bg_uncompleted_button)
                text.text = "안푼 문제"
            }
            CHECK_PAGE_INDEX -> {
                img.setBackgroundResource(R.drawable.bg_check_button)
                text.text = "체크한 문제"
            }
            else -> {
                img.setBackgroundResource(R.drawable.bg_whole_question_button)
                text.text = "전체 문제"
            }
        }
        return  views
    }

    private fun onShowSubmitDialog() {
        with(CommonUtils) {
            if(remainQuestionNumber != 0) {
                simpleDialog("경고", "남은문제를 풀어주세요.", ZAlertDialog.WARNING_TYPE)
            } else {
                val dialog = ZAlertDialog(requireContext(), viewLifecycleOwner)
                dialog.apply {
                    setTitle("경고")
                    setMsg("제출하면 시험이 종료되고, 다시 푸실수 없습니다.")
                    setType(ZAlertDialog.WARNING_TYPE)
                    setConfirm("확인")
                    setCancel("취소")
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
    }
}