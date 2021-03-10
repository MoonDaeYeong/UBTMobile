package com.nsdevil.ubtmobilev3.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0017\u0018\u0019\u001a\u001bBE\u0012\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012$\u0010\b\u001a \u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0002R,\u0010\b\u001a \u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/ExamAnswerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "newList", "Lkotlin/Function1;", "", "", "itemPlayer", "Lkotlin/Function3;", "Lcom/google/android/exoplayer2/ui/PlayerView;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "subscribeButton", "answer", "ExamAnswerAudioViewHolder", "ExamAnswerImgViewHolder", "ExamAnswerMathViewHolder", "ExamAnswerTextViewHolder", "ExamAnswerViewHolder", "app_debug"})
public final class ExamAnswerAdapter extends androidx.recyclerview.widget.ListAdapter<com.nsdevil.ubtmobilev3.data.db.InAnswer, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final kotlin.jvm.functions.Function1<java.util.List<com.nsdevil.ubtmobilev3.data.db.InAnswer>, kotlin.Unit> newList = null;
    private final kotlin.jvm.functions.Function3<com.google.android.exoplayer2.ui.PlayerView, java.util.List<com.nsdevil.ubtmobilev3.data.db.InAnswer>, java.lang.Integer, kotlin.Unit> itemPlayer = null;
    
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
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final void subscribeButton(com.nsdevil.ubtmobilev3.data.db.InAnswer answer) {
    }
    
    public ExamAnswerAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.nsdevil.ubtmobilev3.data.db.InAnswer>, kotlin.Unit> newList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super com.google.android.exoplayer2.ui.PlayerView, ? super java.util.List<com.nsdevil.ubtmobilev3.data.db.InAnswer>, ? super java.lang.Integer, kotlin.Unit> itemPlayer) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/ExamAnswerAdapter$ExamAnswerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/ListItemAnswerBinding;", "(Lcom/nsdevil/ubtmobilev3/adapter/ExamAnswerAdapter;Lcom/nsdevil/ubtmobilev3/databinding/ListItemAnswerBinding;)V", "bind", "", "item", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "app_debug"})
    public final class ExamAnswerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nsdevil.ubtmobilev3.databinding.ListItemAnswerBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.data.db.InAnswer item) {
        }
        
        public ExamAnswerViewHolder(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.databinding.ListItemAnswerBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/ExamAnswerAdapter$ExamAnswerMathViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/ListItemAnswerMathBinding;", "(Lcom/nsdevil/ubtmobilev3/adapter/ExamAnswerAdapter;Lcom/nsdevil/ubtmobilev3/databinding/ListItemAnswerMathBinding;)V", "bind", "", "item", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "app_debug"})
    public final class ExamAnswerMathViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nsdevil.ubtmobilev3.databinding.ListItemAnswerMathBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.data.db.InAnswer item) {
        }
        
        public ExamAnswerMathViewHolder(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.databinding.ListItemAnswerMathBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/ExamAnswerAdapter$ExamAnswerImgViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/ListItemAnswerImgBinding;", "(Lcom/nsdevil/ubtmobilev3/adapter/ExamAnswerAdapter;Lcom/nsdevil/ubtmobilev3/databinding/ListItemAnswerImgBinding;)V", "bind", "", "item", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "app_debug"})
    public final class ExamAnswerImgViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nsdevil.ubtmobilev3.databinding.ListItemAnswerImgBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.data.db.InAnswer item) {
        }
        
        public ExamAnswerImgViewHolder(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.databinding.ListItemAnswerImgBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/ExamAnswerAdapter$ExamAnswerAudioViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/ListItemAnswerAudioBinding;", "(Lcom/nsdevil/ubtmobilev3/adapter/ExamAnswerAdapter;Lcom/nsdevil/ubtmobilev3/databinding/ListItemAnswerAudioBinding;)V", "bind", "", "item", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "app_debug"})
    public final class ExamAnswerAudioViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nsdevil.ubtmobilev3.databinding.ListItemAnswerAudioBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.data.db.InAnswer item) {
        }
        
        public ExamAnswerAudioViewHolder(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.databinding.ListItemAnswerAudioBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/ExamAnswerAdapter$ExamAnswerTextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/ListItemAnswerTextBinding;", "(Lcom/nsdevil/ubtmobilev3/adapter/ExamAnswerAdapter;Lcom/nsdevil/ubtmobilev3/databinding/ListItemAnswerTextBinding;)V", "bind", "", "item", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "subscribeText", "answer", "app_debug"})
    public final class ExamAnswerTextViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nsdevil.ubtmobilev3.databinding.ListItemAnswerTextBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.data.db.InAnswer item) {
        }
        
        private final void subscribeText(com.nsdevil.ubtmobilev3.data.db.InAnswer answer) {
        }
        
        public ExamAnswerTextViewHolder(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.databinding.ListItemAnswerTextBinding binding) {
            super(null);
        }
    }
}