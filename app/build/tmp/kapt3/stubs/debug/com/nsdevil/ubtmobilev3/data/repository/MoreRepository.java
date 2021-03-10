package com.nsdevil.ubtmobilev3.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/nsdevil/ubtmobilev3/data/repository/MoreRepository;", "", "ubtService", "Lcom/nsdevil/ubtmobilev3/api/UbtService;", "(Lcom/nsdevil/ubtmobilev3/api/UbtService;)V", "getAllMyExamList", "Lcom/nsdevil/ubtmobilev3/data/response/AllMyExamResponse;", "examName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOrg", "Lcom/nsdevil/ubtmobilev3/data/response/AllOrgResponse;", "type", "organizName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOtherExamList", "Lcom/nsdevil/ubtmobilev3/data/response/AllOtherExamResponse;", "app_debug"})
public final class MoreRepository {
    private final com.nsdevil.ubtmobilev3.api.UbtService ubtService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllMyExamList(@org.jetbrains.annotations.NotNull()
    java.lang.String examName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllOtherExamList(@org.jetbrains.annotations.NotNull()
    java.lang.String examName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.AllOtherExamResponse> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllOrg(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String organizName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.AllOrgResponse> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public MoreRepository(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.api.UbtService ubtService) {
        super();
    }
}