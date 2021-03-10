package com.nsdevil.ubtmobilev3.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/nsdevil/ubtmobilev3/utilities/NetworkUtils;", "Landroid/net/ConnectivityManager$NetworkCallback;", "()V", "networkLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getNetworkLiveData", "Landroidx/lifecycle/LiveData;", "context", "Landroid/content/Context;", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "app_debug"})
public final class NetworkUtils extends android.net.ConnectivityManager.NetworkCallback {
    private static final androidx.lifecycle.MutableLiveData<java.lang.Boolean> networkLiveData = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.nsdevil.ubtmobilev3.utilities.NetworkUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNetworkLiveData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public void onAvailable(@org.jetbrains.annotations.NotNull()
    android.net.Network network) {
    }
    
    @java.lang.Override()
    public void onLost(@org.jetbrains.annotations.NotNull()
    android.net.Network network) {
    }
    
    private NetworkUtils() {
        super();
    }
}