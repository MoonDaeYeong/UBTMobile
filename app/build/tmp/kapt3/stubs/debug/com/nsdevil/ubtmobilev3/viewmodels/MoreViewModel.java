package com.nsdevil.ubtmobilev3.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/nsdevil/ubtmobilev3/viewmodels/MoreViewModel;", "Lcom/nsdevil/ubtmobilev3/base/BaseViewModel;", "repository", "Lcom/nsdevil/ubtmobilev3/data/repository/MoreRepository;", "(Lcom/nsdevil/ubtmobilev3/data/repository/MoreRepository;)V", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "myExamResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/nsdevil/ubtmobilev3/data/response/AllMyExamResponse;", "getMyExamResult", "()Landroidx/lifecycle/MutableLiveData;", "orgResult", "Lcom/nsdevil/ubtmobilev3/data/response/AllOrgResponse;", "getOrgResult", "otherExamResult", "Lcom/nsdevil/ubtmobilev3/data/response/AllOtherExamResponse;", "getOtherExamResult", "getFindExam", "", "examName", "", "getInitSetting", "args", "Lcom/nsdevil/ubtmobilev3/ui/MoreFragmentArgs;", "app_debug"})
public final class MoreViewModel extends com.nsdevil.ubtmobilev3.base.BaseViewModel {
    private final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse> myExamResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.AllOtherExamResponse> otherExamResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.AllOrgResponse> orgResult = null;
    private final com.nsdevil.ubtmobilev3.data.repository.MoreRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse> getMyExamResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.AllOtherExamResponse> getOtherExamResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.AllOrgResponse> getOrgResult() {
        return null;
    }
    
    public final void getInitSetting(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.ui.MoreFragmentArgs args) {
    }
    
    public final void getFindExam(@org.jetbrains.annotations.NotNull()
    java.lang.String examName) {
    }
    
    @javax.inject.Inject()
    public MoreViewModel(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.repository.MoreRepository repository) {
        super();
    }
}