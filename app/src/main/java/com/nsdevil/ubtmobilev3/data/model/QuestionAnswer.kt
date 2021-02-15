package com.nsdevil.ubtmobilev3.data.model

import androidx.room.Embedded
import androidx.room.Relation
import com.nsdevil.ubtmobilev3.data.db.InAnswer
import com.nsdevil.ubtmobilev3.data.db.InQuestion

data class QuestionAnswer (
    @Embedded
    val question: InQuestion,

    @Relation(parentColumn = "examQACode", entityColumn = "examQACode")
    val answersList: List<InAnswer> = emptyList()
)