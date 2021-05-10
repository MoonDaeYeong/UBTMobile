package com.nsdevil.ubtmobilev3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.exoplayer2.ui.PlayerView
import com.nsdevil.ubtmobilev3.data.db.InAnswer
import com.nsdevil.ubtmobilev3.databinding.*

class ExamAnswerAdapter(private val newList: (List<InAnswer>) -> Unit, private val itemPlayer: (PlayerView, List<InAnswer>, Int) -> Unit) : ListAdapter<InAnswer, RecyclerView.ViewHolder>(ExamAnswerItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val getAnswerView = ExamAnswerViewHolder(ListItemAnswerBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        val getAnswerTextView = ExamAnswerTextViewHolder(ListItemAnswerTextBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        val getAnswerImgView = ExamAnswerImgViewHolder(ListItemAnswerImgBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        val getAnswerAudioView = ExamAnswerAudioViewHolder(ListItemAnswerAudioBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        val getAnswerMathView = ExamAnswerMathViewHolder(ListItemAnswerMathBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        val getAnswerVideoView = ExamAnswerVideoViewHolder(ListItemAnswerVideoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        return when(viewType) { 2-> getAnswerTextView 3-> getAnswerImgView 4-> getAnswerAudioView 5-> getAnswerMathView 6-> getAnswerVideoView else -> getAnswerView }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        when (getItemViewType(position)) {
            2 -> (holder as ExamAnswerTextViewHolder).bind(item)
            3 -> (holder as ExamAnswerImgViewHolder).bind(item)
            4 -> (holder as ExamAnswerAudioViewHolder).bind(item)
            5 -> (holder as ExamAnswerMathViewHolder).bind(item)
            6 -> (holder as ExamAnswerVideoViewHolder).bind(item)
            else -> (holder as ExamAnswerViewHolder).bind(item)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if(currentList[position].questionType == "2") 2
        else if (!currentList[position].fileName.isNullOrEmpty() && currentList[position].mediaType.equals("image", true)) 3
        else if (!currentList[position].fileName.isNullOrEmpty() && currentList[position].mediaType.equals("audio", true)) 4
        else if (currentList[position].answerType == "math") 5
        else if (!currentList[position].fileName.isNullOrEmpty() && currentList[position].mediaType.equals("video", true)) 6
        else super.getItemViewType(position)
    }

    private fun subscribeButton(answer: InAnswer) {
        if (answer.questionType == "1") {
            currentList.forEach { inAnswer ->
                if (inAnswer.order == answer.order) { inAnswer.userChk = answer.userChk } else { inAnswer.userChk = false }
            }
        } else {
            currentList.forEach { inAnswer ->
                if(inAnswer.order == answer.order) { inAnswer.userChk = answer.userChk }
            }
        }
        notifyDataSetChanged()
        newList(currentList)
    }

    inner class ExamAnswerViewHolder(private val binding: ListItemAnswerBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.setClickListener {
                binding.answer?.let { answer ->
                    answer.userChk = !answer.userChk
                    subscribeButton(answer)
                }
            }
        }

        fun bind(item: InAnswer) {
            binding.apply {
                answer = item
                executePendingBindings()
            }
        }
    }

    inner class ExamAnswerMathViewHolder(private val binding: ListItemAnswerMathBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener {
                binding.answer?.let { answer ->
                    answer.userChk = !answer.userChk
                    subscribeButton(answer)
                }
            }
        }

        fun bind(item: InAnswer) {
            binding.apply {
                answer = item

                val sb = StringBuilder(item.answer)
                val newSb = java.lang.StringBuilder()
                sb.forEach {
                    if (it.toString() == "\\")
                        newSb.append("\\"+it.toString())
                    else
                        newSb.append(it)
                }

                mathView.setText(newSb.toString())
                executePendingBindings()
            }
        }
    }

    inner class ExamAnswerImgViewHolder(private val binding: ListItemAnswerImgBinding) : RecyclerView.ViewHolder (binding.root) {

        init {
            binding.setClickListener {
                binding.answer?.let { answer ->
                    answer.userChk = !answer.userChk
                    subscribeButton(answer)
                }
            }
        }

        fun bind(item: InAnswer) {
            binding.apply {
                answer = item
                executePendingBindings()
            }
        }
    }

    inner class ExamAnswerAudioViewHolder(private val binding: ListItemAnswerAudioBinding) : RecyclerView.ViewHolder (binding.root) {
        init {
            binding.setClickListener {
                binding.answer?.let { answer ->
                    answer.userChk = !answer.userChk
                    subscribeButton(answer)
                }
            }
        }

        fun bind(item: InAnswer) {
            binding.apply {
                answer = item
                itemPlayer(playerView, currentList, adapterPosition)
                executePendingBindings()
            }
        }
    }

    inner class ExamAnswerVideoViewHolder(private val binding: ListItemAnswerVideoBinding) : RecyclerView.ViewHolder (binding.root) {
        init {
            binding.setClickListener {
                binding.answer?.let { answer ->
                    answer.userChk = !answer.userChk
                    subscribeButton(answer)
                }
            }
        }

        fun bind(item: InAnswer) {
            binding.apply {
                answer = item
                itemPlayer(playerView, currentList, adapterPosition)
                executePendingBindings()
            }
        }
    }

    inner class ExamAnswerTextViewHolder(private val binding: ListItemAnswerTextBinding) : RecyclerView.ViewHolder (binding.root) {
        init {
            binding.etAnswer.addTextChangedListener {
                binding.answer?.let { inAnswer ->
                    inAnswer.textAnswer = it.toString()
                    subscribeText(inAnswer)
                }
                newList(currentList)
            }
        }

        fun bind(item: InAnswer) {
            binding.apply {
                answer = item
                executePendingBindings()
            }
        }

        private fun subscribeText(answer: InAnswer) {
            currentList.forEach {
                if(it.order == answer.order) {
                    it.textAnswer = answer.textAnswer
                    it.userChk = !answer.textAnswer.isNullOrEmpty()
                }
            }
        }
    }
}

class ExamAnswerItemDiffCallback: DiffUtil.ItemCallback<InAnswer>() {
    override fun areItemsTheSame(oldItem: InAnswer, newItem: InAnswer): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: InAnswer, newItem: InAnswer): Boolean {
        return oldItem == newItem
    }
}