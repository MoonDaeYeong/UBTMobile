package com.nsdevil.ubtmobilev3.data.request

data class SubmissionRequest (
    val examId: Int,
    val examCode: String,
    val examName: String,
    val questions: List<Questions>
    ) {
    data class Questions (
        val qId: String,
        val controlNo: String,
        val variant: String,
        val paint: String,
        val like: String,
        val memo: String,
        val time: String,
        val answers: List<Answers> = emptyList()
    ) {
        data class Answers (
            val answerId: String,
            val answerFlag: String,
            val answerTrueData: String,
            val answerData: String
        )
    }
}