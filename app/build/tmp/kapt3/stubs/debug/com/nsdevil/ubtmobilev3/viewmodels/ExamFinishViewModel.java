package com.nsdevil.ubtmobilev3.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/nsdevil/ubtmobilev3/viewmodels/ExamFinishViewModel;", "Lcom/nsdevil/ubtmobilev3/base/BaseViewModel;", "repository", "Lcom/nsdevil/ubtmobilev3/data/repository/ExamFinishRepository;", "(Lcom/nsdevil/ubtmobilev3/data/repository/ExamFinishRepository;)V", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "surveyResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/nsdevil/ubtmobilev3/data/response/SurveyResponse;", "getSurveyResult", "()Landroidx/lifecycle/MutableLiveData;", "getSurveyItem", "", "examId", "", "app_debug"})
public final class ExamFinishViewModel extends com.nsdevil.ubtmobilev3.base.BaseViewModel {
    private final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.SurveyResponse> surveyResult = null;
    private final com.nsdevil.ubtmobilev3.data.repository.ExamFinishRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.SurveyResponse> getSurveyResult() {
        return null;
    }
    
    public final void getSurveyItem(int examId) {
    }
    
    @javax.inject.Inject()
    public ExamFinishViewModel(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.repository.ExamFinishRepository repository) {
        super();
    }
}