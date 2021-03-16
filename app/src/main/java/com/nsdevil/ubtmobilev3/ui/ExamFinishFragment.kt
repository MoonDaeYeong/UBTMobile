package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.data.response.SurveyResponse
import com.nsdevil.ubtmobilev3.databinding.FragmentExamFinishBinding
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.viewmodels.ExamFinishViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExamFinishFragment : BaseFragment() {

    private lateinit var binding: FragmentExamFinishBinding

    private val viewModel: ExamFinishViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentExamFinishBinding.inflate(inflater,container,false)
        context ?: return binding.root

        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {
        binding.apply {
            btnGoHome.setOnClickListener {
                findNavController().navigate(R.id.homeFragment)
            }

            btnSurvey.setOnClickListener {
                viewModel.surveyResult.value?.result?.researchs?.let { research ->
                    navigateToSurvey(research)
                }
            }
        }
    }

    private fun navigateToSurvey(researchs: List<SurveyResponse.SurveyResult.Researchs>) {

        val directions = ExamFinishFragmentDirections.actionExamFinishFragmentToSurveyFragment(Gson().toJson(researchs))
        findNavController().navigate(directions)
    }

    private fun subscribeUi() {
        with(viewModel) {
            viewLoading.observe(viewLifecycleOwner) { if(it) showLoading() else hideLoading() }
            getThrowable.observe(viewLifecycleOwner) { customThrowableHandle(it) }

            getSurveyItem(CommonUtils.userExam.examId)

            surveyResult.observe(viewLifecycleOwner) { surveyResult ->

                if(surveyResult.result.researchs.isNullOrEmpty()) {
                    binding.tvSurveyInfo.visibility = View.GONE
                    binding.btnSurvey.visibility = View.GONE
                    binding.tvNoSurvey.visibility = View.VISIBLE
                } else {
                    binding.tvSurveyInfo.visibility = View.VISIBLE
                    binding.btnSurvey.visibility = View.VISIBLE
                    binding.tvNoSurvey.visibility = View.GONE
                }
            }
        }
    }
}