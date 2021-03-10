package com.nsdevil.ubtmobilev3.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\nJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0010J\u0006\u0010(\u001a\u00020\u0010J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\nH\u0002J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0010J\u0014\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u0002020!R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u00063"}, d2 = {"Lcom/nsdevil/ubtmobilev3/utilities/CommonUtils;", "", "()V", "meResponse", "Lcom/nsdevil/ubtmobilev3/data/response/MeResponse;", "getMeResponse", "()Lcom/nsdevil/ubtmobilev3/data/response/MeResponse;", "setMeResponse", "(Lcom/nsdevil/ubtmobilev3/data/response/MeResponse;)V", "remainQuestionNumber", "", "getRemainQuestionNumber", "()I", "setRemainQuestionNumber", "(I)V", "tokenForm", "", "getTokenForm", "()Ljava/lang/String;", "setTokenForm", "(Ljava/lang/String;)V", "totalQuestionNumber", "getTotalQuestionNumber", "setTotalQuestionNumber", "userExam", "Lcom/nsdevil/ubtmobilev3/data/response/HomeDataResponse$Result$Userexam;", "getUserExam", "()Lcom/nsdevil/ubtmobilev3/data/response/HomeDataResponse$Result$Userexam;", "setUserExam", "(Lcom/nsdevil/ubtmobilev3/data/response/HomeDataResponse$Result$Userexam;)V", "clockString", "secondTime", "enumerateVideoCameras", "", "Lcom/nsdevil/ubtmobilev3/services/CameraInfo;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "fromHtml", "Landroid/text/Spanned;", "contents", "getDate", "lensOrientationString", "value", "setToken", "", "tType", "token", "submissionRequest", "Lcom/nsdevil/ubtmobilev3/data/request/SubmissionRequest;", "questionAnswer", "Lcom/nsdevil/ubtmobilev3/data/model/QuestionAnswer;", "app_debug"})
public final class CommonUtils {
    private static int totalQuestionNumber = 0;
    private static int remainQuestionNumber = 0;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String tokenForm = "";
    public static com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.Userexam userExam;
    public static com.nsdevil.ubtmobilev3.data.response.MeResponse meResponse;
    @org.jetbrains.annotations.NotNull()
    public static final com.nsdevil.ubtmobilev3.utilities.CommonUtils INSTANCE = null;
    
    public final int getTotalQuestionNumber() {
        return 0;
    }
    
    public final void setTotalQuestionNumber(int p0) {
    }
    
    public final int getRemainQuestionNumber() {
        return 0;
    }
    
    public final void setRemainQuestionNumber(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTokenForm() {
        return null;
    }
    
    public final void setTokenForm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String tType, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.Userexam getUserExam() {
        return null;
    }
    
    public final void setUserExam(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.Userexam p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nsdevil.ubtmobilev3.data.response.MeResponse getMeResponse() {
        return null;
    }
    
    public final void setMeResponse(@org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.response.MeResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String clockString(int secondTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spanned fromHtml(@org.jetbrains.annotations.NotNull()
    java.lang.String contents) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nsdevil.ubtmobilev3.data.request.SubmissionRequest submissionRequest(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nsdevil.ubtmobilev3.data.model.QuestionAnswer> questionAnswer) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    private final java.lang.String lensOrientationString(int value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.nsdevil.ubtmobilev3.services.CameraInfo> enumerateVideoCameras(@org.jetbrains.annotations.NotNull()
    android.hardware.camera2.CameraManager cameraManager) {
        return null;
    }
    
    private CommonUtils() {
        super();
    }
}