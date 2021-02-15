package com.nsdevil.ubtmobilev3.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nsdevil.ubtmobilev3.data.response.QuestionResponse

@Entity(tableName = "InData")
data class InData(
    val dataOrder: Int?,
    val dataText: String?,
    @PrimaryKey
    val id: Int,
    var viewOrder: Int,
    var examCode: String,
    var media: QuestionResponse.Result.Question.Data.MediaX?
)