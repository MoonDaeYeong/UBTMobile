package com.nsdevil.ubtmobilev3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nsdevil.ubtmobilev3.data.db.InAnswer
import com.nsdevil.ubtmobilev3.databinding.ListItemExamPreviewABinding
import com.nsdevil.ubtmobilev3.databinding.ListItemExamPreviewATxtBinding

class PreviewAnsAdapter: ListAdapter<InAnswer, RecyclerView.ViewHolder>(PreviewAnsItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val getBtnAnswerView = PreviewAnsViewHolder( ListItemExamPreviewABinding.inflate(LayoutInflater.from(parent.context), parent, false))
        val getTxtAnswerView = PreviewAnsTextViewHolder(ListItemExamPreviewATxtBinding.inflate( LayoutInflater.from(parent.context), parent, false))

        return if (viewType == 2) getTxtAnswerView else getBtnAnswerView
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        if(getItemViewType(position) == 2)
            (holder as PreviewAnsTextViewHolder).bind(item)
        else
            (holder as PreviewAnsViewHolder).bind(item)
    }

    override fun getItemViewType(position: Int): Int {
        return if(currentList[position].questionType =="2") 2 else super.getItemViewType(position)
    }

    class PreviewAnsViewHolder(private val binding: ListItemExamPreviewABinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: InAnswer) {
            binding.apply {
                answer = item
                executePendingBindings()
            }
        }
    }

    class PreviewAnsTextViewHolder(private val binding: ListItemExamPreviewATxtBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: InAnswer) {
            binding.apply {
                answer = item
                executePendingBindings()
            }
        }
    }
}

private class PreviewAnsItemDiffCallback: DiffUtil.ItemCallback<InAnswer>() {
    override fun areItemsTheSame(oldItem: InAnswer, newItem: InAnswer): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: InAnswer, newItem: InAnswer): Boolean {
        return oldItem == newItem
    }
}