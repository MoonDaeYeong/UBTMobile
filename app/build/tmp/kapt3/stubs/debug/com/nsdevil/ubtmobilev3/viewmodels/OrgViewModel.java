package com.nsdevil.ubtmobilev3.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001aJ\u0016\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/nsdevil/ubtmobilev3/viewmodels/OrgViewModel;", "Lcom/nsdevil/ubtmobilev3/base/BaseViewModel;", "repository", "Lcom/nsdevil/ubtmobilev3/data/repository/OrgRepository;", "(Lcom/nsdevil/ubtmobilev3/data/repository/OrgRepository;)V", "examCodeResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/nsdevil/ubtmobilev3/data/response/ExamCodeResponse;", "getExamCodeResult", "()Landroidx/lifecycle/MutableLiveData;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "registerExamResult", "Lcom/nsdevil/ubtmobilev3/data/response/RegisterExamResponse;", "getRegisterExamResult", "registerOrgResult", "Lcom/nsdevil/ubtmobilev3/data/response/RegisterOrgResponse;", "getRegisterOrgResult", "examCodeRegister", "", "examCode", "", "getOrgData", "Landroidx/lifecycle/LiveData;", "Lcom/nsdevil/ubtmobilev3/data/response/OrgExamListResponse;", "orgId", "", "registerExam", "examId", "registerOrg", "studentCode", "app_debug"})
public final class OrgViewModel extends com.nsdevil.ubtmobilev3.base.BaseViewModel {
    private final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.RegisterOrgResponse> registerOrgResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.RegisterExamResponse> registerExamResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.ExamCodeResponse> examCodeResult = null;
    private final com.nsdevil.ubtmobilev3.data.repository.OrgRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse> getOrgData(int orgId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.RegisterOrgResponse> getRegisterOrgResult() {
        return null;
    }
    
    public final void registerOrg(int orgId, @org.jetbrains.annotations.NotNull()
    java.lang.String studentCode) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.RegisterExamResponse> getRegisterExamResult() {
        return null;
    }
    
    public final void registerExam(int examId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.ExamCodeResponse> getExamCodeResult() {
        return null;
    }
    
    public final void examCodeRegister(@org.jetbrains.annotations.NotNull()
    java.lang.String examCode) {
    }
    
    @javax.inject.Inject()
    public OrgViewModel(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.repository.OrgRepository repository) {
        super();
    }
}