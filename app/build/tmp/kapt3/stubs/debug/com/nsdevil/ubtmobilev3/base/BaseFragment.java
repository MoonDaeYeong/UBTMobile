package com.nsdevil.ubtmobilev3.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\nJ\u001e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\nJ\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\nR\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001c"}, d2 = {"Lcom/nsdevil/ubtmobilev3/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "aiAlertCheck", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getAiAlertCheck", "()Landroidx/lifecycle/MutableLiveData;", "customThrowableHandle", "", "throwable", "", "hideLoading", "registerMyReceiver", "setAiUseCheck", "check", "setReTakeCheck", "showLoading", "simpleDialog", "title", "", "msg", "type", "", "startFaceService", "stopFaceService", "unRegisterMyReceiver", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAiAlertCheck() {
        return null;
    }
    
    public final void simpleDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, int type) {
    }
    
    public final void showLoading() {
    }
    
    public final void hideLoading() {
    }
    
    public final void customThrowableHandle(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    public final void startFaceService() {
    }
    
    public final void stopFaceService() {
    }
    
    public final void registerMyReceiver() {
    }
    
    public final void unRegisterMyReceiver() {
    }
    
    public final void setAiUseCheck(boolean check) {
    }
    
    public final void setReTakeCheck(boolean check) {
    }
    
    public BaseFragment() {
        super();
    }
}