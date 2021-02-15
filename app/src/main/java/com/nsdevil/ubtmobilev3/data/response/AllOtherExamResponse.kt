package com.nsdevil.ubtmobilev3.data.response

data class AllOtherExamResponse(
    val content: List<Content>,
    val page: Int,
    val size: Int,
    val totalElements: Int,
    val totalPages: Int,
    val last: Boolean
) {
    data class Content(
        val ceatedAt: String,
        val examSdate: Long,
        val description: String,
        val examType: String,
        val resultSeeType: String,
        val recording: String,
        val variants: List<String>,
        val examPrice: Int,
        val regUser: String,
        val isFree: Any,
        val examTotalScore: Double,
        val updatedAt: String,
        val examCodeCount: Int,
        val reTake: String,
        val examName: String,
        val examStatus: String,
        val examSite: String,
        val realExam: Int,
        val statusControl: String,
        val examEdate: Long,
        val useFlag: String,
        val examId: Int,
        val regUserId: Int,
        val aiUse: String,
        val survey: Int,
        val examTime: String
    )
}