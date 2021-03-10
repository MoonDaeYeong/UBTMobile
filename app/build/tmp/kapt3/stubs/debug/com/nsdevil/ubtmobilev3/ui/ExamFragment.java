package com.nsdevil.ubtmobilev3.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0002J$\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020&H\u0016J\b\u00100\u001a\u00020&H\u0016J\b\u00101\u001a\u00020&H\u0016J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J\u0014\u00106\u001a\u00020&2\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0004J\b\u00109\u001a\u00020&H\u0002J\u000e\u0010\u0013\u001a\u00020&2\u0006\u00107\u001a\u000208J\u0006\u0010:\u001a\u00020&J\u0006\u0010;\u001a\u00020&J\b\u0010<\u001a\u00020&H\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\u00a8\u0006="}, d2 = {"Lcom/nsdevil/ubtmobilev3/ui/ExamFragment;", "Lcom/nsdevil/ubtmobilev3/base/BaseFragment;", "()V", "answerListPlayer", "", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "getAnswerListPlayer", "()Ljava/util/List;", "setAnswerListPlayer", "(Ljava/util/List;)V", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/FragmentExamBinding;", "examInfo", "Lcom/nsdevil/ubtmobilev3/data/response/MeResponse;", "getExamInfo", "()Lcom/nsdevil/ubtmobilev3/data/response/MeResponse;", "questionPlayer", "getQuestionPlayer", "()Lcom/google/android/exoplayer2/SimpleExoPlayer;", "setQuestionPlayer", "(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V", "stayingTime", "", "getStayingTime", "()I", "setStayingTime", "(I)V", "userExam", "Lcom/nsdevil/ubtmobilev3/data/response/HomeDataResponse$Result$Userexam;", "getUserExam", "()Lcom/nsdevil/ubtmobilev3/data/response/HomeDataResponse$Result$Userexam;", "viewModel", "Lcom/nsdevil/ubtmobilev3/viewmodels/ExamViewModel;", "getViewModel", "()Lcom/nsdevil/ubtmobilev3/viewmodels/ExamViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "finishMsg", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "prepareExoPlayerFromFileUri", "Lcom/google/android/exoplayer2/source/MediaSource;", "uri", "Landroid/net/Uri;", "setAnswerPlayer", "source", "", "setBindItem", "stopPlayerEvent", "submitTest", "subscribeUi", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ExamFragment extends com.nsdevil.ubtmobilev3.base.BaseFragment {
    private com.nsdevil.ubtmobilev3.databinding.FragmentExamBinding binding;
    public com.google.android.exoplayer2.SimpleExoPlayer questionPlayer;
    public java.util.List<? extends com.google.android.exoplayer2.SimpleExoPlayer> answerListPlayer;
    private final kotlin.Lazy viewModel$delegate = null;
    private int stayingTime = 0;
    private java.util.HashMap _$_findViewCache;
    
    private final com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.Userexam getUserExam() {
        return null;
    }
    
    private final com.nsdevil.ubtmobilev3.data.response.MeResponse getExamInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.exoplayer2.SimpleExoPlayer getQuestionPlayer() {
        return null;
    }
    
    public final void setQuestionPlayer(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.SimpleExoPlayer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.exoplayer2.SimpleExoPlayer> getAnswerListPlayer() {
        return null;
    }
    
    public final void setAnswerListPlayer(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.android.exoplayer2.SimpleExoPlayer> p0) {
    }
    
    private final com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel getViewModel() {
        return null;
    }
    
    public final int getStayingTime() {
        return 0;
    }
    
    public final void setStayingTime(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setBindItem() {
    }
    
    public final void stopPlayerEvent() {
    }
    
    public final void setQuestionPlayer(@org.jetbrains.annotations.NotNull()
    java.lang.String source) {
    }
    
    public final void setAnswerPlayer(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> source) {
    }
    
    private final com.google.android.exoplayer2.source.MediaSource prepareExoPlayerFromFileUri(android.net.Uri uri) {
        return null;
    }
    
    private final void subscribeUi() {
    }
    
    private final void finishMsg() {
    }
    
    public final void submitTest() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public ExamFragment() {
        super();
    }
}