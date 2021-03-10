package com.nsdevil.ubtmobilev3.data.response

import com.google.gson.annotations.SerializedName

data class HomeDataResponse (
    @field:SerializedName("msg")
    val msg: String,
    @field:SerializedName("result")
    val result: Result,
    @field:SerializedName("status")
    val status: String
) {
    data class Result(
        @field:SerializedName("myExamCount")
        val myExamCount: Int,
        @field:SerializedName("latestexams")
        val latestexams: List<Latestexam>,
        @field:SerializedName("organizs")
        val organizs: List<Organiz>,
        @field:SerializedName("myorganizs")
        val myorganizs: List<Myorganiz>,
        @field:SerializedName("userexams")
        val userexams: List<Userexam>,
        @field:SerializedName("myOrganizCount")
        val myOrganizCount: Int
    ) {
        data class Latestexam (
            val organizName: String,
            val organizLogo: String,
            val organizId: Int,
            val ceatedAt: String,
            val examName: String,
            val examSdate: String,
            val examStatus: String,
            val description: String,
            val examEdate: String,
            val organizUrl: String,
            val organizPort: String,
            val isFree: Any?,
            val phone: String,
            val faceLogin: Int?,
            val coverImage: String,
            val examId: Int,
            val organizDesc: String,
            val examTotalScore: Double,
            val examTime: String,
            val updatedAt: String
        )

        data class Organiz(
            val organizUrl: String,
            val organizName: String,
            val organizPort: String,
            val organizLogo: String,
            val organizId: Int,
            val phone: String,
            val coverImage: String,
            val isMy: Boolean,
            val description: String,
            val organizType: String
        )

        data class Myorganiz(
            val organizUrl: String,
            val organizName: String,
            val organizPort: String,
            val organizLogo: String,
            val organizId: Int,
            val phone: String,
            val coverImage: String,
            val isMy: Boolean,
            val description: String,
            val organizType: String
        )

        data class Userexam(
            val organizName: String,
            val examCode: String,
            val ceatedAt: String,
            val examSdate: String,
            val recording: String,
            val description: String,
            val resultSeeType: String,
            val variants: List<String>,
            val organizUrl: String,
            val organizPort: String,
            val isFree: Any?,
            val coverImage: String,
            val faceLogin: Int?,
            val aiuse: String,
            val examineeName: String,
            val organizDesc: String,
            val payedDate: String,
            val expireDate: String,
            val examTotalScore: Double,
            val updatedAt: String,
            val organizLogo: String,
            val organizId: Int,
            val reTake: String,
            val examName: String,
            val examStatus: String,
            val realExam: Int,
            val examEdate: String,
            val phone: String,
            val examineeTotalScore: Any?,
            val examId: Int,
            val examTime: String
        )
    }
}
