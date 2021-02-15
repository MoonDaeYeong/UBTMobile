package com.nsdevil.ubtmobilev3.data.response

import com.google.gson.annotations.SerializedName

data class ExamCodeResponse (
    @field:SerializedName("success")
    val success: Boolean,
    @field:SerializedName("message")
    val message: String?,
    @field:SerializedName("status")
    val status: Int,
    @field:SerializedName("result")
    val result: ExamCodeResult?
) {
    data class ExamCodeResult(
        val organizName: String? = null,
        val examCode: String? = null,
        val ceatedAt: String? = null,
        val examSdate: String? = null,
        val description: String? = null,
        val resultSeeType: String? = null,
        val variants: List<String>? = null,
        val organizUrl: String? = null,
        val organizPort: String? = null,
        val isFree: String? = null,
        val coverImage: String? = null,
        val examineeName: String? = null,
        val organizDesc: String? = null,
        val payedDate: String? = null,
        val expireDate: String? = null,
        val examTotalScore: String? = null,
        val updatedAt: String? = null,
        val organizLogo: String? = null,
        val organizId: String? = null,
        val examName: String? = null,
        val examStatus: String? = null,
        val examEdate: String? = null,
        val phone: String? = null,
        val examineeTotalScore: String? = null,
        val examId: String? = null,
        val examTime: String? = null
    )
}