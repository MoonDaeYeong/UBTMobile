package com.nsdevil.ubtmobilev3.data.response

data class RegisterExamResponse(
    val success: Boolean,
    val message: String,
    val status: Int,
    val result: String?
)