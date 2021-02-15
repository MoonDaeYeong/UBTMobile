package com.nsdevil.ubtmobilev3.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "InExamInfo")
data class InExamInfo (
    val examId: Int,
    @PrimaryKey
    val examCode: String,
    val examName: String,
    val totalTime: Int,
    var remainTime: Int = -1,
    val submissionYN: Boolean = false
)