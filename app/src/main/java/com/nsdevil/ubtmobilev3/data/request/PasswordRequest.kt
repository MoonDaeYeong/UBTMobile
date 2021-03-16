package com.nsdevil.ubtmobilev3.data.request

data class PasswordRequest(
    val newpass: String,
    val oldpass: String,
    val changeType:String = "sdfsdf"
)
