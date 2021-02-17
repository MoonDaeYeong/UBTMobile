package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.gson.Gson
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.adapter.OrgExamAdapter
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.data.response.HomeDataResponse
import com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse
import com.nsdevil.ubtmobilev3.databinding.FragmentOrgBinding
import com.nsdevil.ubtmobilev3.dialog.CodeRegisterDialog
import com.nsdevil.ubtmobilev3.dialog.TextInputDialog
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog
import com.nsdevil.ubtmobilev3.viewmodels.OrgViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class OrgFragment : BaseFragment() {

    private lateinit var binding: FragmentOrgBinding

    private val viewModel: OrgViewModel by viewModels()

    private val args: OrgFragmentArgs by navArgs()
    private val organization get() = Gson().fromJson(args.orgData, HomeDataResponse.Result.Organiz::class.java)

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View {
        binding = FragmentOrgBinding.inflate(layoutInflater, container, false)
        context ?: return binding.root

        (activity as AppCompatActivity).setSupportActionBar(binding.bar)
        setHasOptionsMenu(true)
        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {
        binding.apply {
            orgData = organization
            executePendingBindings()

            btnJoin.setOnClickListener {
                val dialog = TextInputDialog(requireContext(), viewLifecycleOwner) {
                    viewModel.registerOrg(organization.organizId, it)
                }
                dialog.setConfirm("Register")
                dialog.setCancel("Cancel")
                dialog.setTitle("Input Student Code")
                dialog.show()
            }

            fab.setOnClickListener {
                val dialog = CodeRegisterDialog(requireContext()) { examCode ->
                    if(!examCode.isNullOrEmpty()) {
                        viewModel.examCodeRegister(examCode.toUpperCase(Locale.ENGLISH))
                    }
                }
                dialog.show()
                dialog.window?.clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM)
                dialog.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
            }
        }
    }

    private fun subscribeUi() {
        val adapter = OrgExamAdapter(organization.organizLogo, this::showExamRegisterDialog)
        binding.rvExams.adapter = adapter

        with(viewModel) {
            viewLoading.observe(viewLifecycleOwner) {if(it) showLoading() else hideLoading()}
            getThrowable.observe(viewLifecycleOwner) {customThrowableHandle(it)}


            getOrgData(organization.organizId).observe(viewLifecycleOwner) {
                if(!it.content.isNullOrEmpty())
                    binding.tvEmpty.visibility = View.GONE
                adapter.submitList(it.content)
            }

            registerOrgResult.observe(viewLifecycleOwner) {
                if(it.success)
                    simpleDialog("Success", "Student registration is complete.", ZAlertDialog.SUCCESS_TYPE)
                else
                    simpleDialog("Warning", it.message, ZAlertDialog.WARNING_TYPE)
            }

            registerExamResult.observe(viewLifecycleOwner) {
                if(it.success)
                    simpleDialog("Success", it.message, ZAlertDialog.SUCCESS_TYPE)
                else
                    simpleDialog("Warning", it.message, ZAlertDialog.WARNING_TYPE)
            }

            examCodeResult.observe(viewLifecycleOwner) {
                if(it.success) {
                    simpleDialog("Success", "Code registration completed", ZAlertDialog.SUCCESS_TYPE)
                } else if (!it.success) {
                    simpleDialog("Warning", it.message.toString(), ZAlertDialog.WARNING_TYPE)
                }
            }
        }
    }

    private fun showExamRegisterDialog(content: OrgExamListResponse.Content) {
        val dialog = ZAlertDialog(requireContext(), viewLifecycleOwner)
        when(content.examStatus) {
            "end" -> simpleDialog("Warning", "Exam End State", ZAlertDialog.WARNING_TYPE)
            "finish" -> simpleDialog("Warning", "Exam Finish State", ZAlertDialog.WARNING_TYPE)
            else -> {
                dialog.setTitle("Notice")
                dialog.setMsg("Would you like to register for this exam?")
                dialog.setConfirm("Yes")
                dialog.setCancel("No")
                dialog.setMultiEventListener(object : ZAlertDialog.MultiEventLister {
                    override fun confirmClick(dialogSelf: ZAlertDialog) {
                        dialogSelf.dismiss()
                        viewModel.registerExam(content.examId)
                    }
                    override fun cancelClick(dialogSelf: ZAlertDialog) {
                        dialogSelf.dismiss()
                    }
                })
                if(!dialog.isShowing)
                    dialog.show()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.org_bottom_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.app_bar_back -> {
                findNavController().popBackStack()
                true
            }
            R.id.app_bar_call -> {
                simpleDialog("Preparing...", "Under construction.", ZAlertDialog.WARNING_TYPE)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}