package com.nsdevil.ubtmobilev3.data.response

import com.google.gson.annotations.SerializedName

data class UploadResultResponse (
    @field:SerializedName("success")
    val success: Boolean,
    @field:SerializedName("message")
    val message: String,
    @field:SerializedName("status")
    val status: Int,
    @field:SerializedName("result")
    val result: UploadResult
) {
    data class UploadResult (
        @field:SerializedName("updatedAt")
        val updatedAt: String
    )
}