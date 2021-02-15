package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.nsdevil.ubtmobilev3.adapter.bindGetUserImg
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.databinding.FragmentStandByBinding
import com.nsdevil.ubtmobilev3.dialog.SignPadDialog
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.viewmodels.StandByViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

@AndroidEntryPoint
class StandByFragment : BaseFragment() {

    private lateinit var binding: FragmentStandByBinding

    private val viewModel: StandByViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        binding = FragmentStandByBinding.inflate(inflater,container, false)
        context ?: return binding.root

        setBindItem()
        subscribeUi()

        return binding.root
    }


    private fun setBindItem() {
        binding.apply {
            etExamName.setText(CommonUtils.userExam.examName)
            etName.setText(CommonUtils.meResponse.lastName)
            etEmail.setText(CommonUtils.meResponse.email)
            binding.tvDesc.text = CommonUtils.userExam.description
            bindGetUserImg(ivPicture, CommonUtils.meResponse.image)

            btnStart.setOnClickListener {
                val signFile = File(requireContext().getExternalFilesDir(null), String.format("sign_%s.png", CommonUtils.userExam.examCode))

                if(!signFile.exists()) {
                    simpleDialog("Warning", "Please Sign", ZAlertDialog.WARNING_TYPE)
                } else {
                    viewModel.getExamStatus()
                }
            }

            val signDialog = SignPadDialog(requireContext())
            btnSign.setOnClickListener {
                if(!signDialog.isShowing)
                    signDialog.show()
            }
        }
    }

    private fun subscribeUi() {
        with(viewModel) {
            viewLoading.observe(viewLifecycleOwner) { if(it) showLoading() else hideLoading() }
            getThrowable.observe(viewLifecycleOwner) { customThrowableHandle(it) }

            readyCheck.asLiveData().observe(viewLifecycleOwner) {
                if(it) {
                    binding.btnStart.isEnabled = true
                    binding.flProgress.visibility = View.GONE
                } else {
                    binding.btnStart.isEnabled = false
                }
            }
            continueCheck.observe(viewLifecycleOwner) {
                binding.btnStart.text = "Continue"
            }
            endCheck.observe(viewLifecycleOwner) {
                binding.btnStart.text = "End Exam"
            }

            getExamInfo(requireContext())

            downloadFileNameList.observe(viewLifecycleOwner) {
                downloadData(it, this@StandByFragment::progressChecker)
            }

            status.observe(viewLifecycleOwner) {
                if(!it.equals("start", true))
                    simpleDialog("Warning", "The test has not started.", ZAlertDialog.WARNING_TYPE)
                else if (binding.btnStart.text.toString().equals("Continue", true) ) {
                    gotoExam()
                } else {
                    countDown()
                }
            }
        }
    }

    private fun progressChecker(progress:Int, fileName: String) {
        lifecycleScope.launch {
            binding.apply {
                flProgress.visibility = View.VISIBLE
                tvFileName.text = fileName
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                    prIndicator.setProgress(progress, true)
                } else {
                    prIndicator.progress = progress
                }
                if(progress in 0..100) {
                    binding.tvProgressInfo.text = String.format("%s/100", progress.toString())
                }
            }
        }
    }

    private fun countDown() {
        val timer = object : CountDownTimer(5000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                val second = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished).toString()
                if (TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) <= 4)
                    binding.flCountDown.visibility = View.VISIBLE
                binding.tvCountDown.text = second

                val current = Calendar.getInstance().time
                val formatter = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
                binding.tvStartTime.text = formatter.format(current)
                binding.tvRemainTime.text = String.format("00:00:0%s", second)
            }

            override fun onFinish() {
                binding.flCountDown.visibility = View.GONE
                gotoExam()
            }
        }
        timer.start()
    }

    private fun gotoExam() {
        val directions = StandByFragmentDirections.actionStandByFragmentToExamFragment()
        findNavController().navigate(directions)
    }
}