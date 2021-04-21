package com.nsdevil.ubtmobilev3.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/nsdevil/ubtmobilev3/viewmodels/HomeViewModel;", "Lcom/nsdevil/ubtmobilev3/base/BaseViewModel;", "repository", "Lcom/nsdevil/ubtmobilev3/data/repository/HomeRepository;", "(Lcom/nsdevil/ubtmobilev3/data/repository/HomeRepository;)V", "examCodeResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/nsdevil/ubtmobilev3/data/response/ExamCodeResponse;", "getExamCodeResult", "()Landroidx/lifecycle/MutableLiveData;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "homeDataResult", "Lcom/nsdevil/ubtmobilev3/data/response/HomeDataResponse;", "getHomeDataResult", "meDataResult", "Lcom/nsdevil/ubtmobilev3/data/response/MeResponse;", "getMeDataResult", "examCodeRegister", "", "examCode", "", "getExamCodeStatus", "getHomeData", "getMeData", "Companion", "app_debug"})
public final class HomeViewModel extends com.nsdevil.ubtmobilev3.base.BaseViewModel {
    private final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.MeResponse> meDataResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.HomeDataResponse> homeDataResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.ExamCodeResponse> examCodeResult = null;
    private final com.nsdevil.ubtmobilev3.data.repository.HomeRepository repository = null;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String imgUrl = "";
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String userName = "";
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String userEmail = "";
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Integer point = 0;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Integer examCount = 0;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Integer orgCount = 0;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String phoneNumber = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.nsdevil.ubtmobilev3.viewmodels.HomeViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.MeResponse> getMeDataResult() {
        return null;
    }
    
    public final void getMeData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.HomeDataResponse> getHomeDataResult() {
        return null;
    }
    
    public final void getHomeData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.ExamCodeResponse> getExamCodeResult() {
        return null;
    }
    
    public final void examCodeRegister(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode) {
    }
    
    public final void getExamCodeStatus() {
    }
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.repository.HomeRepository repository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lcom/nsdevil/ubtmobilev3/viewmodels/HomeViewModel$Companion;", "", "()V", "examCount", "", "getExamCount", "()Ljava/lang/Integer;", "setExamCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "imgUrl", "", "getImgUrl", "()Ljava/lang/String;", "setImgUrl", "(Ljava/lang/String;)V", "orgCount", "getOrgCount", "setOrgCount", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "point", "getPoint", "setPoint", "userEmail", "getUserEmail", "setUserEmail", "userName", "getUserName", "setUserName", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImgUrl() {
            return null;
        }
        
        public final void setImgUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUserName() {
            return null;
        }
        
        public final void setUserName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUserEmail() {
            return null;
        }
        
        public final void setUserEmail(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPoint() {
            return null;
        }
        
        public final void setPoint(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getExamCount() {
            return null;
        }
        
        public final void setExamCount(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getOrgCount() {
            return null;
        }
        
        public final void setOrgCount(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhoneNumber() {
            return null;
        }
        
        public final void setPhoneNumber(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        private Companion() {
            super();
        }
    }
}