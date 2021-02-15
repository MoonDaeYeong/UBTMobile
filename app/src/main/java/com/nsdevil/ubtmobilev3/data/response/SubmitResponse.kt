package com.nsdevil.ubtmobilev3.data.response

import com.google.gson.annotations.SerializedName

data class SubmitResponse (
    @field:SerializedName("success")
    val success: Boolean,
    @field:SerializedName("message")
    val message: String,
    @field:SerializedName("status")
    val status: Int,
    @field:SerializedName("result")
    val result: Result,
) {
    data class Result (
        @field:SerializedName("resultId")
        val resultId: String
    )
}