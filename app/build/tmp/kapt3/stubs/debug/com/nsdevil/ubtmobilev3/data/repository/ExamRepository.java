package com.nsdevil.ubtmobilev3.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017J\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00180\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017J\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017J\u0019\u0010\'\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\'\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00182\u0006\u0010/\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u0011\u00101\u001a\u000202H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0011\u00103\u001a\u000202H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u00104\u001a\u0002022\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J)\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006>"}, d2 = {"Lcom/nsdevil/ubtmobilev3/data/repository/ExamRepository;", "", "examInfoDao", "Lcom/nsdevil/ubtmobilev3/data/db/InExamInfoDao;", "questionDao", "Lcom/nsdevil/ubtmobilev3/data/db/InQuestionDao;", "dataDao", "Lcom/nsdevil/ubtmobilev3/data/db/InDataDao;", "answerDao", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswerDao;", "ubtService", "Lcom/nsdevil/ubtmobilev3/api/UbtService;", "(Lcom/nsdevil/ubtmobilev3/data/db/InExamInfoDao;Lcom/nsdevil/ubtmobilev3/data/db/InQuestionDao;Lcom/nsdevil/ubtmobilev3/data/db/InDataDao;Lcom/nsdevil/ubtmobilev3/data/db/InAnswerDao;Lcom/nsdevil/ubtmobilev3/api/UbtService;)V", "examCode", "", "getExamCode", "()Ljava/lang/String;", "aiAlertSignal", "Lcom/nsdevil/ubtmobilev3/data/response/AiDataResponse;", "params", "Lcom/nsdevil/ubtmobilev3/data/request/HeadPosRequest;", "(Lcom/nsdevil/ubtmobilev3/data/request/HeadPosRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCheckList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/nsdevil/ubtmobilev3/data/db/InQuestion;", "getCompletedList", "getDataList", "Lcom/nsdevil/ubtmobilev3/data/db/InData;", "index", "", "getQuestionAnswer", "Lcom/nsdevil/ubtmobilev3/data/model/QuestionAnswer;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuestionList", "getRemainCount", "getRemainTime", "getTotalCount", "getUnCompletedList", "submit", "Lcom/nsdevil/ubtmobilev3/data/response/SubmitResponse;", "Lcom/nsdevil/ubtmobilev3/data/request/SubmissionRequest;", "(Lcom/nsdevil/ubtmobilev3/data/request/SubmissionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAnswerData", "", "answerList", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "stayingTime", "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRemainTime", "", "updateSubmitCheck", "updateUserCheck", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadResultFile", "Lcom/nsdevil/ubtmobilev3/data/response/UploadResultResponse;", "resultId", "Lokhttp3/RequestBody;", "signature", "Lokhttp3/MultipartBody$Part;", "ailog", "(Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ExamRepository {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String examCode = null;
    private final com.nsdevil.ubtmobilev3.data.db.InExamInfoDao examInfoDao = null;
    private final com.nsdevil.ubtmobilev3.data.db.InQuestionDao questionDao = null;
    private final com.nsdevil.ubtmobilev3.data.db.InDataDao dataDao = null;
    private final com.nsdevil.ubtmobilev3.data.db.InAnswerDao answerDao = null;
    private final com.nsdevil.ubtmobilev3.api.UbtService ubtService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExamCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.nsdevil.ubtmobilev3.data.db.InQuestion>> getQuestionList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.nsdevil.ubtmobilev3.data.db.InQuestion>> getCompletedList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.nsdevil.ubtmobilev3.data.db.InQuestion>> getUnCompletedList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.nsdevil.ubtmobilev3.data.db.InQuestion>> getCheckList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.nsdevil.ubtmobilev3.data.model.QuestionAnswer> getQuestionAnswer(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.nsdevil.ubtmobilev3.data.db.InData>> getDataList(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getRemainTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateRemainTime(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getTotalCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getRemainCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUserCheck(int index, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateAnswerData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nsdevil.ubtmobilev3.data.db.InAnswer> answerList, int stayingTime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getQuestionAnswer(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nsdevil.ubtmobilev3.data.model.QuestionAnswer>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object submit(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.request.SubmissionRequest params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.SubmitResponse> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadResultFile(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody resultId, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part signature, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part ailog, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.UploadResultResponse> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateSubmitCheck(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object aiAlertSignal(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.request.HeadPosRequest params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.AiDataResponse> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public ExamRepository(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.InExamInfoDao examInfoDao, @org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.InQuestionDao questionDao, @org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.InDataDao dataDao, @org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.db.InAnswerDao answerDao, @org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.api.UbtService ubtService) {
        super();
    }
}