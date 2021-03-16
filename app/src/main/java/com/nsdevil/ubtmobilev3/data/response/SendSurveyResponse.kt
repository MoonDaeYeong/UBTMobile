package com.nsdevil.ubtmobilev3.data.response

data class SendSurveyResponse(
    val success: Boolean,
    val message: String,
    val status: Int,
    val result: SendSurveyResult
) {
    data class SendSurveyResult(
        val resultId: Int
    )
}
