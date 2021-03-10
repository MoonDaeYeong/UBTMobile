package com.nsdevil.ubtmobilev3.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0017\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J(\u0010\u001a\u001a\u00020\u00182\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00180\u001c2\u0006\u0010\u001e\u001a\u00020\fJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0018J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0002J\u0014\u0010&\u001a\u00020\u0018*\u00020\'2\u0006\u0010(\u001a\u00020\fH\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/nsdevil/ubtmobilev3/viewmodels/StandByViewModel;", "Lcom/nsdevil/ubtmobilev3/base/BaseViewModel;", "repository", "Lcom/nsdevil/ubtmobilev3/data/repository/StandByRepository;", "(Lcom/nsdevil/ubtmobilev3/data/repository/StandByRepository;)V", "continueCheck", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getContinueCheck", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "downloadZipFileName", "Landroidx/lifecycle/MutableLiveData;", "", "getDownloadZipFileName", "()Landroidx/lifecycle/MutableLiveData;", "endCheck", "getEndCheck", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "readyCheck", "getReadyCheck", "status", "getStatus", "createExamInfo", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadZipFile", "onAttachmentDownloadUpdate", "Lkotlin/Function2;", "", "fileName", "getExamInfo", "context", "Landroid/content/Context;", "getExamStatus", "unZip", "zipFilePath", "targetPath", "saveToFile", "Ljava/io/InputStream;", "file", "Companion", "app_debug"})
public final class StandByViewModel extends com.nsdevil.ubtmobilev3.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> readyCheck = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> continueCheck = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> endCheck = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> downloadZipFileName = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> status = null;
    private final com.nsdevil.ubtmobilev3.data.repository.StandByRepository repository = null;
    private static android.content.Context _context;
    @org.jetbrains.annotations.NotNull()
    public static final com.nsdevil.ubtmobilev3.viewmodels.StandByViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getReadyCheck() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getContinueCheck() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEndCheck() {
        return null;
    }
    
    public final void getExamInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDownloadZipFileName() {
        return null;
    }
    
    public final void downloadZipFile(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> onAttachmentDownloadUpdate, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
    }
    
    private final void saveToFile(java.io.InputStream $this$saveToFile, java.lang.String file) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getStatus() {
        return null;
    }
    
    public final void getExamStatus() {
    }
    
    private final void unZip(java.lang.String zipFilePath, java.lang.String targetPath) {
    }
    
    @javax.inject.Inject()
    public StandByViewModel(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.repository.StandByRepository repository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/nsdevil/ubtmobilev3/viewmodels/StandByViewModel$Companion;", "", "()V", "_context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}