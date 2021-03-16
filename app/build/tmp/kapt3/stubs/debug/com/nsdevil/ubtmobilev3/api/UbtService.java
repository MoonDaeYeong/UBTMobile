package com.nsdevil.ubtmobilev3.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00e2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 Y2\u00020\u0001:\u0001YJ%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J9\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ%\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ/\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010!\u001a\u00020\u00052\b\b\u0001\u0010\"\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J%\u0010$\u001a\u00020%2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001b\u0010&\u001a\u00020\u001d2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J%\u0010(\u001a\u00020)2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010*\u001a\u00020+H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J%\u0010-\u001a\u00020.2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010/\u001a\u00020+H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J%\u00100\u001a\u0002012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010*\u001a\u00020+H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u0018\u00102\u001a\b\u0012\u0004\u0012\u000204032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u00105\u001a\b\u0012\u0004\u0012\u000206032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\'J%\u00107\u001a\u0002082\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010*\u001a\u00020+H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J%\u00109\u001a\u00020:2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010*\u001a\u00020+H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J/\u0010;\u001a\u00020<2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010=\u001a\u00020+2\b\b\u0001\u0010>\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010?J\"\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010C\u001a\u00020\u0005H\'J%\u0010D\u001a\u00020E2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020FH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020I032\b\b\u0001\u0010\u0006\u001a\u00020JH\'J\u001b\u0010K\u001a\u00020L2\b\b\u0001\u0010\u0006\u001a\u00020MH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010NJ%\u0010O\u001a\u00020P2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020QH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010RJ9\u0010S\u001a\u00020T2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010U\u001a\u00020\u00142\b\b\u0001\u0010V\u001a\u00020\u00102\b\b\u0001\u0010W\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010X\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006Z"}, d2 = {"Lcom/nsdevil/ubtmobilev3/api/UbtService;", "", "aiAlertSignal", "Lcom/nsdevil/ubtmobilev3/data/response/AiDataResponse;", "token", "", "params", "Lcom/nsdevil/ubtmobilev3/data/request/HeadPosRequest;", "(Ljava/lang/String;Lcom/nsdevil/ubtmobilev3/data/request/HeadPosRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePassword", "Lcom/nsdevil/ubtmobilev3/data/response/ChangePassResponse;", "Lcom/nsdevil/ubtmobilev3/data/request/PasswordRequest;", "(Ljava/lang/String;Lcom/nsdevil/ubtmobilev3/data/request/PasswordRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePicture", "Lcom/nsdevil/ubtmobilev3/data/response/EditProfileResponse;", "image", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editProfile", "firstname", "Lokhttp3/RequestBody;", "lastname", "phone", "(Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "examCodeRegister", "Lcom/nsdevil/ubtmobilev3/data/response/ExamCodeResponse;", "examCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMyExam", "Lcom/nsdevil/ubtmobilev3/data/response/AllMyExamResponse;", "examName", "getAllOrg", "Lcom/nsdevil/ubtmobilev3/data/response/AllOrgResponse;", "type", "organizName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOtherExam", "Lcom/nsdevil/ubtmobilev3/data/response/AllOtherExamResponse;", "getExamCodeStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExamStatus", "Lcom/nsdevil/ubtmobilev3/data/response/ExamStatusResponse;", "examId", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrgExampleData", "Lcom/nsdevil/ubtmobilev3/data/response/OrgExamListResponse;", "orgId", "getSurveyItem", "Lcom/nsdevil/ubtmobilev3/data/response/SurveyResponse;", "homeData", "Lio/reactivex/Single;", "Lcom/nsdevil/ubtmobilev3/data/response/HomeDataResponse;", "me", "Lcom/nsdevil/ubtmobilev3/data/response/MeResponse;", "questionsSus", "Lcom/nsdevil/ubtmobilev3/data/response/QuestionResponse;", "registerExam", "Lcom/nsdevil/ubtmobilev3/data/response/RegisterExamResponse;", "registerOrg", "Lcom/nsdevil/ubtmobilev3/data/response/RegisterOrgResponse;", "organizId", "studentCode", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFile", "Lio/reactivex/Flowable;", "Lokhttp3/ResponseBody;", "fileName", "sendSurvey", "Lcom/nsdevil/ubtmobilev3/data/response/SendSurveyResponse;", "Lcom/nsdevil/ubtmobilev3/data/request/SurveyRequest;", "(Ljava/lang/String;Lcom/nsdevil/ubtmobilev3/data/request/SurveyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInMobile", "Lcom/nsdevil/ubtmobilev3/data/response/LoginResponse;", "Lcom/nsdevil/ubtmobilev3/data/request/LoginRequest;", "signUp", "Lcom/nsdevil/ubtmobilev3/data/response/SignUpResponse;", "Lcom/nsdevil/ubtmobilev3/data/request/SignUpRequest;", "(Lcom/nsdevil/ubtmobilev3/data/request/SignUpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submit", "Lcom/nsdevil/ubtmobilev3/data/response/SubmitResponse;", "Lcom/nsdevil/ubtmobilev3/data/request/SubmissionRequest;", "(Ljava/lang/String;Lcom/nsdevil/ubtmobilev3/data/request/SubmissionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadResultFile", "Lcom/nsdevil/ubtmobilev3/data/response/UploadResultResponse;", "resultId", "signature", "ailog", "(Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface UbtService {
    @org.jetbrains.annotations.NotNull()
    public static final com.nsdevil.ubtmobilev3.api.UbtService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "api/mobile/auth/signinmobile")
    @retrofit2.http.Headers(value = {"accept: application/json", "content-type: application/json"})
    public abstract io.reactivex.Single<com.nsdevil.ubtmobilev3.data.response.LoginResponse> signInMobile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.nsdevil.ubtmobilev3.data.request.LoginRequest params);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/user/me")
    public abstract io.reactivex.Single<com.nsdevil.ubtmobilev3.data.response.MeResponse> me(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/mobile/homedata")
    public abstract io.reactivex.Single<com.nsdevil.ubtmobilev3.data.response.HomeDataResponse> homeData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "uploadingDir/examdata/{fileName}")
    public abstract io.reactivex.Flowable<okhttp3.ResponseBody> requestFile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "fileName")
    java.lang.String fileName);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/mobile/examstatus")
    public abstract java.lang.Object getExamStatus(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Query(value = "examId")
    int examId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.ExamStatusResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/mobile/exam/questions")
    public abstract java.lang.Object questionsSus(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Query(value = "examId")
    int examId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.QuestionResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/mobile/exam/result/upload")
    @retrofit2.http.Headers(value = {"accept: application/json", "content-type: application/json"})
    public abstract java.lang.Object submit(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.nsdevil.ubtmobilev3.data.request.SubmissionRequest params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.SubmitResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/mobile/exam/result/data")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object uploadResultFile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "resultId")
    okhttp3.RequestBody resultId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part signature, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part ailog, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.UploadResultResponse> p4);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/mobile/aidata")
    @retrofit2.http.Headers(value = {"accept: application/json", "content-type: application/json"})
    public abstract java.lang.Object aiAlertSignal(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.nsdevil.ubtmobilev3.data.request.HeadPosRequest params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.AiDataResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/mobile/examcode/enable")
    public abstract java.lang.Object examCodeRegister(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "examcode")
    java.lang.String examCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.ExamCodeResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/auth/signup")
    @retrofit2.http.Headers(value = {"accept: application/json", "content-type: application/json"})
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.nsdevil.ubtmobilev3.data.request.SignUpRequest params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.SignUpResponse> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/mobile/organiz/examlist")
    public abstract java.lang.Object getOrgExampleData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Query(value = "organizId")
    int orgId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/mobile/studentrequest")
    public abstract java.lang.Object registerOrg(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Query(value = "organizId")
    int organizId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "studentCode")
    java.lang.String studentCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.RegisterOrgResponse> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/mobile/examcodes")
    public abstract java.lang.Object getAllMyExam(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "examname")
    java.lang.String examName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/mobile/other/exams")
    public abstract java.lang.Object getAllOtherExam(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "examname")
    java.lang.String examName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.AllOtherExamResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/mobile/organizs")
    public abstract java.lang.Object getAllOrg(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "organizName")
    java.lang.String organizName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.AllOrgResponse> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/mobile/examregister")
    public abstract java.lang.Object registerExam(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Query(value = "examId")
    int examId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.RegisterExamResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/mobile/examcodes")
    public abstract java.lang.Object getExamCodeStatus(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/users/modify")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object editProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "firstname")
    okhttp3.RequestBody firstname, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "lastname")
    okhttp3.RequestBody lastname, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "phone")
    okhttp3.RequestBody phone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.EditProfileResponse> p4);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/users/modify")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object changePicture(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.EditProfileResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/users/password/update")
    @retrofit2.http.Headers(value = {"accept: application/json", "content-type: application/json"})
    public abstract java.lang.Object changePassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.nsdevil.ubtmobilev3.data.request.PasswordRequest params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.ChangePassResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/mobile/exam/surveys")
    public abstract java.lang.Object getSurveyItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Query(value = "examId")
    int examId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.SurveyResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/mobile/exam/survey/upload")
    @retrofit2.http.Headers(value = {"accept: application/json", "content-type: application/json"})
    public abstract java.lang.Object sendSurvey(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.nsdevil.ubtmobilev3.data.request.SurveyRequest params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nsdevil.ubtmobilev3.data.response.SendSurveyResponse> p2);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J*\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\f\u001a\u00020\nH\u0002J(\u0010\r\u001a\u00020\u00042\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\f\u001a\u00020\n\u00a8\u0006\u000e"}, d2 = {"Lcom/nsdevil/ubtmobilev3/api/UbtService$Companion;", "", "()V", "create", "Lcom/nsdevil/ubtmobilev3/api/UbtService;", "createOkHttpProgressClient", "Lokhttp3/OkHttpClient;", "onAttachmentDownloadUpdate", "Lkotlin/Function2;", "", "", "", "fileName", "downloadCreate", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.nsdevil.ubtmobilev3.api.UbtService create() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.nsdevil.ubtmobilev3.api.UbtService downloadCreate(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> onAttachmentDownloadUpdate, @org.jetbrains.annotations.NotNull()
        java.lang.String fileName) {
            return null;
        }
        
        private final okhttp3.OkHttpClient createOkHttpProgressClient(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> onAttachmentDownloadUpdate, java.lang.String fileName) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}