package com.nsdevil.ubtmobilev3.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/nsdevil/ubtmobilev3/data/db/InExamInfoDao;", "", "getExamInfo", "Lcom/nsdevil/ubtmobilev3/data/db/InExamInfo;", "examCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemainTime", "Lkotlinx/coroutines/flow/Flow;", "", "insertExamInfo", "", "examInfo", "(Lcom/nsdevil/ubtmobilev3/data/db/InExamInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRemainTime", "updateSubmitCheck", "app_debug"})
public abstract interface InExamInfoDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT remainTime FROM InExamInfo WHERE examCode = :examCode")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getRemainTime(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM InExamInfo WHERE examCode = :examCode")
    public abstract java.lang.Object getExamInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.db.InExamInfo> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE InExamInfo SET remainTime = CASE WHEN remainTime <= 0 THEN 0 ELSE remainTime - 1 END WHERE examCode = :examCode")
    public abstract java.lang.Object updateRemainTime(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE InExamInfo SET submissionYN = 1 WHERE examCode = :examCode")
    public abstract java.lang.Object updateSubmitCheck(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertExamInfo(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.InExamInfo examInfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}