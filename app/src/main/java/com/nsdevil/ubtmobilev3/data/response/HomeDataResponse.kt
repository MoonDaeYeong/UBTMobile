package com.nsdevil.ubtmobilev3.data.response

import com.google.gson.annotations.SerializedName
import java.io.Serializable

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
        val latestExams: List<LatestExam>,
        @field:SerializedName("organizs")
        val organizs: List<Organiz>,
        @field:SerializedName("myorganizs")
        val myorganizs: List<Myorganiz>,
        @field:SerializedName("userexams")
        val userexams: List<UserExam>,
        @field:SerializedName("myOrganizCount")
        val myOrganizCount: Int
    ) {
        data class UserExam(
            @field:SerializedName("organizName")
            val organizName: String,
            @field:SerializedName("examCode")
            val examCode: String,
            @field:SerializedName("ceatedAt")
            val ceatedAt: String,
            @field:SerializedName("examSdate")
            val examSdate: String,
            @field:SerializedName("description")
            val description: String,
            @field:SerializedName("resultSeeType")
            val resultSeeType: String,
            @field:SerializedName("variants")
            val variants: List<String>,
            @field:SerializedName("organizUrl")
            val organizUrl: String,
            @field:SerializedName("organizPort")
            val organizPort: String,
            @field:SerializedName("isFree")
            val isFree: Any,
            @field:SerializedName("coverImage")
            val coverImage: String,
            @field:SerializedName("examineeName")
            val examineeName: String,
            @field:SerializedName("organizDesc")
            val organizDesc: String,
            @field:SerializedName("payedDate")
            val payedDate: String,
            @field:SerializedName("expireDate")
            val expireDate: String,
            @field:SerializedName("examTotalScore")
            val examTotalScore: Float,
            @field:SerializedName("updatedAt")
            val updatedAt: String,
            @field:SerializedName("organizLogo")
            val organizLogo: String,
            @field:SerializedName("organizId")
            val organizId: Int,
            @field:SerializedName("examName")
            val examName: String,
            @field:SerializedName("examStatus")
            val examStatus: String,
            @field:SerializedName("examEdate")
            val examEdate: String,
            @field:SerializedName("phone")
            val phone: String,
            @field:SerializedName("examineeTotalScore")
            val examineeTotalScore: Any,
            @field:SerializedName("examId")
            val examId: Int,
            @field:SerializedName("examTime")
            val examTime: String
        )

        data class LatestExam (
            @field:SerializedName("organizName")
            val organizName: String,
            @field:SerializedName("organizLogo")
            val organizLogo: String,
            @field:SerializedName("organizId")
            val organizId: Int,
            @field:SerializedName("ceatedAt")
            val ceatedAt: String,
            @field:SerializedName("examName")
            val examName: String,
            @field:SerializedName("examSdate")
            val examSdate: String,
            @field:SerializedName("examStatus")
            val examStatus: String,
            @field:SerializedName("description")
            val description: String,
            @field:SerializedName("examEdate")
            val examEdate: String,
            @field:SerializedName("organizUrl")
            val organizUrl: String,
            @field:SerializedName("organizPort")
            val organizPort: String,
            @field:SerializedName("isFree")
            val isFree: Any,
            @field:SerializedName("phone")
            val phone: String,
            @field:SerializedName("coverImage")
            val coverImage: String,
            @field:SerializedName("examId")
            val examId: Int,
            @field:SerializedName("organizDesc")
            val organizDesc: String,
            @field:SerializedName("examTotalScore")
            val examTotalScore: Float,
            @field:SerializedName("examTime")
            val examTime: String,
            @field:SerializedName("updatedAt")
            val updatedAt: String
        )

        data class Myorganiz(
            @field:SerializedName("organizUrl")
            val organizUrl: String,
            @field:SerializedName("organizName")
            val organizName: String,
            @field:SerializedName("organizPort")
            val organizPort: String,
            @field:SerializedName("organizLogo")
            val organizLogo: String,
            @field:SerializedName("organizId")
            val organizId: Int,
            @field:SerializedName("phone")
            val phone: String,
            @field:SerializedName("coverImage")
            val coverImage: String,
            @field:SerializedName("isMy")
            val isMy: Boolean,
            @field:SerializedName("description")
            val description: String,
            @field:SerializedName("organizType")
            val organizType: String
        )

        data class Organiz(
            @field:SerializedName("organizUrl")
            val organizUrl: String,
            @field:SerializedName("organizName")
            val organizName: String,
            @field:SerializedName("organizPort")
            val organizPort: String,
            @field:SerializedName("organizLogo")
            val organizLogo: String,
            @field:SerializedName("organizId")
            val organizId: Int,
            @field:SerializedName("phone")
            val phone: String,
            @field:SerializedName("coverImage")
            val coverImage: String,
            @field:SerializedName("isMy")
            val isMy: Boolean,
            @field:SerializedName("description")
            val description: String,
            @field:SerializedName("organizType")
            val organizType: String
        )
    }
}
