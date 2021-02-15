package com.nsdevil.ubtmobilev3.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import com.nsdevil.ubtmobilev3.utilities.DATABASE_NAME

@Database(entities = [InAnswer::class, InData::class, InExamInfo::class, InQuestion::class], version = 1, exportSchema = true)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun answerDao(): InAnswerDao
    abstract fun dataDao(): InDataDao
    abstract fun examInfoDao(): InExamInfoDao
    abstract fun questionDao(): InQuestionDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null

        fun getInstance(context: Context) : AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context) : AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).addCallback(object : RoomDatabase.Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    println("Database onCreate")
                }
            }).build()
        }
    }
}