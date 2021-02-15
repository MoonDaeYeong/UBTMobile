package com.nsdevil.ubtmobilev3.data.request

import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @field:SerializedName("usernameOrEmail")  val usernameOrEmail: String,
    @field:SerializedName("password")  val password: String
)