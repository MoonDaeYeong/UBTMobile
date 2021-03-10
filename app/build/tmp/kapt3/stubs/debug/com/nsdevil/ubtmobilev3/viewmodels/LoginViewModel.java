package com.nsdevil.ubtmobilev3.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/nsdevil/ubtmobilev3/viewmodels/LoginViewModel;", "Lcom/nsdevil/ubtmobilev3/base/BaseViewModel;", "loginRepository", "Lcom/nsdevil/ubtmobilev3/data/repository/LoginRepository;", "(Lcom/nsdevil/ubtmobilev3/data/repository/LoginRepository;)V", "loginResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/nsdevil/ubtmobilev3/data/response/LoginResponse;", "getLoginResult", "()Landroidx/lifecycle/MutableLiveData;", "login", "", "email", "", "password", "app_debug"})
public final class LoginViewModel extends com.nsdevil.ubtmobilev3.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.LoginResponse> loginResult = null;
    private final com.nsdevil.ubtmobilev3.data.repository.LoginRepository loginRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.nsdevil.ubtmobilev3.data.response.LoginResponse> getLoginResult() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.repository.LoginRepository loginRepository) {
        super();
    }
}