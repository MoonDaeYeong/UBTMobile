package com.nsdevil.ubtmobilev3.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/nsdevil/ubtmobilev3/ui/SurveyItemFragment;", "Landroidx/fragment/app/Fragment;", "research", "Lcom/nsdevil/ubtmobilev3/data/response/SurveyResponse$SurveyResult$Researchs;", "resData", "Lkotlin/Function1;", "Lcom/nsdevil/ubtmobilev3/data/request/SurveyRequest$SubResearch;", "", "(Lcom/nsdevil/ubtmobilev3/data/response/SurveyResponse$SurveyResult$Researchs;Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/FragmentSurveyItemBinding;", "getResData", "()Lkotlin/jvm/functions/Function1;", "getSubQuestionList", "questions", "", "Lcom/nsdevil/ubtmobilev3/data/request/SurveyRequest$SubResearch$SubQuestions;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setBindItem", "app_debug"})
public final class SurveyItemFragment extends androidx.fragment.app.Fragment {
    private com.nsdevil.ubtmobilev3.databinding.FragmentSurveyItemBinding binding;
    private final com.nsdevil.ubtmobilev3.data.response.SurveyResponse.SurveyResult.Researchs research = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch, kotlin.Unit> resData = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setBindItem() {
    }
    
    private final void getSubQuestionList(java.util.List<com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch.SubQuestions> questions) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch, kotlin.Unit> getResData() {
        return null;
    }
    
    public SurveyItemFragment(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.response.SurveyResponse.SurveyResult.Researchs research, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch, kotlin.Unit> resData) {
        super();
    }
}