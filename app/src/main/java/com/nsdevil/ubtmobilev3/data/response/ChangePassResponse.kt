package com.nsdevil.ubtmobilev3.data.response

data class ChangePassResponse (
    val success: Boolean,
    val message: String,
    val status: Int,
    val result: Any?
)