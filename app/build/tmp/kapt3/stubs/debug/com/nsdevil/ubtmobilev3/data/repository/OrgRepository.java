package com.nsdevil.ubtmobilev3.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/nsdevil/ubtmobilev3/data/repository/OrgRepository;", "", "ubtService", "Lcom/nsdevil/ubtmobilev3/api/UbtService;", "(Lcom/nsdevil/ubtmobilev3/api/UbtService;)V", "examCodeRegister", "Lcom/nsdevil/ubtmobilev3/data/response/ExamCodeResponse;", "examCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrgExampleData", "Lcom/nsdevil/ubtmobilev3/data/response/OrgExamListResponse;", "orgId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerExam", "Lcom/nsdevil/ubtmobilev3/data/response/RegisterExamResponse;", "examId", "registerOrg", "Lcom/nsdevil/ubtmobilev3/data/response/RegisterOrgResponse;", "studentCode", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class OrgRepository {
    private final com.nsdevil.ubtmobilev3.api.UbtService ubtService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrgExampleData(int orgId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registerOrg(int orgId, @org.jetbrains.annotations.NotNull()
    java.lang.String studentCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.RegisterOrgResponse> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registerExam(int examId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.RegisterExamResponse> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object examCodeRegister(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.ExamCodeResponse> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public OrgRepository(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.api.UbtService ubtService) {
        super();
    }
}