package com.nsdevil.ubtmobilev3.ui.exam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.adapter.ExamListAdapter
import com.nsdevil.ubtmobilev3.data.db.InQuestion
import com.nsdevil.ubtmobilev3.databinding.FragmentCategoryBinding
import com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoryFragment(private val categoryType: Int) : Fragment() {

    private lateinit var binding: FragmentCategoryBinding

    private val viewModel: ExamViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        binding = FragmentCategoryBinding.inflate(inflater, container, false)
        context ?: return binding.root

        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {

    }

    private fun subscribeUi() {
        with(viewModel) {
            setViewListState(categoryType)

            val adapter = ExamListAdapter()
            binding.rvExamList.adapter = adapter

            getQuestionList.observe(viewLifecycleOwner) {
                adapter.submitList(it)
            }
        }
    }
}