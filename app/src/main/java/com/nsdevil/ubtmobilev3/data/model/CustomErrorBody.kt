package com.nsdevil.ubtmobilev3.data.model

import com.google.gson.annotations.SerializedName

data class CustomErrorBody(
    @field:SerializedName("message")
    val message: String?
)