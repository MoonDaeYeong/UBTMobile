package com.nsdevil.ubtmobilev3.data.db

import androidx.room.*
import io.reactivex.Single
import kotlinx.coroutines.flow.Flow

@Dao
interface InAnswerDao {

    @Query("SELECT * FROM InAnswer WHERE examCode = :examCode")
    suspend fun getInAnswerList(examCode: String) : List<InAnswer>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAnswer(answerList: List<InAnswer>)

    @Update
    suspend fun updateAnswers(answerList: List<InAnswer>)
    @Query("UPDATE InQuestion SET userAnswers = :userAnswer WHERE examCode = :examCode AND viewOrder = :viewOrder")
    suspend fun updateQuestionUserAnswer(userAnswer:String?, examCode: String, viewOrder: Int)
    @Query("UPDATE InQuestion SET time = time + :stayTime WHERE examCode = :examCode AND viewOrder = :viewOrder")
    suspend fun updateQuestionTime(stayTime:Int, examCode: String, viewOrder: Int)
    @Transaction
    suspend fun updateAnswerData(answerList: List<InAnswer>, stayingTime: Int) : Boolean {
        updateAnswers(answerList)

        val updateString: MutableList<String> = mutableListOf()
        val textAnswerString: MutableList<String> = mutableListOf()

        answerList.forEach {
            if(it.userChk) {
                updateString.add(it.optionNumber)
                if(!it.textAnswer.isNullOrEmpty())
                    textAnswerString.add(it.textAnswer.toString())
            }
        }
        if(!textAnswerString.isNullOrEmpty())
            updateQuestionUserAnswer(textAnswerString.joinToString(), answerList.first().examCode, answerList.first().viewOrder)
        else if (!updateString.isNullOrEmpty())
            updateQuestionUserAnswer(updateString.joinToString(), answerList.first().examCode, answerList.first().viewOrder)
        else
            updateQuestionUserAnswer(null, answerList.first().examCode, answerList.first().viewOrder)

        updateQuestionTime(stayingTime, answerList.first().examCode, answerList.first().viewOrder)

        return true
    }
}