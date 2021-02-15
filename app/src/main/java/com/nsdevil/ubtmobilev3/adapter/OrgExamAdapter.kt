package com.nsdevil.ubtmobilev3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse
import com.nsdevil.ubtmobilev3.databinding.ListItemOrgExamBinding

class OrgExamAdapter(val logo: String, val itemClick: (OrgExamListResponse.Content) -> Unit) : ListAdapter<OrgExamListResponse.Content, RecyclerView.ViewHolder>(OrgExamItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return OrgExamViewHolder(ListItemOrgExamBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        (holder as OrgExamViewHolder).bind(item)
    }

    inner class OrgExamViewHolder(private val binding: ListItemOrgExamBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.setClickListener {
                binding.orgExamContent?.let(itemClick)
            }
        }

        fun bind(item: OrgExamListResponse.Content) {
            binding.apply {
                orgExamContent = item
                bindImageFromUrl(ivLogo, logo)
                executePendingBindings()
            }
        }
    }
}

private class OrgExamItemDiffCallback: DiffUtil.ItemCallback<OrgExamListResponse.Content>() {
    override fun areItemsTheSame(oldItem: OrgExamListResponse.Content,newItem: OrgExamListResponse.Content): Boolean {
        return oldItem.examId == newItem.examId
    }

    override fun areContentsTheSame(oldItem: OrgExamListResponse.Content,newItem: OrgExamListResponse.Content): Boolean {
        return oldItem == newItem
    }
}