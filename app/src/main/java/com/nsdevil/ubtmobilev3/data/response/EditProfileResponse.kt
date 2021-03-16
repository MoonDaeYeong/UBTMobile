package com.nsdevil.ubtmobilev3.data.response

data class EditProfileResponse (
    val success: Boolean,
    val message: String,
    val status: Int,
    val result: ProfileResult
    ) {
    data class ProfileResult (
        val updatedAt: String
        )
}