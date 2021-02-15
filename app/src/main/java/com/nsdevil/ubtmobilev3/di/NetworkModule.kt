package com.nsdevil.ubtmobilev3.di

import com.nsdevil.ubtmobilev3.api.UbtService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideUbtService(): UbtService {
        return UbtService.create()
    }
}