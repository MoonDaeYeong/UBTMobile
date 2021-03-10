package com.nsdevil.ubtmobilev3.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(J\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\t0\b2\u0006\u0010+\u001a\u00020\u000eJ\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010+\u001a\u00020\u000eJ\u000e\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\u000eJ\u0019\u0010/\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u000e\u00101\u001a\u00020&2\u0006\u0010\'\u001a\u00020(J$\u00102\u001a\u00020&2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\t2\u0006\u0010+\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eJ\u000e\u00106\u001a\u00020&2\u0006\u0010+\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"Lcom/nsdevil/ubtmobilev3/viewmodels/ExamViewModel;", "Lcom/nsdevil/ubtmobilev3/base/BaseViewModel;", "repository", "Lcom/nsdevil/ubtmobilev3/data/repository/ExamRepository;", "(Lcom/nsdevil/ubtmobilev3/data/repository/ExamRepository;)V", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getQuestionList", "Landroidx/lifecycle/LiveData;", "", "Lcom/nsdevil/ubtmobilev3/data/db/InQuestion;", "getGetQuestionList", "()Landroidx/lifecycle/LiveData;", "getRemainCount", "", "getGetRemainCount", "getTotalCount", "getGetTotalCount", "questionAnswerList", "Lcom/nsdevil/ubtmobilev3/data/model/QuestionAnswer;", "getQuestionAnswerList", "remainTime", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getRemainTime", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "sendResultCheck", "", "timerJob", "Lkotlinx/coroutines/Job;", "updateCompleted", "Landroidx/lifecycle/MutableLiveData;", "getUpdateCompleted", "()Landroidx/lifecycle/MutableLiveData;", "uploadResultMsg", "Lcom/nsdevil/ubtmobilev3/data/model/UploadReturnData;", "getUploadResultMsg", "viewListState", "aiAlertSignal", "", "ctx", "Landroid/content/Context;", "getDataList", "Lcom/nsdevil/ubtmobilev3/data/db/InData;", "index", "questionAnswer", "setViewListState", "viewState", "submissionProcess", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timerSetting", "updateAnswer", "answerList", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "stayingTime", "updateUserCheck", "app_debug"})
public final class ExamViewModel extends com.nsdevil.ubtmobilev3.base.BaseViewModel {
    private final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler = null;
    private boolean sendResultCheck = false;
    private kotlinx.coroutines.Job timerJob;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> remainTime = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.nsdevil.ubtmobilev3.data.model.QuestionAnswer>> questionAnswerList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.model.UploadReturnData> uploadResultMsg = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> getTotalCount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> getRemainCount = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> viewListState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.nsdevil.ubtmobilev3.data.db.InQuestion>> getQuestionList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> updateCompleted = null;
    private final com.nsdevil.ubtmobilev3.data.repository.ExamRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> getRemainTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.nsdevil.ubtmobilev3.data.model.QuestionAnswer>> getQuestionAnswerList() {
        return null;
    }
    
    public final void timerSetting(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.model.UploadReturnData> getUploadResultMsg() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object submissionProcess(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getGetTotalCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getGetRemainCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.nsdevil.ubtmobilev3.data.db.InQuestion>> getGetQuestionList() {
        return null;
    }
    
    public final void setViewListState(int viewState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nsdevil.ubtmobilev3.data.model.QuestionAnswer> questionAnswer(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.nsdevil.ubtmobilev3.data.db.InData>> getDataList(int index) {
        return null;
    }
    
    public final void updateUserCheck(int index) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getUpdateCompleted() {
        return null;
    }
    
    public final void updateAnswer(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nsdevil.ubtmobilev3.data.db.InAnswer> answerList, int index, int stayingTime) {
    }
    
    public final void aiAlertSignal(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
    }
    
    @javax.inject.Inject()
    public ExamViewModel(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.repository.ExamRepository repository) {
        super();
    }
}