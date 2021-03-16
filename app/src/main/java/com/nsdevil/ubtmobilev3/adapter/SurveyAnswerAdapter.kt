package com.nsdevil.ubtmobilev3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nsdevil.ubtmobilev3.data.model.SurveyAnswer
import com.nsdevil.ubtmobilev3.databinding.ListItemSurveyAnswerBinding
import com.nsdevil.ubtmobilev3.databinding.ListItemSurveyAnswerTxtBinding

class SurveyAnswerAdapter(val itemClick: (SurveyAnswer) -> Unit) : ListAdapter<SurveyAnswer, RecyclerView.ViewHolder>(SurveyAnswerItemDiffCallback())  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val surveyAnswer = SurveyAnswerViewHolder(ListItemSurveyAnswerBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        val surveyAnswerText = SurveyAnswerTxtViewHolder(ListItemSurveyAnswerTxtBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        return if(viewType == 0) surveyAnswer else surveyAnswerText
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        if(item.type == 0)
            (holder as SurveyAnswerViewHolder).bind(item)
        else
            (holder as SurveyAnswerTxtViewHolder).bind(item)
    }

    override fun getItemViewType(position: Int): Int {
        return currentList[position].type
    }

    inner class SurveyAnswerViewHolder(private val binding: ListItemSurveyAnswerBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.setClickListener {
                binding.answer?.let { answer ->
                    answer.userCheck = !answer.userCheck
                    subscribeButton(answer)
                    itemClick(answer)
                }
            }
        }

        fun bind(item: SurveyAnswer) {
            binding.apply {
                answer = item
                executePendingBindings()
            }
        }

        private fun subscribeButton(answer: SurveyAnswer) {
            currentList.forEach { surveyAnswer ->
                if(answer.no == surveyAnswer.no) {
                    surveyAnswer.userCheck = answer.userCheck
                } else {
                    surveyAnswer.userCheck = false
                }
            }
            notifyDataSetChanged()
        }
    }
    inner class SurveyAnswerTxtViewHolder(private val binding:ListItemSurveyAnswerTxtBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.etAnswer.addTextChangedListener {
                binding.surveyAnswer?.let { surveyAnswer ->
                    surveyAnswer.answerText = it.toString()
                    itemClick(surveyAnswer)
                }
            }
        }

        fun bind(item: SurveyAnswer) {
            binding.apply {
                surveyAnswer = item

                executePendingBindings()
            }
        }
    }
}

private class SurveyAnswerItemDiffCallback: DiffUtil.ItemCallback<SurveyAnswer>() {
    override fun areItemsTheSame(oldItem: SurveyAnswer, newItem: SurveyAnswer): Boolean {
        return oldItem.no == newItem.no
    }

    override fun areContentsTheSame(oldItem: SurveyAnswer, newItem: SurveyAnswer): Boolean {
        return oldItem == newItem
    }
}