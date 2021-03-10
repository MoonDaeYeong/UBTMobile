package com.nsdevil.ubtmobilev3.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 .2\u00020\u0001:\u0003./0B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001cH\u0014J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u000bJ\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u000bJ\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u000bJ\u000e\u0010\'\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u000bJ\u000e\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001aJ\b\u0010-\u001a\u00020\u001cH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/nsdevil/ubtmobilev3/dialog/ZAlertDialog;", "Landroidx/appcompat/app/AlertDialog;", "context", "Landroid/content/Context;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;)V", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/DialogZAlertBinding;", "cancelStr", "Landroidx/lifecycle/MutableLiveData;", "", "confirmStr", "modelInAnim", "Landroid/view/animation/Animation;", "getModelInAnim", "()Landroid/view/animation/Animation;", "modelInAnim$delegate", "Lkotlin/Lazy;", "msgStr", "multiEventLister", "Lcom/nsdevil/ubtmobilev3/dialog/ZAlertDialog$MultiEventLister;", "singleEventListener", "Lcom/nsdevil/ubtmobilev3/dialog/ZAlertDialog$SingleEventListener;", "titleStr", "typeInt", "", "btnAction", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setCancel", "cancel", "setConfirm", "confirm", "setMsg", "msg", "setMultiEventListener", "setSingleEventListener", "setTitle", "title", "setType", "type", "subscribeUi", "Companion", "MultiEventLister", "SingleEventListener", "app_debug"})
public final class ZAlertDialog extends androidx.appcompat.app.AlertDialog {
    private com.nsdevil.ubtmobilev3.databinding.DialogZAlertBinding binding;
    private final kotlin.Lazy modelInAnim$delegate = null;
    private com.nsdevil.ubtmobilev3.dialog.ZAlertDialog.SingleEventListener singleEventListener;
    private com.nsdevil.ubtmobilev3.dialog.ZAlertDialog.MultiEventLister multiEventLister;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> titleStr = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> msgStr = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> confirmStr = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> cancelStr = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> typeInt = null;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    public static final int SUCCESS_TYPE = 1;
    public static final int WARNING_TYPE = 2;
    public static final int ERROR_TYPE = 3;
    public static final int PROGRESS_TYPE = 4;
    private static volatile com.nsdevil.ubtmobilev3.dialog.ZAlertDialog instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.nsdevil.ubtmobilev3.dialog.ZAlertDialog.Companion Companion = null;
    
    private final android.view.animation.Animation getModelInAnim() {
        return null;
    }
    
    public final void setSingleEventListener(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.dialog.ZAlertDialog.SingleEventListener singleEventListener) {
    }
    
    public final void setMultiEventListener(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.dialog.ZAlertDialog.MultiEventLister multiEventLister) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void btnAction() {
    }
    
    private final void subscribeUi() {
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void setMsg(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void setConfirm(@org.jetbrains.annotations.NotNull()
    java.lang.String confirm) {
    }
    
    public final void setCancel(@org.jetbrains.annotations.NotNull()
    java.lang.String cancel) {
    }
    
    public final void setType(int type) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    public ZAlertDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/nsdevil/ubtmobilev3/dialog/ZAlertDialog$SingleEventListener;", "", "confirmClick", "", "dialogSelf", "Lcom/nsdevil/ubtmobilev3/dialog/ZAlertDialog;", "app_debug"})
    public static abstract interface SingleEventListener {
        
        public abstract void confirmClick(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.dialog.ZAlertDialog dialogSelf);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/nsdevil/ubtmobilev3/dialog/ZAlertDialog$MultiEventLister;", "", "cancelClick", "", "dialogSelf", "Lcom/nsdevil/ubtmobilev3/dialog/ZAlertDialog;", "confirmClick", "app_debug"})
    public static abstract interface MultiEventLister {
        
        public abstract void confirmClick(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.dialog.ZAlertDialog dialogSelf);
        
        public abstract void cancelClick(@org.jetbrains.annotations.NotNull()
        com.nsdevil.ubtmobilev3.dialog.ZAlertDialog dialogSelf);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/nsdevil/ubtmobilev3/dialog/ZAlertDialog$Companion;", "", "()V", "ERROR_TYPE", "", "PROGRESS_TYPE", "SUCCESS_TYPE", "WARNING_TYPE", "instance", "Lcom/nsdevil/ubtmobilev3/dialog/ZAlertDialog;", "getInstance", "context", "Landroid/content/Context;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.nsdevil.ubtmobilev3.dialog.ZAlertDialog getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LifecycleOwner lifecycleOwner) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}