package com.nsdevil.ubtmobilev3.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/nsdevil/ubtmobilev3/data/db/InDataDao;", "", "getDataList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/nsdevil/ubtmobilev3/data/db/InData;", "examCode", "", "index", "", "getMediaList", "Lcom/nsdevil/ubtmobilev3/data/response/QuestionResponse$Result$Question$Data$MediaX;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertData", "", "answerList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface InDataDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM InData WHERE examCode = :examCode AND viewOrder = :index+1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.nsdevil.ubtmobilev3.data.db.InData>> getDataList(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode, int index);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT media FROM InData WHERE examCode = :examCode AND media IS NOT NULL")
    public abstract java.lang.Object getMediaList(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nsdevil.ubtmobilev3.data.response.QuestionResponse.Result.Question.Data.MediaX>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nsdevil.ubtmobilev3.data.db.InData> answerList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}