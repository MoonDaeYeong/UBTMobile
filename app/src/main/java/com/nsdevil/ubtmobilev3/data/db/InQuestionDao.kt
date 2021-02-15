package com.nsdevil.ubtmobilev3.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.nsdevil.ubtmobilev3.data.model.QuestionAnswer
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import kotlinx.coroutines.flow.Flow

@Dao
interface InQuestionDao {

    @Query("SELECT * FROM InQuestion WHERE examCode = :examCode")
    fun getWholeList(examCode: String): Flow<List<InQuestion>>
    @Query("SELECT * FROM InQuestion WHERE examCode = :examCode AND userAnswers IS NOT NULL")
    fun getCompletedList(examCode: String): Flow<List<InQuestion>>
    @Query("SELECT * FROM InQuestion WHERE examCode = :examCode AND userAnswers IS NULL")
    fun getUnCompletedList(examCode: String): Flow<List<InQuestion>>
    @Query("SELECT * FROM InQuestion WHERE examCode = :examCode AND userCheck = 1")
    fun getCheckList(examCode: String): Flow<List<InQuestion>>

    @Query("SELECT * FROM InQuestion WHERE examCode = :examCode AND viewOrder = :index+1 AND examQACode IN (SELECT examQACode FROM InAnswer AS A WHERE A.examCode = :examCode)")
    fun getQuestionAnswer(examCode: String, index: Int) : Flow<QuestionAnswer>

    @Query("SELECT * FROM InQuestion WHERE examCode = :examCode AND examQACode IN (SELECT examQACode FROM InAnswer AS A WHERE A.examCode = :examCode)")
    suspend fun getQuestionAnswerList(examCode: String) : List<QuestionAnswer>

    @Query("SELECT COUNT(id) FROM InQuestion WHERE examCode = :examCode")
    fun getTotalCount(examCode: String): Flow<Int>
    @Query("SELECT COUNT(id) FROM InQuestion WHERE examCode = :examCode AND userAnswers IS NULL")
    fun getRemainCount(examCode: String): Flow<Int>

    @Query("UPDATE InQuestion SET userCheck = CASE WHEN userCheck = 0 THEN 1 ELSE userCheck = 0 END WHERE examCode = :examCode AND viewOrder = :index+1")
    suspend fun updateUserCheck(examCode: String, index: Int)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertQuestion(inQuestionList: List<InQuestion>)
}