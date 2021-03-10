package com.nsdevil.ubtmobilev3.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/nsdevil/ubtmobilev3/dialog/AiAlertDialog;", "Landroidx/appcompat/app/AlertDialog;", "context", "Landroid/content/Context;", "title", "", "msg", "type", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/DialogZAlertBinding;", "modelInAnim", "Landroid/view/animation/Animation;", "getModelInAnim", "()Landroid/view/animation/Animation;", "modelInAnim$delegate", "Lkotlin/Lazy;", "singleEventListener", "Lcom/nsdevil/ubtmobilev3/dialog/AiAlertDialog$SingleEventListener;", "btnAction", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setSingleEventListener", "setType", "subscribeUi", "Companion", "SingleEventListener", "app_debug"})
public final class AiAlertDialog extends androidx.appcompat.app.AlertDialog {
    private com.nsdevil.ubtmobilev3.databinding.DialogZAlertBinding binding;
    private final kotlin.Lazy modelInAnim$delegate = null;
    private com.nsdevil.ubtmobilev3.dialog.AiAlertDialog.SingleEventListener singleEventListener;
    private final java.lang.String title = null;
    private final java.lang.String msg = null;
    private final int type = 0;
    public static final int SUCCESS_TYPE = 1;
    public static final int WARNING_TYPE = 2;
    public static final int ERROR_TYPE = 3;
    public static final int PROGRESS_TYPE = 4;
    @org.jetbrains.annotations.NotNull()
    public static final com.nsdevil.ubtmobilev3.dialog.AiAlertDialog.Companion Companion = null;
    
    private final android.view.animation.Animation getModelInAnim() {
        return null;
    }
    
    public final void setSingleEventListener(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.dialog.AiAlertDialog.SingleEventListener singleEventListener) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void btnAction() {
    }
    
    private final void subscribeUi() {
    }
    
    private final void setType(int type) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    public AiAlertDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, int type) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/nsdevil/ubtmobilev3/dialog/AiAlertDialog$SingleEventListener;", "", "confirmClick", "", "dialogSelf", "Lcom/nsdevil/ubtmobilev3/dialog/AiAlertDialog;", "app_debug"})
    public static abstract interface SingleEventListener {
        
        public abstract void confirmClick(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.dialog.AiAlertDialog dialogSelf);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/nsdevil/ubtmobilev3/dialog/AiAlertDialog$Companion;", "", "()V", "ERROR_TYPE", "", "PROGRESS_TYPE", "SUCCESS_TYPE", "WARNING_TYPE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}