package com.nsdevil.ubtmobilev3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nsdevil.ubtmobilev3.data.response.HomeDataResponse
import com.nsdevil.ubtmobilev3.databinding.ListItemHomeOrgBinding

class HomeOrgAdapter(val itemClick: (HomeDataResponse.Result.Organiz) -> Unit) : ListAdapter<HomeDataResponse.Result.Organiz, RecyclerView.ViewHolder>(HomeOrgItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HomeOrgViewHolder(ListItemHomeOrgBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        (holder as HomeOrgViewHolder).bind(item)
    }

    private inner class HomeOrgViewHolder(private val binding: ListItemHomeOrgBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.setClickListener {
                binding.organizeData?.let { org ->
                    itemClick(org)
                }
            }
        }

        fun bind(item: HomeDataResponse.Result.Organiz) {
            binding.apply {
                organizeData = item
                executePendingBindings()
            }
        }
    }
}

private class HomeOrgItemDiffCallback: DiffUtil.ItemCallback<HomeDataResponse.Result.Organiz>() {
    override fun areItemsTheSame(oldItem: HomeDataResponse.Result.Organiz,newItem: HomeDataResponse.Result.Organiz): Boolean {
        return oldItem.organizId == newItem.organizId
    }

    override fun areContentsTheSame(oldItem: HomeDataResponse.Result.Organiz,newItem: HomeDataResponse.Result.Organiz): Boolean {
        return oldItem == newItem
    }

}