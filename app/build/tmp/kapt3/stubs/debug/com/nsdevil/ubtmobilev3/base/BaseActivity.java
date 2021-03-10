package com.nsdevil.ubtmobilev3.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u0014J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0006\u0010\u001e\u001a\u00020\u0014J\u0006\u0010\u001f\u001a\u00020\u0014J\u001e\u0010\u0012\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0014J\u0006\u0010&\u001a\u00020\u0014J\u0006\u0010\'\u001a\u00020\u0014R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/nsdevil/ubtmobilev3/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "aiAlertCheck", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getAiAlertCheck", "()Landroidx/lifecycle/MutableLiveData;", "aiUseCheck", "getAiUseCheck", "()Z", "setAiUseCheck", "(Z)V", "loadingDialog", "Lcom/nsdevil/ubtmobilev3/dialog/ZAlertDialog;", "myReceiver", "Lcom/nsdevil/ubtmobilev3/services/MyReceiver;", "simpleDialog", "customThrowableHandle", "", "throwable", "", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "hideLoading", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "registerMyReceiver", "showLoading", "title", "", "msg", "type", "", "startFaceService", "stopFaceService", "unRegisterMyReceiver", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.nsdevil.ubtmobilev3.dialog.ZAlertDialog simpleDialog;
    private com.nsdevil.ubtmobilev3.dialog.ZAlertDialog loadingDialog;
    private final com.nsdevil.ubtmobilev3.services.MyReceiver myReceiver = null;
    private boolean aiUseCheck = true;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAiAlertCheck() {
        return null;
    }
    
    public final boolean getAiUseCheck() {
        return false;
    }
    
    public final void setAiUseCheck(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showLoading() {
    }
    
    public final void hideLoading() {
    }
    
    public final void simpleDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, int type) {
    }
    
    public final void customThrowableHandle(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
    
    public final void startFaceService() {
    }
    
    public final void stopFaceService() {
    }
    
    public final void registerMyReceiver() {
    }
    
    public final void unRegisterMyReceiver() {
    }
    
    public BaseActivity() {
        super();
    }
}