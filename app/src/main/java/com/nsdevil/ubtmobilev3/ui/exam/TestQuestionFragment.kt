package com.nsdevil.ubtmobilev3.ui.exam

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.github.chrisbanes.photoview.PhotoView
import com.google.android.exoplayer2.ui.PlayerView
import com.nsdevil.ubtmobilev3.MainActivity
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.adapter.ExamAnswerAdapter
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.data.db.InAnswer
import com.nsdevil.ubtmobilev3.databinding.FragmentExamTestBinding
import com.nsdevil.ubtmobilev3.databinding.FragmentTestQuestionBinding
import com.nsdevil.ubtmobilev3.ui.ExamFragment
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_stand_by.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.io.File

@AndroidEntryPoint
class TestQuestionFragment(private val position: Int) : BaseFragment() {

    private lateinit var binding: FragmentTestQuestionBinding

    private val viewModel: ExamViewModel by viewModels()

    private val examFragment get() = parentFragment?.parentFragment?.parentFragment as ExamFragment

    var updateAnswerList: List<InAnswer> = emptyList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentTestQuestionBinding.inflate(inflater,container,false)
        context ?: return binding.root

        setBindItem()
        subscribeUi()

        return binding.root
    }

    private fun setBindItem() {
        binding.apply {

        }
    }

    private fun subscribeUi() {
        val answerAdapter = ExamAnswerAdapter(this::getNewList, this::getPlayerView)
        binding.rvAnswer.adapter = answerAdapter

        with(viewModel) {
            questionAnswer(position).observe(viewLifecycleOwner) {
                binding.inQ = it.question
                answerAdapter.submitList(it.answersList)
            }

            getDataList(position).observe(viewLifecycleOwner) { it ->
                it.forEach { inData ->
                    inData.dataText?.let { dataText ->
                        if(!dataText.isNullOrEmpty())
                            setDataText(dataText)
                    }

                    inData.media?.let { mediaX ->
                        when {
                            mediaX.mediaType.equals("image",true) -> {
                                mediaX.fileName?.let { fileName ->
                                    imageViewer(fileName)
                                }
                            }
                            mediaX.mediaType.equals("audio", true) -> {
                                mediaX.fileName?.let { fileName ->
                                    audioPlayer(fileName)
                                }
                            }
                            mediaX.mediaType.equals("video", true) -> {
                                mediaX.fileName?.let { fileName ->
                                    videoPlayer(fileName)
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private fun setDataText(text: String) {
        val coParams = LinearLayout.LayoutParams( LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        coParams.setMargins(0, 0, 0, 10)
        val dataTextView = layoutInflater.inflate(R.layout.item_data_text, binding.llDataRoot,false) as TextView
        dataTextView.text = CommonUtils.fromHtml(text)
        dataTextView.layoutParams = coParams
        binding.llDataRoot.addView(dataTextView)
    }

    private fun imageViewer(source: String) {
        val coParams = LinearLayout.LayoutParams( LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT )
        coParams.setMargins(0, 0, 0, 5)

        val imageView = PhotoView(requireContext())
        imageView.layoutParams = coParams
        val file = File(requireContext().filesDir, source)
        Glide.with(requireContext()).load(file).into(imageView)

        binding.llDataRoot.addView(imageView)
    }

    private fun audioPlayer(source: String) {
        examFragment.setQuestionPlayer(source)

        val coParams = LinearLayout.LayoutParams( LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        coParams.setMargins(0, 0, 0, 2)

        val playerView = layoutInflater.inflate(R.layout.item_audio_player, binding.llDataRoot, false) as PlayerView

        playerView.layoutParams = coParams
        playerView.player = examFragment.questionPlayer

        binding.llDataRoot.addView(playerView)
    }

    private fun videoPlayer(source: String) {
        examFragment.setQuestionPlayer(source)

        val coParams = LinearLayout.LayoutParams( LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        coParams.height = 600
        coParams.setMargins(0, 0, 0, 2)

        val playerView = PlayerView(requireContext())
        playerView.layoutParams = coParams
        playerView.player = examFragment.questionPlayer

        binding.llDataRoot.addView(playerView)
    }

    private fun getNewList(answerList: List<InAnswer>) {
        updateAnswerList = answerList
    }

    private fun getPlayerView(playerView: PlayerView, answerList: List<InAnswer>, position: Int) {
        val audioList: MutableList<String> = mutableListOf()
        answerList.forEach { answer ->
            answer.fileName?.let { fileName ->
                audioList.add(fileName)
            }
        }
        examFragment.setAnswerPlayer(audioList)
        playerView.player = examFragment.answerListPlayer[position]
    }
}