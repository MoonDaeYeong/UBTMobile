package com.nsdevil.ubtmobilev3.data.response

import com.google.gson.annotations.SerializedName

data class OrgExamListResponse (
    @field:SerializedName("content")
    val content: List<Content>,
    @field:SerializedName("last")
    val last: Boolean,
    @field:SerializedName("page")
    val page: Int,
    @field:SerializedName("size")
    val size: Int,
    @field:SerializedName("totalElements")
    val totalElements: Int,
    @field:SerializedName("totalPages")
    val totalPages: Int
) {
    data class Content (
        @field:SerializedName("ceatedAt")
        val ceatedAt: String,
        @field:SerializedName("description")
        val description: String,
        @field:SerializedName("examCodeCount")
        val examCodeCount: Int,
        @field:SerializedName("examEdate")
        val examEdate: String,
        @field:SerializedName("examId")
        val examId: Int,
        @field:SerializedName("examName")
        val examName: String,
        @field:SerializedName("examPrice")
        val examPrice: Int,
        @field:SerializedName("examSdate")
        val examSdate: String,
        @field:SerializedName("examSite")
        val examSite: String,
        @field:SerializedName("examStatus")
        val examStatus: String,
        @field:SerializedName("examTime")
        val examTime: String,
        @field:SerializedName("examTotalScore")
        val examTotalScore: Int,
        @field:SerializedName("examType")
        val examType: String,
        @field:SerializedName("isFree")
        val isFree: Any,
        @field:SerializedName("reTake")
        val reTake: String,
        @field:SerializedName("realExam")
        val realExam: Int,
        @field:SerializedName("regUser")
        val regUser: String,
        @field:SerializedName("regUserId")
        val regUserId: Int,
        @field:SerializedName("resultSeeType")
        val resultSeeType: String,
        @field:SerializedName("statusControl")
        val statusControl: String,
        @field:SerializedName("survey")
        val survey: Int,
        @field:SerializedName("updatedAt")
        val updatedAt: String,
        @field:SerializedName("useFlag")
        val useFlag: String,
        @field:SerializedName("variants")
        val variants: List<String>
    )
}