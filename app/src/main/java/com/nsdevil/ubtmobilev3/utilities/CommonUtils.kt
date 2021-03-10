package com.nsdevil.ubtmobilev3.utilities

import android.hardware.camera2.CameraCharacteristics
import android.hardware.camera2.CameraManager
import android.media.MediaRecorder
import android.text.Spanned
import androidx.core.text.HtmlCompat
import com.nsdevil.ubtmobilev3.data.model.QuestionAnswer
import com.nsdevil.ubtmobilev3.data.request.SubmissionRequest
import com.nsdevil.ubtmobilev3.data.response.HomeDataResponse
import com.nsdevil.ubtmobilev3.data.response.MeResponse
import com.nsdevil.ubtmobilev3.services.CameraInfo
import java.text.SimpleDateFormat
import java.util.*

object CommonUtils {

    var totalQuestionNumber = 0
    var remainQuestionNumber = 0

    var tokenForm = ""
    fun setToken(tType: String, token: String) {
        tokenForm = "$tType $token"
    }

    lateinit var userExam: HomeDataResponse.Result.Userexam
    lateinit var meResponse: MeResponse

    fun clockString(secondTime:Int) : String {
        var min = secondTime / 60
        val hour = min / 60
        val sec = secondTime % 60
        min %= 60
        return String.format("%02d:%02d:%02d", hour, min, sec)
    }

    fun fromHtml(contents: String): Spanned {
        var contentsText = contents
        if (contentsText.startsWith("<p>")) {
            contentsText = contents.substring(3)
        }
        if (contentsText.endsWith("</p>")) {
            contentsText = contentsText.substring(0, contentsText.length - 4)
        }
        return HtmlCompat.fromHtml(contentsText, HtmlCompat.FROM_HTML_MODE_COMPACT)
    }

    fun submissionRequest(questionAnswer: List<QuestionAnswer>) : SubmissionRequest {
        val submitQuestion: MutableList<SubmissionRequest.Questions> = mutableListOf()
        questionAnswer.forEach { QnAList ->
            val submitAnswer: MutableList<SubmissionRequest.Questions.Answers> = mutableListOf()
            QnAList.answersList.forEach{ AList ->
                if(AList.questionType == "2" && AList.userChk)
                    submitAnswer.add(SubmissionRequest.Questions.Answers(AList.id.toString(), AList.answerFlag.toString(), AList.answerTrueData.toString(), AList.textAnswer.toString()))
                else if (AList.questionType != "2" && AList.userChk)
                    submitAnswer.add(SubmissionRequest.Questions.Answers(AList.id.toString(), AList.answerFlag.toString(), AList.answerTrueData.toString(), AList.optionNumber))
            }
            submitQuestion.add(SubmissionRequest.Questions(QnAList.question.id.toString(), QnAList.question.controlNo, QnAList.question.option.toString(), "", if (QnAList.question.userCheck) "1" else "0", "", QnAList.question.time.toString(), submitAnswer ))
        }
        return SubmissionRequest(userExam.examId, userExam.examCode, userExam.examName, submitQuestion)
    }

    fun getDate(): String {
        val sdf = SimpleDateFormat("yyMMdd", Locale.getDefault())
        return sdf.format(Date())
    }

    private fun lensOrientationString(value: Int) = when(value) {
        CameraCharacteristics.LENS_FACING_BACK -> "Back"
        CameraCharacteristics.LENS_FACING_FRONT -> "Front"
        CameraCharacteristics.LENS_FACING_EXTERNAL -> "External"
        else -> "Unknown"
    }

    fun enumerateVideoCameras(cameraManager: CameraManager): List<CameraInfo> {
        val availableCameras: MutableList<CameraInfo> = mutableListOf()

        cameraManager.cameraIdList.forEach { id ->
            val characteristics = cameraManager.getCameraCharacteristics(id)
            val orientation = lensOrientationString(characteristics.get(CameraCharacteristics.LENS_FACING)!!)
            val capabilities = characteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)!!
            val cameraConfig = characteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)!!

            if(capabilities.contains(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE)) {
                val targetClass = MediaRecorder::class.java

                cameraConfig.getOutputSizes(targetClass).forEach { size ->
                    val secondsPerFrame = cameraConfig.getOutputMinFrameDuration(targetClass, size) / 1_000_000_000.0
                    val fps = if (secondsPerFrame > 0) (1.0 / secondsPerFrame).toInt() else 0
                    val fpsLabel = if (fps > 0) "$fps" else "N/A"
                    availableCameras.add( CameraInfo( "$orientation ($id) $size $fpsLabel FPS", id, size, fps ) )
                }
            }
        }
        return availableCameras
    }
}