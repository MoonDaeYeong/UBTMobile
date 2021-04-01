package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.nsdevil.ubtmobilev3.MainActivity
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.adapter.HomeExamAdapter
import com.nsdevil.ubtmobilev3.adapter.HomeOrgAdapter
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.data.model.ProfileData
import com.nsdevil.ubtmobilev3.data.response.HomeDataResponse
import com.nsdevil.ubtmobilev3.databinding.FragmentHomeBinding
import com.nsdevil.ubtmobilev3.dialog.CodeRegisterDialog
import com.nsdevil.ubtmobilev3.dialog.ExamInfoDialog
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.viewmodels.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.util.*

@AndroidEntryPoint
class HomeFragment : BaseFragment() {

    private lateinit var binding: FragmentHomeBinding

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        context ?: return binding.root

        (requireActivity() as MainActivity).backPossible = false

        (activity as AppCompatActivity).setSupportActionBar(binding.bar)
        setHasOptionsMenu(true)
        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {
        binding.apply {
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

            btnMyExamMore.setOnClickListener { navigateToMore("exam", "my") }
            btnOtherExamMore.setOnClickListener { navigateToMore("exam", "other") }
            btnMyOrgMore.setOnClickListener { navigateToMore("org", "my") }
            btnOtherOrgMore.setOnClickListener { navigateToMore("org", "other") }
        }
    }

    private fun subscribeUi() {
        val myExamAdapter = HomeExamAdapter(this::examItemClick)
        val lastExamAdapter = HomeExamAdapter(this::examItemClick)
        val myOrgAdapter = HomeOrgAdapter(this::orgItemClick)
        val otherOrgAdapter = HomeOrgAdapter(this::orgItemClick)
        binding.apply {
            rvMyExam.adapter = myExamAdapter
            rvLastExam.adapter = lastExamAdapter
            rvMyOrg.adapter = myOrgAdapter
            rvOtherOrg.adapter = otherOrgAdapter
        }

        with(viewModel) {
            viewLoading.observe(viewLifecycleOwner) { if(it) showLoading() else hideLoading()}
            getThrowable.observe(viewLifecycleOwner) { customThrowableHandle(it) }

            getMeData()

            meDataResult.observe(viewLifecycleOwner) {
                getHomeData()
                binding.meResponseData = it
                CommonUtils.meResponse = it
            }
            homeDataResult.observe(viewLifecycleOwner) {
                binding.homeResponseData = it

                myExamAdapter.submitList(it.result.userexams)

                val examType = object : TypeToken<List<HomeDataResponse.Result.Userexam>>(){}.type
                val lastExam:List<HomeDataResponse.Result.Userexam> = Gson().fromJson(
                    Gson().toJson( it.result.latestexams ), examType )
                lastExamAdapter.submitList(lastExam)

                val orgType = object : TypeToken<List<HomeDataResponse.Result.Organiz>>(){}.type
                val myOrg: List<HomeDataResponse.Result.Organiz> = Gson().fromJson( Gson().toJson(it.result.myorganizs), orgType )
                myOrgAdapter.submitList(myOrg)

                otherOrgAdapter.submitList(it.result.organizs)
            }

            examCodeResult.observe(viewLifecycleOwner) {
                if(it.success) {
                    simpleDialog("Success", "ExamCode Register", ZAlertDialog.SUCCESS_TYPE)
                    getHomeData()
                } else if (!it.success) {
                    simpleDialog("Fail", it.message.toString(), ZAlertDialog.WARNING_TYPE)
                }
            }
        }
    }

    private fun examItemClick(userExam: HomeDataResponse.Result.Userexam) {
        val examInfoDialog = ExamInfoDialog(requireContext(), userExam) {
            if(!userExam.examCode.isNullOrEmpty()) {
                CommonUtils.userExam = userExam

                    if(userExam.aiuse.equals("true", true))
                        setAiUseCheck(true)
                    else
                        setAiUseCheck(false)

                if(userExam.reTake.equals("no", true))
                    setReTakeCheck(false)
                else
                    setReTakeCheck(true)

                navigateToStandby()
            }
        }
        examInfoDialog.show()
    }

    private fun navigateToStandby() {
        val directions = HomeFragmentDirections.actionHomeFragmentToStandByFragment()
        findNavController().navigate(directions)
    }

    private fun orgItemClick(organiz: HomeDataResponse.Result.Organiz) {
        val orgString = Gson().toJson(organiz)
        val directions = HomeFragmentDirections.actionHomeFragmentToOrgFragment(orgString)
        findNavController().navigate(directions)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.home_bottom_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                lifecycleScope.launch {
                    viewModel.getHomeData()
                }
                true
            }
            R.id.app_bar_search -> {
                navigateToMore("exam","search")
                true
            }
            R.id.app_bar_settings -> {
                navigateToSetting()
                true
            }

            R.id.app_bar_exit -> {
                findNavController().navigate(R.id.loginFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun navigateToMore(category: String, subClass: String) {
        val directions = HomeFragmentDirections.actionHomeFragmentToMoreFragment(category, subClass)
        findNavController().navigate(directions)
    }

    private fun navigateToSetting() {
        with(HomeViewModel) {
            val profileData = ProfileData(imgUrl, userName, userEmail, point, examCount, orgCount)

            val directions = HomeFragmentDirections.actionHomeFragmentToSettingFragment(Gson().toJson(profileData))
            findNavController().navigate(directions)
        }
    }
}