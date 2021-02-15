package com.nsdevil.ubtmobilev3.data.response

import com.google.gson.annotations.SerializedName

data class QuestionResponse(
    @field:SerializedName("message")
    val message: String,
    @field:SerializedName("result")
    val result: Result,
    @field:SerializedName("status")
    val status: Int,
    @field:SerializedName("success")
    val success: Boolean
) {
    data class Result(
        @field:SerializedName("questions")
        val questions: List<Question>,
        @field:SerializedName("survey")
        val survey: Int,
        @field:SerializedName("zipName")
        val zipName: String
    ) {
        data class Question(
            @field:SerializedName("answerType")
            val answerType: String,
            @field:SerializedName("answers")
            val answers: List<Answer>,
            @field:SerializedName("cate1")
            val cate1: String,
            @field:SerializedName("cate2")
            val cate2: String,
            @field:SerializedName("cate3")
            val cate3: String,
            @field:SerializedName("checkCount")
            val checkCount: Int,
            @field:SerializedName("controlNo")
            val controlNo: String,
            @field:SerializedName("correctRate")
            val correctRate: String,
            @field:SerializedName("datas")
            val datas: List<Data>,
            @field:SerializedName("difficultyLevel")
            val difficultyLevel: String,
            @field:SerializedName("headerText")
            val headerText: String,
            @field:SerializedName("id")
            val id: Int,
            @field:SerializedName("incorrectNote")
            val incorrectNote: String,
            @field:SerializedName("option")
            val option: String,
            @field:SerializedName("point")
            val point: Float,
            @field:SerializedName("question")
            val question: String,
            @field:SerializedName("questionLevel")
            val questionLevel: Any,
            @field:SerializedName("questionType")
            val questionType: String,
            @field:SerializedName("viewOrder")
            val viewOrder: Int,
            @field:SerializedName("wrongs")
            val wrongs: List<Any>
        ) {
            data class Answer(
                @field:SerializedName("answer")
                val answer: String,
                @field:SerializedName("answerFlag")
                val answerFlag: String,
                @field:SerializedName("drawingData")
                val drawingData: Any,
                @field:SerializedName("id")
                val id: Int,
                @field:SerializedName("media")
                val media: Media?,
                @field:SerializedName("optionNumber")
                val optionNumber: String,
                @field:SerializedName("order")
                val order: Int,
                @field:SerializedName("trueData")
                val trueData: String?,

                var userAnswer: String? = null
            ) {
                data class Media(
                    @field:SerializedName("fileName")
                    val fileName: String,
                    @field:SerializedName("id")
                    val id: Int,
                    @field:SerializedName("mediaType")
                    val mediaType: String
                )
            }

            data class Data (
                @field:SerializedName("dataOrder")
                val dataOrder: Int,
                @field:SerializedName("dataText")
                val dataText: String,
                @field:SerializedName("dataType")
                val dataType: Any,
                @field:SerializedName("id")
                val id: Int,
                @field:SerializedName("media")
                val media: MediaX?
            ) {
                data class MediaX(
                    @field:SerializedName("fileName")
                    val fileName: String?,
                    @field:SerializedName("id")
                    val id: Int?,
                    @field:SerializedName("mediaType")
                    val mediaType: String?,
                    @field:SerializedName("useFlag")
                    val useFlag: Any?
                )
            }
        }
    }
}
