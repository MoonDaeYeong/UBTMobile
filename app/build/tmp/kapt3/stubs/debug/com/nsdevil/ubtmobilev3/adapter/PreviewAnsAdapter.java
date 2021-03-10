package com.nsdevil.ubtmobilev3.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/PreviewAnsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PreviewAnsTextViewHolder", "PreviewAnsViewHolder", "app_debug"})
public final class PreviewAnsAdapter extends androidx.recyclerview.widget.ListAdapter<com.nsdevil.ubtmobilev3.data.db.InAnswer, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    
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
    
    public PreviewAnsAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/PreviewAnsAdapter$PreviewAnsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/ListItemExamPreviewABinding;", "(Lcom/nsdevil/ubtmobilev3/databinding/ListItemExamPreviewABinding;)V", "bind", "", "item", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "app_debug"})
    public static final class PreviewAnsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nsdevil.ubtmobilev3.databinding.ListItemExamPreviewABinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.data.db.InAnswer item) {
        }
        
        public PreviewAnsViewHolder(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.databinding.ListItemExamPreviewABinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/PreviewAnsAdapter$PreviewAnsTextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/ListItemExamPreviewATxtBinding;", "(Lcom/nsdevil/ubtmobilev3/databinding/ListItemExamPreviewATxtBinding;)V", "bind", "", "item", "Lcom/nsdevil/ubtmobilev3/data/db/InAnswer;", "app_debug"})
    public static final class PreviewAnsTextViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nsdevil.ubtmobilev3.databinding.ListItemExamPreviewATxtBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.data.db.InAnswer item) {
        }
        
        public PreviewAnsTextViewHolder(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.databinding.ListItemExamPreviewATxtBinding binding) {
            super(null);
        }
    }
}