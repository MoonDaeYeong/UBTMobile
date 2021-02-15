package com.nsdevil.ubtmobilev3.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.adapter.PreviewQueAdapter
import com.nsdevil.ubtmobilev3.databinding.DialogTestPreviewBinding
import com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TestPreviewDialog : DialogFragment() {

    private lateinit var binding: DialogTestPreviewBinding

    private val viewModel: ExamViewModel by viewModels()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it, R.style.AlertDialogLightX)
            binding = DialogTestPreviewBinding.inflate(layoutInflater, null,false)

            builder.setView(binding.root)
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        context ?: return binding.root

        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {
        binding.apply {
            confirm.setOnClickListener {
                dismiss()
            }
            executePendingBindings()
        }
    }

    private fun subscribeUi() {
        val adapter = PreviewQueAdapter()
        binding.rvPreview.adapter = adapter

        with(viewModel) {
            questionAnswerList.observe(viewLifecycleOwner) {
                adapter.submitList(it)
            }
        }
    }
}