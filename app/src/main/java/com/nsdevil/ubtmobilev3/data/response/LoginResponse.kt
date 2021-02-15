package com.nsdevil.ubtmobilev3.data.response

import com.google.gson.annotations.SerializedName

data class LoginResponse (
    @field:SerializedName("accessToken")
    val accessToken: String,
    @field:SerializedName("tokenType")
    val tokenType: String,
    @field:SerializedName("u")
    val u: U
) {
    data class U (
        @field:SerializedName("passwordtype")
        val passwordtype: Int,
        @field:SerializedName("enabled")
        val enabled: Boolean
    )
}
