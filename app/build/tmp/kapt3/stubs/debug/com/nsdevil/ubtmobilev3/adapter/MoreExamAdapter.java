package com.nsdevil.ubtmobilev3.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/MoreExamAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/nsdevil/ubtmobilev3/data/response/AllMyExamResponse$Content;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemClick", "()Lkotlin/jvm/functions/Function1;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MoreExamViewHolder", "app_debug"})
public final class MoreExamAdapter extends androidx.recyclerview.widget.ListAdapter<com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse.Content, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse.Content, kotlin.Unit> itemClick = null;
    
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
    public final kotlin.jvm.functions.Function1<com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse.Content, kotlin.Unit> getItemClick() {
        return null;
    }
    
    public MoreExamAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse.Content, kotlin.Unit> itemClick) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/MoreExamAdapter$MoreExamViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/ListItemMoreExamBinding;", "(Lcom/nsdevil/ubtmobilev3/adapter/MoreExamAdapter;Lcom/nsdevil/ubtmobilev3/databinding/ListItemMoreExamBinding;)V", "bind", "", "item", "Lcom/nsdevil/ubtmobilev3/data/response/AllMyExamResponse$Content;", "app_debug"})
    final class MoreExamViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nsdevil.ubtmobilev3.databinding.ListItemMoreExamBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse.Content item) {
        }
        
        public MoreExamViewHolder(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.databinding.ListItemMoreExamBinding binding) {
            super(null);
        }
    }
}