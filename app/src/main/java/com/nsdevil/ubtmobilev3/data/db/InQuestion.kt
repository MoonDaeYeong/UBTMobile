package com.nsdevil.ubtmobilev3.data.db

import androidx.room.Entity

@Entity(tableName = "InQuestion", primaryKeys = ["id", "examCode"])
data class InQuestion (
    var category: String?,
    val question: String,
    val headerText: String,
    val difficultyLevel: String,
    val answerType: String,
    val userAnswers: String?,
    val checkCount: Int,
    val controlNo: String,
    val point: Float,
    val viewOrder: Int,
    val id: Int,
    val correctRate: String,
    val questionType: String,
    val incorrectNote: String,
    val option: String?,
    val time: Int = 0,
    var userCheck: Boolean = false,
    var examCode: String,
    var examQACode: String,
)