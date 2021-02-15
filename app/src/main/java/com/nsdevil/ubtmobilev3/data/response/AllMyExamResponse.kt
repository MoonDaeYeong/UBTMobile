package com.nsdevil.ubtmobilev3.data.response

data class AllMyExamResponse(
    val content: List<Content>,
    val page: Int,
    val size: Int,
    val totalElements: Int,
    val totalPages: Int,
    val last: Boolean
) {
    data class Content(
        val organizName: String,
        val examCode: String,
        val ceatedAt: String,
        val examSdate: String,
        val description: String,
        val resultSeeType: String,
        val recording: String,
        val variants: List<String>,
        val isFree: Any,
        val coverImage: String,
        val aiuse: String,
        val examineeName: String,
        val organizDesc: String,
        val payedDate: Long,
        val isEnded: Boolean,
        val examTotalScore: Float,
        val updatedAt: String,
        val variantResult: List<VariantResult>,
        val organizLogo: String,
        val organizId: Int,
        val reTake: String,
        val examName: String,
        val examStatus: String,
        val realExam: Int,
        val isStarted: Boolean,
        val examEdate: String,
        val examId: Int,
        val examTime: String
    ) {
        data class VariantResult(
            val variant: String,
            val examineeScore: Double,
            val givedCount: Int,
            val totalScore: Double,
            val totalQuestion: Int,
            val correctQuestionCount: Int
        )
    }
}