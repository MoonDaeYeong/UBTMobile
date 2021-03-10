package com.nsdevil.ubtmobilev3.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/ExamListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/nsdevil/ubtmobilev3/data/db/InQuestion;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ExamListViewHolder", "app_debug"})
public final class ExamListAdapter extends androidx.recyclerview.widget.ListAdapter<com.nsdevil.ubtmobilev3.data.db.InQuestion, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    
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
    
    public ExamListAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/ExamListAdapter$ExamListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/ListItemExamListBinding;", "(Lcom/nsdevil/ubtmobilev3/adapter/ExamListAdapter;Lcom/nsdevil/ubtmobilev3/databinding/ListItemExamListBinding;)V", "bind", "", "item", "Lcom/nsdevil/ubtmobilev3/data/db/InQuestion;", "navigateToExamTest", "view", "Landroid/view/View;", "questionPage", "", "app_debug"})
    public final class ExamListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nsdevil.ubtmobilev3.databinding.ListItemExamListBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.data.db.InQuestion item) {
        }
        
        private final void navigateToExamTest(android.view.View view, int questionPage) {
        }
        
        public ExamListViewHolder(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.databinding.ListItemExamListBinding binding) {
            super(null);
        }
    }
}