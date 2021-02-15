package com.nsdevil.ubtmobilev3.data.response

data class ExamStatusResponse (
    val message: String,
    val result: Result,
    val status: Int,
    val success: Boolean
    ) {
    data class Result (
        val endDate: Long,
        val examId: Int,
        val startDate: Long,
        val status: String
        )
}