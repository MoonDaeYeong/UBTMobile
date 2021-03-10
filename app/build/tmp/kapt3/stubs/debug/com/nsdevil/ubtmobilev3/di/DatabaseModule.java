package com.nsdevil.ubtmobilev3.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/nsdevil/ubtmobilev3/di/DatabaseModule;", "", "()V", "provideAnswerDao", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswerDao;", "appDatabase", "Lcom/nsdevil/ubtmobilev3/data/db/AppDatabase;", "provideAppDatabase", "context", "Landroid/content/Context;", "provideDataDao", "Lcom/nsdevil/ubtmobilev3/data/db/InDataDao;", "provideExamInfoDao", "Lcom/nsdevil/ubtmobilev3/data/db/InExamInfoDao;", "provideQuestionDao", "Lcom/nsdevil/ubtmobilev3/data/db/InQuestionDao;", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.nsdevil.ubtmobilev3.data.db.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.nsdevil.ubtmobilev3.data.db.InAnswerDao provideAnswerDao(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.nsdevil.ubtmobilev3.data.db.InDataDao provideDataDao(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.nsdevil.ubtmobilev3.data.db.InExamInfoDao provideExamInfoDao(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.nsdevil.ubtmobilev3.data.db.InQuestionDao provideQuestionDao(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.AppDatabase appDatabase) {
        return null;
    }
    
    public DatabaseModule() {
        super();
    }
}