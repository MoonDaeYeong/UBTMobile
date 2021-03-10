package com.nsdevil.ubtmobilev3.dialog

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.data.response.HomeDataResponse
import com.nsdevil.ubtmobilev3.databinding.DialogExamInfoBinding

class ExamInfoDialog (context: Context, private val userExam: HomeDataResponse.Result.Userexam, private val confirmClick:() -> Unit) : AlertDialog(context, R.style.AlertDialogLightX) {

    private lateinit var binding: DialogExamInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogExamInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        subscribeUi()
    }

    private fun subscribeUi() {

        binding.apply {
            if(userExam.examStatus.equals("start", true) || userExam.examStatus.equals("prepare", true)) {
                if(userExam.examCode.isNullOrEmpty()) {
                    btnTakeAnExam.text = "register"
                }
            } else {
                btnTakeAnExam.visibility = View.GONE
            }

            userExamData = userExam
            executePendingBindings()

            btnClose.setOnClickListener {
                dismiss()
            }
            btnTakeAnExam.setOnClickListener {
                confirmClick()
                dismiss()
            }
        }
    }
}