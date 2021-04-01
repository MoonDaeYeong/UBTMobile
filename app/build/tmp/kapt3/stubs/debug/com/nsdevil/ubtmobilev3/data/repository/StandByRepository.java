package com.nsdevil.ubtmobilev3.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J<\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020!0+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020!0+2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020!0.J\u0014\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00103\u001a\u00020\u000eJ\u0019\u00104\u001a\u00020!2\u0006\u00105\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00066"}, d2 = {"Lcom/nsdevil/ubtmobilev3/data/repository/StandByRepository;", "", "ubtService", "Lcom/nsdevil/ubtmobilev3/api/UbtService;", "examInfoDao", "Lcom/nsdevil/ubtmobilev3/data/db/InExamInfoDao;", "answerDao", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswerDao;", "dataDao", "Lcom/nsdevil/ubtmobilev3/data/db/InDataDao;", "questionDao", "Lcom/nsdevil/ubtmobilev3/data/db/InQuestionDao;", "(Lcom/nsdevil/ubtmobilev3/api/UbtService;Lcom/nsdevil/ubtmobilev3/data/db/InExamInfoDao;Lcom/nsdevil/ubtmobilev3/data/db/InAnswerDao;Lcom/nsdevil/ubtmobilev3/data/db/InDataDao;Lcom/nsdevil/ubtmobilev3/data/db/InQuestionDao;)V", "examCode", "", "getExamCode", "()Ljava/lang/String;", "getExamInfo", "Lcom/nsdevil/ubtmobilev3/data/db/InExamInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExamStatus", "Lcom/nsdevil/ubtmobilev3/data/response/ExamStatusResponse;", "getInAnswerList", "", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "getMediaList", "Lcom/nsdevil/ubtmobilev3/data/response/QuestionResponse$Result$Question$Data$MediaX;", "getQuestionSus", "Lcom/nsdevil/ubtmobilev3/data/response/QuestionResponse;", "examId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initInsertReadyData", "", "questions", "Lcom/nsdevil/ubtmobilev3/data/response/QuestionResponse$Result$Question;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertExamInfo", "examInfo", "(Lcom/nsdevil/ubtmobilev3/data/db/InExamInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reTakeExam", "Lkotlinx/coroutines/flow/Flow;", "onStart", "Lkotlin/Function0;", "onComplete", "onThrowable", "Lkotlin/Function1;", "", "requestFile", "Lio/reactivex/Flowable;", "Lokhttp3/ResponseBody;", "fileName", "updateAddTime", "addTime", "app_debug"})
public final class StandByRepository {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String examCode = null;
    private final com.nsdevil.ubtmobilev3.api.UbtService ubtService = null;
    private final com.nsdevil.ubtmobilev3.data.db.InExamInfoDao examInfoDao = null;
    private final com.nsdevil.ubtmobilev3.data.db.InAnswerDao answerDao = null;
    private final com.nsdevil.ubtmobilev3.data.db.InDataDao dataDao = null;
    private final com.nsdevil.ubtmobilev3.data.db.InQuestionDao questionDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExamCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<okhttp3.ResponseBody> requestFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getQuestionSus(int examId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.QuestionResponse> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getExamStatus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.ExamStatusResponse> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getExamInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.db.InExamInfo> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getInAnswerList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nsdevil.ubtmobilev3.data.db.InAnswer>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMediaList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nsdevil.ubtmobilev3.data.response.QuestionResponse.Result.Question.Data.MediaX>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertExamInfo(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.InExamInfo examInfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateAddTime(int addTime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object initInsertReadyData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nsdevil.ubtmobilev3.data.response.QuestionResponse.Result.Question> questions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> reTakeExam(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onStart, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onThrowable) {
        return null;
    }
    
    @javax.inject.Inject()
    public StandByRepository(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.api.UbtService ubtService, @org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.InExamInfoDao examInfoDao, @org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.InAnswerDao answerDao, @org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.InDataDao dataDao, @org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.InQuestionDao questionDao) {
        super();
    }
}