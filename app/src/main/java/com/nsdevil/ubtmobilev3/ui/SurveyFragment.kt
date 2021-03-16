package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.adapter.SurveyItemViewPagerAdapter
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.data.request.SurveyRequest
import com.nsdevil.ubtmobilev3.data.response.SurveyResponse
import com.nsdevil.ubtmobilev3.databinding.FragmentSurveyBinding
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.viewmodels.SurveyViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlin.math.max

@AndroidEntryPoint
class SurveyFragment : BaseFragment() {

    private lateinit var binding: FragmentSurveyBinding

    private val args: SurveyFragmentArgs by navArgs()
    private val researchList get() = run {
        val researchType = object : TypeToken<List<SurveyResponse.SurveyResult.Researchs>>(){}.type
        Gson().fromJson<List<SurveyResponse.SurveyResult.Researchs>>(args.surveyData, researchType)
    }

    private val viewModel: SurveyViewModel by viewModels()

    val stackResearchList: MutableSet<SurveyRequest.SubResearch> = mutableSetOf()
    val subResearchList: MutableSet<SurveyRequest.SubResearch> = mutableSetOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentSurveyBinding.inflate(inflater, container, false)
        context ?: return binding.root

        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {
        binding.apply {
            val surveyViewPagerAdapter = SurveyItemViewPagerAdapter(this@SurveyFragment, researchList, this@SurveyFragment::getResData )
            vpSurveyList.adapter = surveyViewPagerAdapter

            vpSurveyList.isUserInputEnabled = false

            btnSurvey.setOnClickListener {
                if(btnSurvey.text.toString().equals("Next",true)) {
                    binding.btnSurvey.isEnabled = false
                    nextPage()
                } else {
                    binding.btnSurvey.isEnabled = false
                    submissionPage()
                }
            }
        }
    }

    private fun subscribeUi() {
        with(viewModel) {
            viewLoading.observe(viewLifecycleOwner) { if(it) showLoading() else hideLoading() }
            getThrowable.observe(viewLifecycleOwner) {
                binding.btnSurvey.isEnabled = true
                customThrowableHandle(it)
            }

            surveyResult.observe(viewLifecycleOwner) {
                if(it.success)
                    onShowCompleteDialog()
                else
                    simpleDialog("Warning", it.message, ZAlertDialog.WARNING_TYPE)
            }
        }
    }

    private fun onShowCompleteDialog() {
        val dialog = ZAlertDialog(requireContext(),this)
        dialog.apply {
            setTitle("Success")
            setMsg("Transfer complete \nGo back to the main.")
            setType(ZAlertDialog.SUCCESS_TYPE)
            setConfirm("OK")
            setSingleEventListener(object : ZAlertDialog.SingleEventListener {
                override fun confirmClick(dialogSelf: ZAlertDialog) {
                    dialogSelf.dismiss()
                    findNavController().navigate(R.id.homeFragment)
                }
            })
        }.show()
    }

    private fun nextPage() {
        val maxSize = researchList.size
        val currentPage = binding.vpSurveyList.currentItem
        binding.vpSurveyList.setCurrentItem(currentPage+1, true)

        if(binding.vpSurveyList.currentItem == maxSize-1)
            binding.btnSurvey.text = "Submission"
    }

    private fun submissionPage() {
        subResearchList.add(stackResearchList.last())
        val surveyRequest = SurveyRequest(examId = CommonUtils.userExam.examId, examName = CommonUtils.userExam.examName, examCode = CommonUtils.userExam.examCode, researchs = subResearchList.toList())
        viewModel.sendSurvey(surveyRequest)
    }

    private fun getResData(resData: SurveyRequest.SubResearch) {
        stackResearchList.add(resData)
        binding.vpSurveyList.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                subResearchList.add(stackResearchList.last())
                binding.btnSurvey.isEnabled = true
            }
        })
    }
}