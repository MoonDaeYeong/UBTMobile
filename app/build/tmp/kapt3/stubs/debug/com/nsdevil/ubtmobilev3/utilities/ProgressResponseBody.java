package com.nsdevil.ubtmobilev3.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/nsdevil/ubtmobilev3/utilities/ProgressResponseBody;", "Lokhttp3/ResponseBody;", "responseBody", "onAttachmentDownloadUpdate", "Lkotlin/Function2;", "", "", "", "fileName", "(Lokhttp3/ResponseBody;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V", "bufferedSource", "Lokio/BufferedSource;", "getFileName", "()Ljava/lang/String;", "getOnAttachmentDownloadUpdate", "()Lkotlin/jvm/functions/Function2;", "getResponseBody", "()Lokhttp3/ResponseBody;", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "source", "Lokio/Source;", "app_debug"})
public final class ProgressResponseBody extends okhttp3.ResponseBody {
    private okio.BufferedSource bufferedSource;
    @org.jetbrains.annotations.NotNull()
    private final okhttp3.ResponseBody responseBody = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.String, kotlin.Unit> onAttachmentDownloadUpdate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fileName = null;
    
    @java.lang.Override()
    public long contentLength() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public okhttp3.MediaType contentType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okio.BufferedSource source() {
        return null;
    }
    
    private final okio.Source source(okio.Source source) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.ResponseBody getResponseBody() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.String, kotlin.Unit> getOnAttachmentDownloadUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFileName() {
        return null;
    }
    
    public ProgressResponseBody(@org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody responseBody, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> onAttachmentDownloadUpdate, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        super();
    }
}