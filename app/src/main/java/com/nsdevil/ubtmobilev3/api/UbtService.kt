package com.nsdevil.ubtmobilev3.api

import com.nsdevil.ubtmobilev3.data.request.*
import com.nsdevil.ubtmobilev3.data.response.ExamStatusResponse
import com.nsdevil.ubtmobilev3.data.response.*
import com.nsdevil.ubtmobilev3.utilities.ProgressResponseBody
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
    @POST("api/mobile/auth/signinmobile")
    fun signInMobile(@Body params: LoginRequest): Single<LoginResponse>

    @GET("api/user/me")
    fun me(@Header("Authorization") token: String): Single<MeResponse>

    @GET("api/mobile/homedata")
    fun homeData(@Header("Authorization") token: String): Single<HomeDataResponse>

    @GET("uploadingDir/examdata/{fileName}")
    fun requestFile(@Header("Authorization") token: String,@Path("fileName") fileName: String): Flowable<ResponseBody>

    @GET("api/mobile/examstatus")
    suspend fun getExamStatus(@Header("Authorization") token: String,@Query("examId") examId: Int): ExamStatusResponse

    @GET("api/mobile/exam/questions")
    suspend fun questionsSus(@Header("Authorization") token: String,@Query("examId") examId: Int): QuestionResponse

    @Headers("accept: application/json", "content-type: application/json")
    @POST("api/mobile/exam/result/upload")
    suspend fun submit(@Header("Authorization") token: String,@Body params: SubmissionRequest): SubmitResponse

    @Multipart
    @POST("api/mobile/exam/result/data")
    suspend fun uploadResultFile(@Header("Authorization") token: String,@Part("resultId") resultId: RequestBody,@Part signature: MultipartBody.Part,@Part ailog: MultipartBody.Part): UploadResultResponse

    @Headers("accept: application/json", "content-type: application/json")
    @POST("api/mobile/aidata")
    suspend fun aiAlertSignal(@Header("Authorization") token: String,@Body params: HeadPosRequest): AiDataResponse

    @GET("api/mobile/examcode/enable")
    suspend fun examCodeRegister(@Header("Authorization") token: String,@Query("examcode") examCode: String): ExamCodeResponse

    @Headers("accept: application/json", "content-type: application/json")
    @POST("api/auth/signup")
    suspend fun signUp(@Body params: SignUpRequest): SignUpResponse

    @GET("api/mobile/organiz/examlist")
    suspend fun getOrgExampleData(@Header("Authorization") token: String,@Query("organizId") orgId: Int): OrgExamListResponse

    @GET("api/mobile/studentrequest")
    suspend fun registerOrg(@Header("Authorization") token: String,@Query("organizId") organizId: Int,@Query("studentCode") studentCode: String): RegisterOrgResponse

    @GET("api/mobile/examcodes")
    suspend fun getAllMyExam(@Header("Authorization") token: String,@Query("examname") examName: String): AllMyExamResponse

    @GET("api/mobile/other/exams")
    suspend fun getAllOtherExam(@Header("Authorization") token: String,@Query("examname") examName: String): AllOtherExamResponse

    @GET("api/mobile/organizs")
    suspend fun getAllOrg(@Header("Authorization") token: String,@Query("type") type: String,@Query("organizName") organizName: String): AllOrgResponse

    @GET("api/mobile/examregister")
    suspend fun registerExam(@Header("Authorization") token: String,@Query("examId") examId: Int): RegisterExamResponse

    @GET("api/mobile/examcodes")
    suspend fun getExamCodeStatus(@Header("Authorization") token: String) : AllMyExamResponse

    @Multipart
    @POST("api/users/modify")
    suspend fun editProfile(@Header("Authorization") token: String, @Part("firstname") firstname: RequestBody, @Part("lastname") lastname: RequestBody, @Part("phone") phone: RequestBody): EditProfileResponse

    @Multipart
    @POST("api/users/modify")
    suspend fun changePicture(@Header("Authorization") token: String, @Part image: MultipartBody.Part): EditProfileResponse

    @Headers("accept: application/json", "content-type: application/json")
    @POST("api/users/password/update")
    suspend fun changePassword(@Header("Authorization") token: String, @Body params: PasswordRequest) : ChangePassResponse

    @GET("api/mobile/exam/surveys")
    suspend fun getSurveyItem(@Header("Authorization") token: String, @Query("examId") examId: Int): SurveyResponse

    @Headers("accept: application/json", "content-type: application/json")
    @POST("api/mobile/exam/survey/upload")
    suspend fun sendSurvey(@Header("Authorization") token: String, @Body params: SurveyRequest) : SendSurveyResponse

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

        fun downloadCreate(onAttachmentDownloadUpdate: (Int, String) -> Unit, fileName: String): UbtService {
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
                .client(createOkHttpProgressClient(onAttachmentDownloadUpdate, fileName))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(UbtService::class.java)
        }

        private fun createOkHttpProgressClient(onAttachmentDownloadUpdate: (Int, String) -> Unit,fileName: String): OkHttpClient {
            val builder = OkHttpClient.Builder()
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            builder.apply {
                connectTimeout(2, TimeUnit.MINUTES)
                readTimeout(2, TimeUnit.MINUTES)
                writeTimeout(2, TimeUnit.MINUTES)
                retryOnConnectionFailure(true)

                addInterceptor(interceptor)
                addInterceptor { chain ->
                    val originalResponse = chain.proceed(chain.request())
                    originalResponse.newBuilder()
                        .body(originalResponse.body?.let {
                            ProgressResponseBody(it, onAttachmentDownloadUpdate, fileName)
                        })
                        .build()
                }
            }
            return builder.build()
        }
    }
}