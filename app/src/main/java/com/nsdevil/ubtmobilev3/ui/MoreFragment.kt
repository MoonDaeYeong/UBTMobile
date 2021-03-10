package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.adapter.HomeExamAdapter
import com.nsdevil.ubtmobilev3.adapter.MoreExamAdapter
import com.nsdevil.ubtmobilev3.adapter.MoreOrgAdapter
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse
import com.nsdevil.ubtmobilev3.data.response.AllOrgResponse
import com.nsdevil.ubtmobilev3.data.response.HomeDataResponse
import com.nsdevil.ubtmobilev3.databinding.FragmentMoreBinding
import com.nsdevil.ubtmobilev3.dialog.ExamInfoDialog
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.viewmodels.MoreViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MoreFragment : BaseFragment() {

    private lateinit var binding: FragmentMoreBinding

    private val args: MoreFragmentArgs by navArgs()

    private val viewModel: MoreViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentMoreBinding.inflate(inflater, container, false)
        context ?: return binding.root

        (activity as AppCompatActivity).setSupportActionBar(binding.bar)
        setHasOptionsMenu(true)
        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {
        binding.apply {
            when(args.category) {
                "exam" -> tvTitle.text = "EXAMS"
                else -> tvTitle.text = "ORGANIZATIONS"
            }
            if(args.subClass == "search")
                cardSearch.visibility = View.VISIBLE
            else
                cardSearch.visibility = View.GONE

            btnSearch.setOnClickListener {
                if(etSearch.text.isNullOrEmpty())
                    etSearch.error = "Input Exam Name"
                else {
                    etSearch.error = null
                    viewModel.getFindExam(etSearch.text.toString())
                }
            }
        }
    }

    private fun subscribeUi() {
        with(viewModel) {
            viewLoading.observe(viewLifecycleOwner) { if(it) showLoading() else hideLoading() }
            getThrowable.observe(viewLifecycleOwner) { customThrowableHandle(it) }

            getInitSetting(args)

            val examAdapter = MoreExamAdapter(this@MoreFragment::examItemClick)
            myExamResult.observe(viewLifecycleOwner) {
                binding.rvMoreList.adapter = examAdapter
                examAdapter.submitList(it.content)
            }
            otherExamResult.observe(viewLifecycleOwner) {
                binding.rvMoreList.adapter = examAdapter
                val type = object :TypeToken<List<AllMyExamResponse.Content>>(){}.type
                val itemList:List<AllMyExamResponse.Content> = Gson().fromJson(Gson().toJson(it.content), type)
                examAdapter.submitList(itemList)
            }
            val orgAdapter = MoreOrgAdapter(this@MoreFragment::orgItemClick)
            orgResult.observe(viewLifecycleOwner) {
                binding.rvMoreList.adapter = orgAdapter
                orgAdapter.submitList(it.content)
            }
        }
    }

    private fun examItemClick(myExam: AllMyExamResponse.Content) {
        val type = object : TypeToken<HomeDataResponse.Result.Userexam>(){}.type
        val userExam: HomeDataResponse.Result.Userexam = Gson().fromJson(Gson().toJson(myExam), type)
        examInfoDialog(userExam)
    }

    private fun orgItemClick(org: AllOrgResponse.Content) {

    }

    private fun examInfoDialog(userExam: HomeDataResponse.Result.Userexam) {
        val examInfoDialog = ExamInfoDialog(requireContext(), userExam) {
            if(!userExam.examCode.isNullOrEmpty()) {
                CommonUtils.userExam = userExam

                if(userExam.aiuse.equals("true", true))
                    setAiUseCheck(true)
                else
                    setAiUseCheck(false)

                navigateToStandby()
            }
        }
        examInfoDialog.show()
    }

    private fun navigateToStandby() {
        val directions = R.id.standByFragment
        findNavController().navigate(directions)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            android.R.id.home -> {
                findNavController().popBackStack()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}