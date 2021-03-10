package com.nsdevil.ubtmobilev3.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\'J\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'J!\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/nsdevil/ubtmobilev3/data/db/InQuestionDao;", "", "getCheckList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/nsdevil/ubtmobilev3/data/db/InQuestion;", "examCode", "", "getCompletedList", "getQuestionAnswer", "Lcom/nsdevil/ubtmobilev3/data/model/QuestionAnswer;", "index", "", "getQuestionAnswerList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemainCount", "getTotalCount", "getUnCompletedList", "getWholeList", "insertQuestion", "", "inQuestionList", "updateUserCheck", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface InQuestionDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM InQuestion WHERE examCode = :examCode")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.nsdevil.ubtmobilev3.data.db.InQuestion>> getWholeList(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM InQuestion WHERE examCode = :examCode AND userAnswers IS NOT NULL")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.nsdevil.ubtmobilev3.data.db.InQuestion>> getCompletedList(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM InQuestion WHERE examCode = :examCode AND userAnswers IS NULL")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.nsdevil.ubtmobilev3.data.db.InQuestion>> getUnCompletedList(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM InQuestion WHERE examCode = :examCode AND userCheck = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.nsdevil.ubtmobilev3.data.db.InQuestion>> getCheckList(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM InQuestion WHERE examCode = :examCode AND viewOrder = :index+1 AND examQACode IN (SELECT examQACode FROM InAnswer AS A WHERE A.examCode = :examCode)")
    public abstract kotlinx.coroutines.flow.Flow<com.nsdevil.ubtmobilev3.data.model.QuestionAnswer> getQuestionAnswer(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode, int index);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM InQuestion WHERE examCode = :examCode AND examQACode IN (SELECT examQACode FROM InAnswer AS A WHERE A.examCode = :examCode)")
    public abstract java.lang.Object getQuestionAnswerList(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nsdevil.ubtmobilev3.data.model.QuestionAnswer>> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(id) FROM InQuestion WHERE examCode = :examCode")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getTotalCount(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(id) FROM InQuestion WHERE examCode = :examCode AND userAnswers IS NULL")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getRemainCount(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE InQuestion SET userCheck = CASE WHEN userCheck = 0 THEN 1 ELSE userCheck = 0 END WHERE examCode = :examCode AND viewOrder = :index+1")
    public abstract java.lang.Object updateUserCheck(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode, int index, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertQuestion(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nsdevil.ubtmobilev3.data.db.InQuestion> inQuestionList);
}