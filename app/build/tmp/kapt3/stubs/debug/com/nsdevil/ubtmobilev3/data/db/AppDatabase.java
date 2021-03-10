package com.nsdevil.ubtmobilev3.data.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.nsdevil.ubtmobilev3.data.db.Converters.class})
@androidx.room.Database(entities = {com.nsdevil.ubtmobilev3.data.db.InAnswer.class, com.nsdevil.ubtmobilev3.data.db.InData.class, com.nsdevil.ubtmobilev3.data.db.InExamInfo.class, com.nsdevil.ubtmobilev3.data.db.InQuestion.class}, version = 1, exportSchema = true)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/nsdevil/ubtmobilev3/data/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "answerDao", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswerDao;", "dataDao", "Lcom/nsdevil/ubtmobilev3/data/db/InDataDao;", "examInfoDao", "Lcom/nsdevil/ubtmobilev3/data/db/InExamInfoDao;", "questionDao", "Lcom/nsdevil/ubtmobilev3/data/db/InQuestionDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static volatile com.nsdevil.ubtmobilev3.data.db.AppDatabase instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.nsdevil.ubtmobilev3.data.db.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.nsdevil.ubtmobilev3.data.db.InAnswerDao answerDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.nsdevil.ubtmobilev3.data.db.InDataDao dataDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.nsdevil.ubtmobilev3.data.db.InExamInfoDao examInfoDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.nsdevil.ubtmobilev3.data.db.InQuestionDao questionDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/nsdevil/ubtmobilev3/data/db/AppDatabase$Companion;", "", "()V", "instance", "Lcom/nsdevil/ubtmobilev3/data/db/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.nsdevil.ubtmobilev3.data.db.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.nsdevil.ubtmobilev3.data.db.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}