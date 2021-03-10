package com.nsdevil.ubtmobilev3.ui

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.databinding.FragmentExamBinding
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.File

@AndroidEntryPoint
class ExamFragment : BaseFragment() {

    private lateinit var binding: FragmentExamBinding
    private val userExam get() = CommonUtils.userExam
    private val examInfo get() = CommonUtils.meResponse

    lateinit var questionPlayer: SimpleExoPlayer
    lateinit var answerListPlayer: List<SimpleExoPlayer>

    private val viewModel: ExamViewModel by viewModels ()

    var stayingTime = 0

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View {
        binding = FragmentExamBinding.inflate(inflater,container,false)
        context ?: return binding.root

        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {
        aiAlertCheck.observe(viewLifecycleOwner) {
            if(it) { viewModel.aiAlertSignal(requireContext()) }
        }

        questionPlayer = SimpleExoPlayer.Builder(requireContext()).build()
        answerListPlayer = listOf(
            SimpleExoPlayer.Builder(requireContext()).build(),
            SimpleExoPlayer.Builder(requireContext()).build(),
            SimpleExoPlayer.Builder(requireContext()).build(),
            SimpleExoPlayer.Builder(requireContext()).build(),
            SimpleExoPlayer.Builder(requireContext()).build()
        )

        binding.apply {
            tvExamName.text = userExam.examName
            tvExamCode.text = userExam.examCode
            tvName.text = examInfo.lastName
        }
    }

    fun stopPlayerEvent() {
        if(questionPlayer.isPlaying) {
            questionPlayer.stop()
        }

        answerListPlayer.forEach {
            if(it.isPlaying)
                it.stop()
        }
    }

    fun setQuestionPlayer(source: String) {
        val file = File(requireContext().filesDir, "question/$source")
        val mediaSource = prepareExoPlayerFromFileUri(Uri.parse(file.absolutePath))

        questionPlayer.prepare(mediaSource)
        questionPlayer.playWhenReady = false
    }

    fun setAnswerPlayer(source: List<String>) {
        for (i in source.indices) {
            val file = File(requireContext().filesDir, "answer/"+source[i])
            val mediaSource = prepareExoPlayerFromFileUri(Uri.parse(file.absolutePath))

            answerListPlayer[i].prepare(mediaSource)
            answerListPlayer[i].playWhenReady = false
        }
    }

    private fun prepareExoPlayerFromFileUri(uri: Uri): MediaSource {
        val dataSourceFactory: DataSource.Factory = DefaultDataSourceFactory( requireContext(), Util.getUserAgent(requireContext(), getString(R.string.app_name)) )
        return ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(uri)
    }

    private fun subscribeUi() {
        with(viewModel) {
            viewLoading.observe(viewLifecycleOwner) { if(it) showLoading() else hideLoading() }
            getThrowable.observe(viewLifecycleOwner) { customThrowableHandle(it) }

            timerSetting(requireContext())

            remainTime.asLiveData().observe(viewLifecycleOwner) {
                binding.tvExamTime.text = CommonUtils.clockString(it)
                if(it != 0)
                    startFaceService()

                stayingTime += 1
            }
            getTotalCount.observe(viewLifecycleOwner) {
                binding.tvTotalQuestionInfo.text = it.toString()
                CommonUtils.totalQuestionNumber = it
            }
            getRemainCount.observe(viewLifecycleOwner) {
                binding.tvRemainQuestionInfo.text = it.toString()
                CommonUtils.remainQuestionNumber = it
            }

            uploadResultMsg.observe(viewLifecycleOwner) {
                if(it.success && it.answerType == "FILE")
                    finishMsg()
                else
                    Toast.makeText(requireContext(), it.msg, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun finishMsg() {
        stopFaceService()
        val dialog = ZAlertDialog(requireContext(), viewLifecycleOwner)
        dialog.apply {
            setTitle("성공")
            setMsg("답안 제출 완료.")
            setType(ZAlertDialog.SUCCESS_TYPE)
            setConfirm("확인.")
            setSingleEventListener(object :ZAlertDialog.SingleEventListener {
                override fun confirmClick(dialogSelf: ZAlertDialog) {
                    dialogSelf.dismiss()
                    findNavController().popBackStack(R.id.homeFragment, true)
                }
            })
        }.show()
    }

    fun submitTest() {
        lifecycleScope.launch {
            viewModel.submissionProcess(requireContext())
        }
    }

    override fun onResume() {
        super.onResume()
        registerMyReceiver()
    }

    override fun onPause() {
        super.onPause()
        unRegisterMyReceiver()
    }

    override fun onDestroy() {
        super.onDestroy()
        stopFaceService()
        stopPlayerEvent()
    }
}