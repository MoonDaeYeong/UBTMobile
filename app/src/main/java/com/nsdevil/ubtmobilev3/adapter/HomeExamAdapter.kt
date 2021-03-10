package com.nsdevil.ubtmobilev3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nsdevil.ubtmobilev3.data.response.HomeDataResponse
import com.nsdevil.ubtmobilev3.databinding.ListItemHomeExamBinding

class HomeExamAdapter(val itemClick: (HomeDataResponse.Result.Userexam) -> Unit) : ListAdapter<HomeDataResponse.Result.Userexam, RecyclerView.ViewHolder>(HomeExamItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HomeExamViewHolder(ListItemHomeExamBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val homeExam = getItem(position)
        (holder as HomeExamViewHolder).bind(homeExam)
    }

    private inner class HomeExamViewHolder(private val binding: ListItemHomeExamBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener {
                binding.userExamData?.let {
                    itemClick(it)
                }
            }
        }

        fun bind(item: HomeDataResponse.Result.Userexam) {
            binding.apply {
                userExamData = item
                executePendingBindings()
            }
        }
    }
}

private class HomeExamItemDiffCallback: DiffUtil.ItemCallback<HomeDataResponse.Result.Userexam>() {
    override fun areItemsTheSame(oldItem: HomeDataResponse.Result.Userexam,newItem: HomeDataResponse.Result.Userexam): Boolean {
        return oldItem.examId == newItem.examId
    }

    override fun areContentsTheSame(oldItem: HomeDataResponse.Result.Userexam,newItem: HomeDataResponse.Result.Userexam): Boolean {
        return oldItem == newItem
    }
}