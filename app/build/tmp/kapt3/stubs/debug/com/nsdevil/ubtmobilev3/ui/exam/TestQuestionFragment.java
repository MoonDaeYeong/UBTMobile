package com.nsdevil.ubtmobilev3.ui.exam;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J&\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u0019H\u0002J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u001bH\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u001bH\u0002J\b\u0010.\u001a\u00020\u0019H\u0002J\u0010\u0010/\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u00060"}, d2 = {"Lcom/nsdevil/ubtmobilev3/ui/exam/TestQuestionFragment;", "Lcom/nsdevil/ubtmobilev3/base/BaseFragment;", "position", "", "(I)V", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/FragmentTestQuestionBinding;", "examFragment", "Lcom/nsdevil/ubtmobilev3/ui/ExamFragment;", "getExamFragment", "()Lcom/nsdevil/ubtmobilev3/ui/ExamFragment;", "updateAnswerList", "", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "getUpdateAnswerList", "()Ljava/util/List;", "setUpdateAnswerList", "(Ljava/util/List;)V", "viewModel", "Lcom/nsdevil/ubtmobilev3/viewmodels/ExamViewModel;", "getViewModel", "()Lcom/nsdevil/ubtmobilev3/viewmodels/ExamViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "audioPlayer", "", "source", "", "getNewList", "answerList", "getPlayerView", "playerView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "imageViewer", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setBindItem", "setDataText", "text", "setMathText", "subscribeUi", "videoPlayer", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TestQuestionFragment extends com.nsdevil.ubtmobilev3.base.BaseFragment {
    private com.nsdevil.ubtmobilev3.databinding.FragmentTestQuestionBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.nsdevil.ubtmobilev3.data.db.InAnswer> updateAnswerList;
    private final int position = 0;
    private java.util.HashMap _$_findViewCache;
    
    private final com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel getViewModel() {
        return null;
    }
    
    private final com.nsdevil.ubtmobilev3.ui.ExamFragment getExamFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.nsdevil.ubtmobilev3.data.db.InAnswer> getUpdateAnswerList() {
        return null;
    }
    
    public final void setUpdateAnswerList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nsdevil.ubtmobilev3.data.db.InAnswer> p0) {
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
    
    private final void setDataText(java.lang.String text) {
    }
    
    private final void setMathText(java.lang.String text) {
    }
    
    private final void imageViewer(java.lang.String source) {
    }
    
    private final void audioPlayer(java.lang.String source) {
    }
    
    private final void videoPlayer(java.lang.String source) {
    }
    
    private final void getNewList(java.util.List<com.nsdevil.ubtmobilev3.data.db.InAnswer> answerList) {
    }
    
    private final void getPlayerView(com.google.android.exoplayer2.ui.PlayerView playerView, java.util.List<com.nsdevil.ubtmobilev3.data.db.InAnswer> answerList, int position) {
    }
    
    public TestQuestionFragment(int position) {
        super();
    }
}