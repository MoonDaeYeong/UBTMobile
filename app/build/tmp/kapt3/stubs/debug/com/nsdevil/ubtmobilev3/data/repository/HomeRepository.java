package com.nsdevil.ubtmobilev3.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/nsdevil/ubtmobilev3/data/repository/HomeRepository;", "", "ubtService", "Lcom/nsdevil/ubtmobilev3/api/UbtService;", "(Lcom/nsdevil/ubtmobilev3/api/UbtService;)V", "examCodeRegister", "Lcom/nsdevil/ubtmobilev3/data/response/ExamCodeResponse;", "examCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExamCodeStatus", "Lcom/nsdevil/ubtmobilev3/data/response/AllMyExamResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeData", "Lio/reactivex/Single;", "Lcom/nsdevil/ubtmobilev3/data/response/HomeDataResponse;", "getMeData", "Lcom/nsdevil/ubtmobilev3/data/response/MeResponse;", "app_debug"})
public final class HomeRepository {
    private final com.nsdevil.ubtmobilev3.api.UbtService ubtService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.nsdevil.ubtmobilev3.data.response.MeResponse> getMeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.nsdevil.ubtmobilev3.data.response.HomeDataResponse> getHomeData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object examCodeRegister(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.ExamCodeResponse> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getExamCodeStatus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public HomeRepository(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.api.UbtService ubtService) {
        super();
    }
}