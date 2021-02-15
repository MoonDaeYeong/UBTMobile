package com.nsdevil.ubtmobilev3.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.nsdevil.ubtmobilev3.data.response.QuestionResponse
import io.reactivex.Single
import kotlinx.coroutines.flow.Flow

@Dao
interface InDataDao {

    @Query("SELECT * FROM InData WHERE examCode = :examCode AND viewOrder = :index+1")
    fun getDataList(examCode: String, index: Int) : Flow<List<InData>>

    @Query("SELECT media FROM InData WHERE examCode = :examCode AND media IS NOT NULL")
    suspend fun getMediaList(examCode:String) : List<QuestionResponse.Result.Question.Data.MediaX>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertData(answerList: List<InData>)
}