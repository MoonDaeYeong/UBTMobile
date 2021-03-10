package com.nsdevil.ubtmobilev3.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/OrgExamAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/nsdevil/ubtmobilev3/data/response/OrgExamListResponse$Content;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "logo", "", "itemClick", "Lkotlin/Function1;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getItemClick", "()Lkotlin/jvm/functions/Function1;", "getLogo", "()Ljava/lang/String;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OrgExamViewHolder", "app_debug"})
public final class OrgExamAdapter extends androidx.recyclerview.widget.ListAdapter<com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse.Content, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String logo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse.Content, kotlin.Unit> itemClick = null;
    
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
    public final java.lang.String getLogo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse.Content, kotlin.Unit> getItemClick() {
        return null;
    }
    
    public OrgExamAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.String logo, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse.Content, kotlin.Unit> itemClick) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/nsdevil/ubtmobilev3/adapter/OrgExamAdapter$OrgExamViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/ListItemOrgExamBinding;", "(Lcom/nsdevil/ubtmobilev3/adapter/OrgExamAdapter;Lcom/nsdevil/ubtmobilev3/databinding/ListItemOrgExamBinding;)V", "bind", "", "item", "Lcom/nsdevil/ubtmobilev3/data/response/OrgExamListResponse$Content;", "app_debug"})
    public final class OrgExamViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nsdevil.ubtmobilev3.databinding.ListItemOrgExamBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse.Content item) {
        }
        
        public OrgExamViewHolder(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.databinding.ListItemOrgExamBinding binding) {
            super(null);
        }
    }
}