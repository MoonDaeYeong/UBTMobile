package com.nsdevil.ubtmobilev3.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\tH\u0002J\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\tH\u0014J\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\bJ\b\u0010\"\u001a\u00020\tH\u0016J\b\u0010#\u001a\u00020\tH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/nsdevil/ubtmobilev3/dialog/TextInputDialog;", "Landroidx/appcompat/app/AlertDialog;", "context", "Landroid/content/Context;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "inputString", "Lkotlin/Function1;", "", "", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/DialogTextInputBinding;", "cancelStr", "Landroidx/lifecycle/MutableLiveData;", "confirmStr", "modelInAnim", "Landroid/view/animation/Animation;", "getModelInAnim", "()Landroid/view/animation/Animation;", "modelInAnim$delegate", "Lkotlin/Lazy;", "titleStr", "btnAction", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setCancel", "cancel", "setConfirm", "confirm", "setTitle", "title", "show", "subscribeUi", "app_debug"})
public final class TextInputDialog extends androidx.appcompat.app.AlertDialog {
    private com.nsdevil.ubtmobilev3.databinding.DialogTextInputBinding binding;
    private final kotlin.Lazy modelInAnim$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> titleStr = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> confirmStr = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> cancelStr = null;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> inputString = null;
    
    private final android.view.animation.Animation getModelInAnim() {
        return null;
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
    
    public final void setConfirm(@org.jetbrains.annotations.NotNull()
    java.lang.String confirm) {
    }
    
    public final void setCancel(@org.jetbrains.annotations.NotNull()
    java.lang.String cancel) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    public TextInputDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> inputString) {
        super(null);
    }
}