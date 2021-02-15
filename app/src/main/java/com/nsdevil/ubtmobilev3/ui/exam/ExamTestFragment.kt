package com.nsdevil.ubtmobilev3.ui.exam

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.adapter.ExamTestViewPagerAdapter
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.databinding.FragmentExamTestBinding
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog
import com.nsdevil.ubtmobilev3.ui.ExamFragment
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ExamTestFragment : BaseFragment() {

    private lateinit var binding: FragmentExamTestBinding

    private val viewModel: ExamViewModel by viewModels()

    private val args: ExamTestFragmentArgs by navArgs()

    private val examFragment get() = parentFragment?.parentFragment as ExamFragment

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentExamTestBinding.inflate(inflater,container,false)
        context ?: return binding.root

        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {
        val adapter = ExamTestViewPagerAdapter(this)
        var index = args.initPosition
        binding.apply {
            childFragmentManager.beginTransaction().replace(R.id.container, adapter.createFragment(index)).addToBackStack(null).commit()

            llAllQuestion.setOnClickListener {
                updateAnswer(999)
            }
            llPrev.setOnClickListener {
                if (index <= 0) {
                    index = 0
                    simpleDialog("Warning", "First Page", ZAlertDialog.WARNING_TYPE)
                } else {
                    index -= 1
                    updateAnswer(index)
                }
            }
            llNext.setOnClickListener {
                if (index >= CommonUtils.totalQuestionNumber-1) {
                    index = CommonUtils.totalQuestionNumber-1
                    simpleDialog("Warning", "Last Page", ZAlertDialog.WARNING_TYPE)
                } else {
                    index += 1
                    updateAnswer(index)
                }
            }
            llCheck.setOnClickListener {
                viewModel.updateUserCheck(index)
            }
        }

    }

    private fun updateAnswer(index: Int) {
        examFragment.stopPlayerEvent()

        childFragmentManager.fragments.forEach {
            viewModel.updateAnswer((it as TestQuestionFragment).updateAnswerList, index, examFragment.stayingTime)
        }
    }

    private fun subscribeUi() {
        with(viewModel) {
            updateCompleted.observe(viewLifecycleOwner) {
                if(it != 999) {
                    showQuizPage(it)
                } else {
                    findNavController().popBackStack()
                }
                examFragment.stayingTime = 0
            }
        }
    }

    private fun showQuizPage(index: Int) {
        val adapter = ExamTestViewPagerAdapter(this)
        childFragmentManager.beginTransaction().replace(R.id.container, adapter.createFragment(index)).addToBackStack(null).commit()
    }
}