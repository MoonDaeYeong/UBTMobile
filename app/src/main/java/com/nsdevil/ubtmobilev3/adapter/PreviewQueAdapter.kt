package com.nsdevil.ubtmobilev3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nsdevil.ubtmobilev3.data.model.QuestionAnswer
import com.nsdevil.ubtmobilev3.databinding.ListItemExamPreviewQBinding

class PreviewQueAdapter : ListAdapter<QuestionAnswer, RecyclerView.ViewHolder>(PreviewQueItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PreviewQueViewHolder(ListItemExamPreviewQBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        (holder as PreviewQueViewHolder).bind(item)
    }

    class PreviewQueViewHolder(private val binding: ListItemExamPreviewQBinding) : RecyclerView.ViewHolder(binding.root) {

        val adapter = PreviewAnsAdapter()

        init {
            binding.rvPreviewA.adapter = adapter
        }

        fun bind(item: QuestionAnswer) {
            binding.apply {
                questionAnswer = item
                adapter.submitList(item.answersList)
                executePendingBindings()
            }
        }
    }
}

private class PreviewQueItemDiffCallback: DiffUtil.ItemCallback<QuestionAnswer>() {
    override fun areItemsTheSame(oldItem: QuestionAnswer, newItem: QuestionAnswer): Boolean {
        return oldItem.question.id == newItem.question.id
    }

    override fun areContentsTheSame(oldItem: QuestionAnswer, newItem: QuestionAnswer): Boolean {
        return oldItem == newItem
    }
}