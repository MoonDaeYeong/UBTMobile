package com.nsdevil.ubtmobilev3.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/nsdevil/ubtmobilev3/dialog/OrgRegisterDialog;", "Landroidx/appcompat/app/AlertDialog;", "context", "Landroid/content/Context;", "yesAction", "Lkotlin/Function1;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/DialogOrgRegisterBinding;", "dismiss", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setBind", "show", "Companion", "app_debug"})
public final class OrgRegisterDialog extends androidx.appcompat.app.AlertDialog {
    private com.nsdevil.ubtmobilev3.databinding.DialogOrgRegisterBinding binding;
    private final kotlin.jvm.functions.Function1<androidx.appcompat.app.AlertDialog, kotlin.Unit> yesAction = null;
    private static boolean showCheck = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.nsdevil.ubtmobilev3.dialog.OrgRegisterDialog.Companion Companion = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setBind() {
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    @java.lang.Override()
    public void dismiss() {
    }
    
    public OrgRegisterDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.appcompat.app.AlertDialog, kotlin.Unit> yesAction) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/nsdevil/ubtmobilev3/dialog/OrgRegisterDialog$Companion;", "", "()V", "showCheck", "", "getShowCheck", "()Z", "setShowCheck", "(Z)V", "app_debug"})
    public static final class Companion {
        
        public final boolean getShowCheck() {
            return false;
        }
        
        public final void setShowCheck(boolean p0) {
        }
        
        private Companion() {
            super();
        }
    }
}