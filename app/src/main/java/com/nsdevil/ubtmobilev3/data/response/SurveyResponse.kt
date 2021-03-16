package com.nsdevil.ubtmobilev3.data.response

data class SurveyResponse(
    val success: Boolean,
    val message: String,
    val status: Int,
    val result: SurveyResult
) {
    data class SurveyResult(
        val survey: Int,
        val researchs: List<Researchs>
    ) {
        data class Researchs(
            val id: Int,
            val title: String,
            val memo: String,
            val organizId: Int,
            val questions: List<SurveyQuestions>
        ) {
            data class SurveyQuestions(
                val id: Int,
                val no: Int,
                val question: String,
                val answers: String,
                val type: Int,
                var checkedAnswers: String? = null
            )
        }
    }
}
