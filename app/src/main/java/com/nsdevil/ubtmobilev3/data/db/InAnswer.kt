package com.nsdevil.ubtmobilev3.data.db

import androidx.room.Entity

@Entity(tableName = "InAnswer", primaryKeys = ["id", "examCode"])
data class InAnswer (
    val answerFlag: String?,
    val answerTrueData: String?,
    val answer: String,
    val optionNumber: String,
    var questionType: String,
    val id: Int,
    val order: Int,
    var answerType: String,
    var checkCount: Int,
    var questionId: Int,
    var examCode: String,
    var viewOrder: Int,
    var userChk: Boolean = false,
    var textAnswer: String? = "",
    var fileName: String? = "",
    var mediaType: String? = "",
    var examQACode: String
)