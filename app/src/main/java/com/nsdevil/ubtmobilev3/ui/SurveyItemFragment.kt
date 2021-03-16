package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import com.nsdevil.ubtmobilev3.adapter.SurveyQuestionAdapter
import com.nsdevil.ubtmobilev3.data.request.SurveyRequest
import com.nsdevil.ubtmobilev3.data.response.SurveyResponse
import com.nsdevil.ubtmobilev3.databinding.FragmentSurveyItemBinding

class SurveyItemFragment(private val research: SurveyResponse.SurveyResult.Researchs, val resData: (SurveyRequest.SubResearch) -> Unit) : Fragment() {

    private lateinit var binding: FragmentSurveyItemBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentSurveyItemBinding.inflate(inflater,container,false)
        context ?: return binding.root

        setBindItem()

        return binding.root
    }

    private fun setBindItem() {
        val adapter = SurveyQuestionAdapter(this::getSubQuestionList)

        binding.apply {
            tvTitle.text = research.title
            tvMemo.text = research.memo
            rvQuestions.adapter = adapter
            adapter.submitList(research.questions)
        }

    }

    private fun getSubQuestionList(questions: List<SurveyRequest.SubResearch.SubQuestions>) {
        val research = SurveyRequest.SubResearch(id = research.id, questions= questions)
        resData(research)
    }
}