package com.nsdevil.ubtmobilev3.data.model

data class SurveyAnswer (
    val id: Int,
    val no: Int,
    val answers: String? = null,
    var answerText: String? = null,
    var userCheck: Boolean = false,
    val type: Int
)