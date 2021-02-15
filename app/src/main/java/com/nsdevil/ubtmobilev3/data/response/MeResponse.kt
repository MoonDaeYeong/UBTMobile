package com.nsdevil.ubtmobilev3.data.response

import com.google.gson.annotations.SerializedName

data class MeResponse (
    @field:SerializedName("id")
    val id: Int,
    @field:SerializedName("username")
    val username: String,
    @field:SerializedName("firstName")
    val firstName: String,
    @field:SerializedName("lastName")
    val lastName: String,
    @field:SerializedName("email")
    val email: String,
    @field:SerializedName("phone")
    val phone: String,
    @field:SerializedName("userStatus")
    val userStatus: Any,
    @field:SerializedName("point")
    val point: Int,
    @field:SerializedName("reviewCount")
    val reviewCount: Int,
    @field:SerializedName("passType")
    val passType: Int,
    @field:SerializedName("createdAt")
    val createdAt: String,
    @field:SerializedName("updatedAt")
    val updatedAt: String,
    @field:SerializedName("image")
    val image: String,
    @field:SerializedName("birth")
    val birth: Any,
    @field:SerializedName("gender")
    val gender: Any,
    @field:SerializedName("user_organiz_cates")
    val user_organiz_cates: Any,
    @field:SerializedName("enabled")
    val enabled: Any
)