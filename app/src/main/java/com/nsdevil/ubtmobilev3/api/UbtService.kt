package com.nsdevil.ubtmobilev3.api

import com.nsdevil.ubtmobilev3.data.response.ExamStatusResponse
import com.nsdevil.ubtmobilev3.data.request.HeadPosRequest
import com.nsdevil.ubtmobilev3.data.request.LoginRequest
import com.nsdevil.ubtmobilev3.data.request.SignUpRequest
import com.nsdevil.ubtmobilev3.data.request.SubmissionRequest
import com.nsdevil.ubtmobilev3.data.response.*
import com.nsdevil.ubtmobilev3.utilities.UBT_API_URL
import io.reactivex.Flowable
import io.reactivex.Single
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import java.util.concurrent.TimeUnit

interface UbtService {
    @Headers("accept: application/json", "content-type: application/json")
    @POST("mobile/auth/signinmobile")
    fun signInMobile(@Body params: LoginRequest): Single<LoginResponse>

    @GET("user/me")
    fun me(@Header("Authorization") token: String) : Single<MeResponse>

    @GET("mobile/homedata")
    fun homeData(@Header("Authorization") token: String) : Single<HomeDataResponse>

    @GET("{fileName}")
    fun requestFile(@Header("Authorization") token: String, @Path("fileName") fileName: String ): Flowable<ResponseBody>

    @GET("mobile/examstatus")
    suspend fun getExamStatus(@Header("Authorization") token: String, @Query("examId") examId: Int): ExamStatusResponse

    @GET("mobile/exam/questions")
    suspend fun questionsSus(@Header("Authorization") token: String, @Query("examId") examId:Int): QuestionResponse

    @Headers("accept: application/json", "content-type: application/json")
    @POST("mobile/exam/result/upload")
    suspend fun submit(@Header("Authorization") token: String, @Body params: SubmissionRequest): SubmitResponse

    @Multipart
    @POST("mobile/exam/result/data")
    suspend fun uploadResultFile(@Header("Authorization") token:String, @Part("resultId") resultId: RequestBody, @Part signature: MultipartBody.Part, @Part ailog: MultipartBody.Part) : UploadResultResponse

    @Headers("accept: application/json", "content-type: application/json")
    @POST("mobile/aidata")
    suspend fun aiAlertSignal (@Header ("Authorization") token: String, @Body params: HeadPosRequest) : AiDataResponse

    @GET("mobile/examcode/enable")
    suspend fun examCodeRegister(@Header("Authorization") token: String, @Query("examcode") examCode: String) : ExamCodeResponse

    @Headers("accept: application/json", "content-type: application/json")
    @POST("auth/signup")
    suspend fun signUp(@Body params: SignUpRequest) : SignUpResponse

    @GET("mobile/organiz/examlist")
    suspend fun getOrgExampleData(@Header("Authorization") token: String, @Query("organizId") orgId: Int) : OrgExamListResponse

    @GET("mobile/studentrequest")
    suspend fun registerOrg (@Header("Authorization") token: String, @Query("organizId") organizId: Int, @Query("studentCode") studentCode: String) : RegisterOrgResponse

    @GET("mobile/examcodes")
    suspend fun getAllMyExam(@Header("Authorization") token: String, @Query("examname") examName: String) : AllMyExamResponse

    @GET("mobile/other/exams")
    suspend fun getAllOtherExam(@Header("Authorization") token: String, @Query("examname") examName: String) : AllOtherExamResponse

    @GET("mobile/organizs")
    suspend fun getAllOrg(@Header("Authorization") token: String, @Query("type") type: String, @Query("organizName") organizName: String) : AllOrgResponse

    @GET("mobile/examregister")
    suspend fun registerExam(@Header("Authorization") token: String, @Query("examId") examId: Int) :RegisterExamResponse

    companion object {
        fun create(): UbtService {
            val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .connectTimeout(2, TimeUnit.MINUTES)
                .readTimeout(2, TimeUnit.MINUTES)
                .writeTimeout(2, TimeUnit.MINUTES)
                .retryOnConnectionFailure(true)
                .build()

            return Retrofit.Builder()
                .baseUrl(UBT_API_URL)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(UbtService::class.java)
        }
    }
}