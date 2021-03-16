package com.nsdevil.ubtmobilev3.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0013H\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\b\u0010,\u001a\u00020\u001fH\u0002J\b\u0010-\u001a\u00020\u001fH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r \u000e*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006."}, d2 = {"Lcom/nsdevil/ubtmobilev3/ui/SurveyFragment;", "Lcom/nsdevil/ubtmobilev3/base/BaseFragment;", "()V", "args", "Lcom/nsdevil/ubtmobilev3/ui/SurveyFragmentArgs;", "getArgs", "()Lcom/nsdevil/ubtmobilev3/ui/SurveyFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/FragmentSurveyBinding;", "researchList", "", "Lcom/nsdevil/ubtmobilev3/data/response/SurveyResponse$SurveyResult$Researchs;", "kotlin.jvm.PlatformType", "getResearchList", "()Ljava/util/List;", "stackResearchList", "", "Lcom/nsdevil/ubtmobilev3/data/request/SurveyRequest$SubResearch;", "getStackResearchList", "()Ljava/util/Set;", "subResearchList", "getSubResearchList", "viewModel", "Lcom/nsdevil/ubtmobilev3/viewmodels/SurveyViewModel;", "getViewModel", "()Lcom/nsdevil/ubtmobilev3/viewmodels/SurveyViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getResData", "", "resData", "nextPage", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onShowCompleteDialog", "setBindItem", "submissionPage", "subscribeUi", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SurveyFragment extends com.nsdevil.ubtmobilev3.base.BaseFragment {
    private com.nsdevil.ubtmobilev3.databinding.FragmentSurveyBinding binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch> stackResearchList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch> subResearchList = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.nsdevil.ubtmobilev3.ui.SurveyFragmentArgs getArgs() {
        return null;
    }
    
    private final java.util.List<com.nsdevil.ubtmobilev3.data.response.SurveyResponse.SurveyResult.Researchs> getResearchList() {
        return null;
    }
    
    private final com.nsdevil.ubtmobilev3.viewmodels.SurveyViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch> getStackResearchList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch> getSubResearchList() {
        return null;
    }
    
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
    
    private final void subscribeUi() {
    }
    
    private final void onShowCompleteDialog() {
    }
    
    private final void nextPage() {
    }
    
    private final void submissionPage() {
    }
    
    private final void getResData(com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch resData) {
    }
    
    public SurveyFragment() {
        super();
    }
}