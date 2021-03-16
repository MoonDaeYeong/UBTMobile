package com.nsdevil.ubtmobilev3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nsdevil.ubtmobilev3.data.model.SurveyAnswer
import com.nsdevil.ubtmobilev3.data.request.SurveyRequest
import com.nsdevil.ubtmobilev3.data.response.SurveyResponse
import com.nsdevil.ubtmobilev3.databinding.ListItemSurveyQuestionBinding
import okhttp3.MediaType.Companion.toMediaType

class SurveyQuestionAdapter(val questions: (List<SurveyRequest.SubResearch.SubQuestions>) -> Unit) : ListAdapter<SurveyResponse.SurveyResult.Researchs.SurveyQuestions, RecyclerView.ViewHolder>(SurveyQuestionItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SurveyQuestionViewHolder(ListItemSurveyQuestionBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        (holder as SurveyQuestionViewHolder).bind(item)
    }

    inner class SurveyQuestionViewHolder(private val binding: ListItemSurveyQuestionBinding) : RecyclerView.ViewHolder(binding.root) {

        val adapter = SurveyAnswerAdapter(this::getUpdateAnswer)

        init {
            binding.rvSurveyAnswer.adapter = adapter
        }

        fun bind(item: SurveyResponse.SurveyResult.Researchs.SurveyQuestions) {
            binding.apply {
                question = item

                val answerList: MutableList<SurveyAnswer> = mutableListOf()

                if(item.answers.contains("||")) {
                    val answerSplit = item.answers.split("||")
                    for(i in answerSplit.indices) {
                        if(answerSplit[i] == item.checkedAnswers)
                            answerList.add(SurveyAnswer(id = item.id, no =  i+1, answers = answerSplit[i], userCheck = true, type = item.type))
                        else
                            answerList.add(SurveyAnswer(id = item.id, no =  i+1, answers = answerSplit[i], userCheck = false, type = item.type))
                    }
                } else {
                    if(item.type == 0)
                        answerList.add(SurveyAnswer(id = item.id, no =  1+1, answers = item.answers, type = item.type))
                    else
                        answerList.add(SurveyAnswer(id = item.id, no =  1+1, answers = item.answers, type = item.type, answerText = item.checkedAnswers))
                }
                adapter.submitList(answerList)

                executePendingBindings()
            }
        }

        private fun getUpdateAnswer(surveyAnswer: SurveyAnswer) {

            val questionList :MutableList<SurveyRequest.SubResearch.SubQuestions> = mutableListOf()

            currentList.forEach {
                if(it.id == surveyAnswer.id && surveyAnswer.userCheck) {
                    it.checkedAnswers = surveyAnswer.answers
                }
                if(it.id == surveyAnswer.id && !surveyAnswer.answerText.isNullOrEmpty()) {
                    it.checkedAnswers = surveyAnswer.answerText
                }

                val q = SurveyRequest.SubResearch.SubQuestions(id = it.id, question = it.question, answers = it.answers, checkedAnswers = it.checkedAnswers, type = it.type)
                questionList.add(q)
            }

            questions(questionList)
        }
    }
}

private class SurveyQuestionItemDiffCallback: DiffUtil.ItemCallback<SurveyResponse.SurveyResult.Researchs.SurveyQuestions>() {
    override fun areItemsTheSame(oldItem: SurveyResponse.SurveyResult.Researchs.SurveyQuestions,newItem: SurveyResponse.SurveyResult.Researchs.SurveyQuestions): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: SurveyResponse.SurveyResult.Researchs.SurveyQuestions,newItem: SurveyResponse.SurveyResult.Researchs.SurveyQuestions): Boolean {
        return oldItem == newItem
    }

}