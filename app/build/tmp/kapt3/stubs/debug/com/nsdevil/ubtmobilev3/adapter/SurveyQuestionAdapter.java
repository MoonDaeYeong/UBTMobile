package com.nsdevil.ubtmobilev3.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R#\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/SurveyQuestionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/nsdevil/ubtmobilev3/data/response/SurveyResponse$SurveyResult$Researchs$SurveyQuestions;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "questions", "Lkotlin/Function1;", "", "Lcom/nsdevil/ubtmobilev3/data/request/SurveyRequest$SubResearch$SubQuestions;", "", "(Lkotlin/jvm/functions/Function1;)V", "getQuestions", "()Lkotlin/jvm/functions/Function1;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SurveyQuestionViewHolder", "app_debug"})
public final class SurveyQuestionAdapter extends androidx.recyclerview.widget.ListAdapter<com.nsdevil.ubtmobilev3.data.response.SurveyResponse.SurveyResult.Researchs.SurveyQuestions, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.util.List<com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch.SubQuestions>, kotlin.Unit> questions = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.util.List<com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch.SubQuestions>, kotlin.Unit> getQuestions() {
        return null;
    }
    
    public SurveyQuestionAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch.SubQuestions>, kotlin.Unit> questions) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/SurveyQuestionAdapter$SurveyQuestionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/ListItemSurveyQuestionBinding;", "(Lcom/nsdevil/ubtmobilev3/adapter/SurveyQuestionAdapter;Lcom/nsdevil/ubtmobilev3/databinding/ListItemSurveyQuestionBinding;)V", "adapter", "Lcom/nsdevil/ubtmobilev3/adapter/SurveyAnswerAdapter;", "getAdapter", "()Lcom/nsdevil/ubtmobilev3/adapter/SurveyAnswerAdapter;", "bind", "", "item", "Lcom/nsdevil/ubtmobilev3/data/response/SurveyResponse$SurveyResult$Researchs$SurveyQuestions;", "getUpdateAnswer", "surveyAnswer", "Lcom/nsdevil/ubtmobilev3/data/model/SurveyAnswer;", "app_debug"})
    public final class SurveyQuestionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.nsdevil.ubtmobilev3.adapter.SurveyAnswerAdapter adapter = null;
        private final com.nsdevil.ubtmobilev3.databinding.ListItemSurveyQuestionBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.nsdevil.ubtmobilev3.adapter.SurveyAnswerAdapter getAdapter() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.data.response.SurveyResponse.SurveyResult.Researchs.SurveyQuestions item) {
        }
        
        private final void getUpdateAnswer(com.nsdevil.ubtmobilev3.data.model.SurveyAnswer surveyAnswer) {
        }
        
        public SurveyQuestionViewHolder(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.databinding.ListItemSurveyQuestionBinding binding) {
            super(null);
        }
    }
}