package com.nsdevil.ubtmobilev3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse
import com.nsdevil.ubtmobilev3.databinding.ListItemMoreExamBinding

class MoreExamAdapter(val itemClick: (AllMyExamResponse.Content) -> Unit) : ListAdapter<AllMyExamResponse.Content, RecyclerView.ViewHolder>(MoreExamItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MoreExamViewHolder(ListItemMoreExamBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val moreExam = getItem(position)
        (holder as MoreExamViewHolder).bind(moreExam)
    }

    private inner class MoreExamViewHolder(private val binding: ListItemMoreExamBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.setClickListener {
                binding.content?.let {
                    itemClick(it)
                }
            }
        }

        fun bind(item: AllMyExamResponse.Content) {
            binding.apply {
                content = item
                executePendingBindings()
            }
        }
    }
}

private class MoreExamItemDiffCallback: DiffUtil.ItemCallback<AllMyExamResponse.Content>() {
    override fun areItemsTheSame(oldItem: AllMyExamResponse.Content,newItem: AllMyExamResponse.Content): Boolean { return oldItem.examId == newItem.examId }
    override fun areContentsTheSame(oldItem: AllMyExamResponse.Content,newItem: AllMyExamResponse.Content): Boolean { return oldItem == newItem }
}