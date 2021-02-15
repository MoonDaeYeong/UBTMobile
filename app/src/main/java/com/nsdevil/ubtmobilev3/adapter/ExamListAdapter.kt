package com.nsdevil.ubtmobilev3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nsdevil.ubtmobilev3.data.db.InQuestion
import com.nsdevil.ubtmobilev3.databinding.ListItemExamListBinding
import com.nsdevil.ubtmobilev3.ui.exam.ExamListFragmentDirections

class ExamListAdapter :  ListAdapter<InQuestion, RecyclerView.ViewHolder>(ExamListItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ExamListViewHolder(ListItemExamListBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        (holder as ExamListViewHolder).bind(item)
    }

    inner class ExamListViewHolder(private val binding: ListItemExamListBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.setClickListener { view ->
                binding.inQ?.let { inQ ->
                    navigateToExamTest(view, inQ.viewOrder-1)
                }
            }
        }

        fun bind(item: InQuestion) {
            binding.apply {
                inQ = item
                executePendingBindings()
            }
        }

        private fun navigateToExamTest(view: View, questionPage: Int) {
            val directions = ExamListFragmentDirections.actionExamListFragmentToExamTestFragment(questionPage)
            view.findNavController().navigate(directions)
        }
    }
}

private class ExamListItemDiffCallback: DiffUtil.ItemCallback<InQuestion>() {
    override fun areItemsTheSame(oldItem: InQuestion, newItem: InQuestion): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: InQuestion, newItem: InQuestion): Boolean {
        return oldItem == newItem
    }
}