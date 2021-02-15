package com.nsdevil.ubtmobilev3.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nsdevil.ubtmobilev3.data.response.AllOrgResponse
import com.nsdevil.ubtmobilev3.databinding.ListItemMoreOrgBinding

class MoreOrgAdapter (val itemClick: (AllOrgResponse.Content) -> Unit) : ListAdapter<AllOrgResponse.Content, RecyclerView.ViewHolder>(MoreOrgItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MoreOrgViewHolder(ListItemMoreOrgBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        (holder as MoreOrgViewHolder).bind(item)
    }

    private inner class MoreOrgViewHolder(private val binding: ListItemMoreOrgBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener {
                binding.content?.let(itemClick)
            }
        }

        fun bind(item: AllOrgResponse.Content) {
            binding.apply {
                content = item
                executePendingBindings()
            }
        }
    }
}

private class MoreOrgItemDiffCallback: DiffUtil.ItemCallback<AllOrgResponse.Content>() {
    override fun areItemsTheSame(oldItem: AllOrgResponse.Content,newItem: AllOrgResponse.Content): Boolean { return oldItem.organizId == newItem.organizId }
    override fun areContentsTheSame(oldItem: AllOrgResponse.Content,newItem: AllOrgResponse.Content): Boolean { return oldItem == newItem }
}