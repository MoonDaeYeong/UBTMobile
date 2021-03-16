package com.nsdevil.ubtmobilev3.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/SurveyItemViewPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "researchList", "", "Lcom/nsdevil/ubtmobilev3/data/response/SurveyResponse$SurveyResult$Researchs;", "resData", "Lkotlin/Function1;", "Lcom/nsdevil/ubtmobilev3/data/request/SurveyRequest$SubResearch;", "", "(Landroidx/fragment/app/Fragment;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "createFragment", "position", "", "getItemCount", "app_debug"})
public final class SurveyItemViewPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final java.util.List<com.nsdevil.ubtmobilev3.data.response.SurveyResponse.SurveyResult.Researchs> researchList = null;
    private final kotlin.jvm.functions.Function1<com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch, kotlin.Unit> resData = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    public SurveyItemViewPagerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.util.List<com.nsdevil.ubtmobilev3.data.response.SurveyResponse.SurveyResult.Researchs> researchList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.nsdevil.ubtmobilev3.data.request.SurveyRequest.SubResearch, kotlin.Unit> resData) {
        super(null);
    }
}