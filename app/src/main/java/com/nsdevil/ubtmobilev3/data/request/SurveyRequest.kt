package com.nsdevil.ubtmobilev3.data.request

data class SurveyRequest (
    val examId: Int,
    val examCode: String,
    val examName: String,
    val researchs: List<SubResearch>
) {
    data class SubResearch(
        val id: Int,
        val questions: List<SubQuestions>
    ) {
        data class SubQuestions(
            val id: Int,
            val question: String,
            val answers: String,
            val checkedAnswers: String?,
            val type: Int
        )
    }
}
