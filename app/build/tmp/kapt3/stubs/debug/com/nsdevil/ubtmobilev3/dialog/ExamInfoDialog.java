package com.nsdevil.ubtmobilev3.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/nsdevil/ubtmobilev3/dialog/ExamInfoDialog;", "Landroidx/appcompat/app/AlertDialog;", "context", "Landroid/content/Context;", "userExam", "Lcom/nsdevil/ubtmobilev3/data/response/HomeDataResponse$Result$Userexam;", "confirmClick", "Lkotlin/Function0;", "", "(Landroid/content/Context;Lcom/nsdevil/ubtmobilev3/data/response/HomeDataResponse$Result$Userexam;Lkotlin/jvm/functions/Function0;)V", "binding", "Lcom/nsdevil/ubtmobilev3/databinding/DialogExamInfoBinding;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "subscribeUi", "app_debug"})
public final class ExamInfoDialog extends androidx.appcompat.app.AlertDialog {
    private com.nsdevil.ubtmobilev3.databinding.DialogExamInfoBinding binding;
    private final com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.Userexam userExam = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> confirmClick = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeUi() {
    }
    
    public ExamInfoDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.Userexam userExam, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> confirmClick) {
        super(null);
    }
}