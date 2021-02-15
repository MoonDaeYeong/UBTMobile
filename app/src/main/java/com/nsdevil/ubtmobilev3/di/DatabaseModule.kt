package com.nsdevil.ubtmobilev3.di

import android.content.Context
import com.nsdevil.ubtmobilev3.data.db.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context) : AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Provides
    fun provideAnswerDao(appDatabase: AppDatabase) : InAnswerDao {
        return appDatabase.answerDao()
    }

    @Provides
    fun provideDataDao(appDatabase: AppDatabase) : InDataDao {
        return appDatabase.dataDao()
    }

    @Provides
    fun provideExamInfoDao(appDatabase: AppDatabase): InExamInfoDao {
        return appDatabase.examInfoDao()
    }

    @Provides
    fun provideQuestionDao(appDatabase: AppDatabase) : InQuestionDao {
        return appDatabase.questionDao()
    }
}