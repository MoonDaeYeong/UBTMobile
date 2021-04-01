package com.nsdevil.ubtmobilev3.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Completable
import kotlinx.coroutines.flow.Flow

@Dao
interface InExamInfoDao {

    @Query("SELECT remainTime FROM InExamInfo WHERE examCode = :examCode")
    fun getRemainTime(examCode:String) : Flow<Int>

    @Query("SELECT * FROM InExamInfo WHERE examCode = :examCode")
    suspend fun getExamInfo(examCode: String) : InExamInfo?

    @Query("UPDATE InExamInfo SET remainTime = CASE WHEN remainTime <= 0 THEN 0 ELSE remainTime - 1 END WHERE examCode = :examCode")
    suspend fun updateRemainTime(examCode:String)

    @Query("UPDATE InExamInfo SET submissionYN = 1 WHERE examCode = :examCode")
    suspend fun updateSubmitCheck(examCode: String)

    @Query("UPDATE InExamInfo SET submissionYN = 0 AND remainTime = totalTime WHERE examCode = :examCode")
    suspend fun updateRetakeInfo(examCode: String)

    @Query("UPDATE InExamInfo SET remainTime = remainTime + :addTime WHERE examCode = :examCode")
    suspend fun updateAddTime(examCode: String, addTime: Int)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExamInfo(examInfo: InExamInfo)
}