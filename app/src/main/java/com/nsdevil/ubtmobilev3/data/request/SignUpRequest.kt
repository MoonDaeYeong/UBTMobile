package com.nsdevil.ubtmobilev3.data.request

import com.google.gson.annotations.SerializedName

data class SignUpRequest (
    @field:SerializedName("firstname")
    val firstname: String,
    @field:SerializedName("lastname")
    val lastname: String,
    @field:SerializedName("username")
    val username: String,
    @field:SerializedName("email")
    val email: String,
    @field:SerializedName("password")
    val password: String,
    @field:SerializedName("type")
    val type: String = "student",
)