package com.nsdevil.ubtmobilev3.services

import android.annotation.SuppressLint
import android.app.Service
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.ImageFormat
import android.graphics.Matrix
import android.hardware.camera2.CameraCaptureSession
import android.hardware.camera2.CameraDevice
import android.hardware.camera2.CameraManager
import android.hardware.camera2.CaptureRequest
import android.media.Image
import android.media.ImageReader
import android.os.Binder
import android.os.Handler
import android.os.HandlerThread
import android.os.IBinder
import android.util.Log
import android.view.Surface
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.utilities.ImageUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import ubl.headpos.lib.Person
import ubl.headpos.lib.Posenet
import java.io.File
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.*
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
import kotlin.math.abs

class PoseNetService : Service() {

    private val localBinder = Binder()

    override fun onBind(intent: Intent?): IBinder {
        return localBinder
    }

    private var imageReader: ImageReader? = null

    private lateinit var poseNet: Posenet

    private val cameraManager: CameraManager by lazy { applicationContext.getSystemService(Context.CAMERA_SERVICE) as CameraManager }

    private val cameraThread = HandlerThread("CameraThread").apply { start() }

    private val cameraHandler = Handler(cameraThread.looper)

    private lateinit var session: CameraCaptureSession

    private lateinit var camera: CameraDevice

    private var frameCounter = 0

    private val sdf = SimpleDateFormat("yyMMddHHmmss", Locale.getDefault())

    private val testDate = SimpleDateFormat("yyMMdd", Locale.getDefault())

    private val rgbBytes: IntArray by lazy { IntArray(newCameraInfo.size.width * newCameraInfo.size.height) }

    private var yuvBytes = arrayOfNulls<ByteArray>(3)

    private val newCameraInfo: CameraInfo by lazy {
        val context = this.applicationContext
        val cameraManager = context.getSystemService(Context.CAMERA_SERVICE) as CameraManager
        val cameraList = CommonUtils.enumerateVideoCameras(cameraManager)
        val newCameraInfo2: MutableList<CameraInfo> = mutableListOf()
        cameraList.forEach {
            if(it.name.contains("Front") && it.size.width <= 1200)
                newCameraInfo2.add(it)
        }
        newCameraInfo2.first()
    }

    private val cameraId: String by lazy {
        newCameraInfo.cameraId
    }

    private val previewRequest: CaptureRequest by lazy {
        session.device.createCaptureRequest(CameraDevice.TEMPLATE_PREVIEW).apply {
            addTarget(imageReader!!.surface)
        }.build()
    }

    override fun onCreate() {
        super.onCreate()
        poseNet = Posenet(this)
        initializeCamera()
    }

    private fun initializeCamera() = GlobalScope.launch (Dispatchers.Main) {
        camera = openCamera(cameraManager, cameraId, cameraHandler)

        imageReader = ImageReader.newInstance(newCameraInfo.size.width, newCameraInfo.size.height, ImageFormat.YUV_420_888, 2)

        imageReader!!.setOnImageAvailableListener(imageAvailableListener, cameraHandler)

        session = createCaptureSession(camera, listOf(imageReader!!.surface), cameraHandler)

        session.setRepeatingRequest(previewRequest, null, cameraHandler)
    }

    @SuppressLint("MissingPermission")
    private suspend fun openCamera(manager: CameraManager, cameraId: String, handler: Handler? = null) : CameraDevice = suspendCancellableCoroutine { cont ->
        manager.openCamera(cameraId, object : CameraDevice.StateCallback() {
            override fun onOpened( device: CameraDevice) = cont.resume(device)

            override fun onDisconnected(p0: CameraDevice) {
                Log.w(TAG, "Camera $cameraId has been disconnected")
            }

            override fun onError(device: CameraDevice, error: Int) {
                val msg = when (error) {
                    ERROR_CAMERA_DEVICE -> "Fatal (device)"
                    ERROR_CAMERA_DISABLED -> "Device policy"
                    ERROR_CAMERA_IN_USE -> "Camera in use"
                    ERROR_CAMERA_SERVICE -> "Fatal (service)"
                    ERROR_MAX_CAMERAS_IN_USE -> "Maximum cameras in use"
                    else -> "Unknown"
                }
                val exc = RuntimeException("Camera $cameraId error: ($error) $msg")
                Log.e(TAG, exc.message, exc)
                if (cont.isActive) cont.resumeWithException(exc)
            }
        }, handler)
    }

    private suspend fun createCaptureSession(device: CameraDevice, targets: List<Surface>, handler: Handler? = null) : CameraCaptureSession = suspendCoroutine { cont ->
        device.createCaptureSession(targets, object : CameraCaptureSession.StateCallback() {
            override fun onConfigured(session: CameraCaptureSession) = cont.resume(session)
            override fun onConfigureFailed(session: CameraCaptureSession) {
                val exc = RuntimeException("Camera ${device.id} session configuration failed")
                Log.e(TAG, exc.message, exc)
                cont.resumeWithException(exc)
            }
        }, handler)
    }

    private var imageAvailableListener = object : ImageReader.OnImageAvailableListener {
        override fun onImageAvailable(imageReader: ImageReader) {
            val image = imageReader.acquireLatestImage() ?: return
            fillBytes(image.planes, yuvBytes)
            ImageUtils.convertYUV420ToARGB8888( yuvBytes[0]!!, yuvBytes[1]!!, yuvBytes[2]!!, newCameraInfo.size.width, newCameraInfo.size.height, image.planes[0].rowStride, image.planes[1].rowStride, image.planes[1].pixelStride, rgbBytes )

            val imageBitMap = Bitmap.createBitmap(rgbBytes, newCameraInfo.size.width, newCameraInfo.size.height, Bitmap.Config.ARGB_8888)
            val rotateMatrix = Matrix()
            // 전면부 카메라 회전
            val degreetorotateMatrix = -90.0f
            rotateMatrix.preScale(1.0f, -1.0f)
            rotateMatrix.postRotate(degreetorotateMatrix)

            val rotatedBitmap = Bitmap.createBitmap( imageBitMap, 0, 0, newCameraInfo.size.width, newCameraInfo.size.height, rotateMatrix, true )

            image.close()

            frameCounter = (frameCounter + 1) % 3
            if(frameCounter == 0) {
                processImage(rotatedBitmap)
            }
        }
    }

    private fun processImage(bitmap: Bitmap) {
        val croppedBitmap = cropBitmap(bitmap)
        val scaledBitmap = Bitmap.createScaledBitmap(croppedBitmap, MODEL_WIDTH, MODEL_HEIGHT, true)
//        val person = poseNet.estimateSinglePose(scaledBitmap)
        val person = poseNet.estimateMultiPose(scaledBitmap) // 감지 된 얼굴 포함
        if(person.isNullOrEmpty()) {
            sendBroadCast("0")
        }
        if (!person.isNullOrEmpty()) {
            val bestPerson = person.sortedWith(compareByDescending {
                faceChooseAlgorithm(it,"EyeDistance")
            }).first()
            sendBroadCast((bestPerson.score * 100).toInt().toString())
            // 최고의 사람을 사용하여 EyeDistance 및 기타 프로세스를 계산할 수 있습니다.
            calculateEyeDistance(bestPerson)
        }
    }

    private fun faceChooseAlgorithm(person: Person, AlgType: String = "default"): Float {

        return when (AlgType) {
            "EyeDistance" -> { // 눈 거리가 높은 반환 모델
                abs(person.keyPoints[2].position.x - person.keyPoints[1].position.x)
            }
            "EarDistance" -> { // 귀 거리가 높은 반환 모델
                abs(person.keyPoints[3].position.x - person.keyPoints[4].position.x)
            }
            "ShoulderDistance" -> { // 숄더 거리가 높은 반환 모델
                abs(person.keyPoints[5].position.x - person.keyPoints[6].position.x)
            }
            else -> person.score
        } // 모델에 가장 선명한 이미지를 찾으려고합니다.
    }

    private fun calculateEyeDistance(person: Person) {
        // 0, nose. 1, leftEye. 2, rightEye. 3, leftEar. 4, rightEar.
        val eyel = person.keyPoints[2].position.x
        val eyer = person.keyPoints[1].position.x
        val nose = person.keyPoints[0].position.x

        // paintdistance(eyel, nose, eyer)
        val gapLength = eyer - eyel
        val towardsLeft = nose - eyel
        val towardsRight = eyer - nose

        if(gapLength > 0) {
            val towardsLeftNorm = towardsLeft.toDouble() / gapLength
            val towardsRightNorm = towardsRight.toDouble() / gapLength

            val modulusDistance = abs(towardsLeftNorm - 0.5)

            val towards = if(towardsLeftNorm > towardsRightNorm) "Right" else "Left"

            handleDistance(modulusDistance, towards)
        }
    }

    private fun handleDistance(modulusDistance: Double, towards: String) {
        val distancePercent = (modulusDistance * 100)
        if(distancePercent >= 15)  {
            sendBroadCast(towards)
        }
        appendLog(modulusDistance, towards)
    }

    private fun appendLog(modulusDistance: Double, towards: String) {
        val towardsn = if (towards == "Right") "R" else "L"
        val timestamp = Timestamp(System.currentTimeMillis())
        val fileNameText = "Logfile-" + testDate.format(timestamp) + "-" + CommonUtils.userExam?.examId + "-" + CommonUtils.userExam?.examCode + ".txt"

        val logFile = File(getExternalFilesDir(null), fileNameText)
        if(!logFile.exists())
            logFile.createNewFile()
        val dataToAppend = String.format(sdf.format(timestamp) + "," + "%.2f", modulusDistance) + ",$towardsn"

        if(logFile.readText().isNotEmpty()) {
            logFile.writeText(logFile.readText()+"\n" + dataToAppend)
        } else {
            logFile.writeText(dataToAppend)
        }
    }

    private fun fillBytes(planes: Array<Image.Plane>, yuvBytes: Array<ByteArray?>) {
        for(i in planes.indices) {
            val buffer = planes[i].buffer
            if(yuvBytes[i] == null) {
                yuvBytes[i] = ByteArray(buffer.capacity())
            }
            buffer.get(yuvBytes[i]!!)
        }
    }

    private fun cropBitmap(bitmap: Bitmap): Bitmap {
        val bitmapRatio = bitmap.height.toFloat() / bitmap.width
        val modelInputRatio = MODEL_HEIGHT.toFloat() / MODEL_WIDTH
        var croppedBitmap = bitmap

        val maxDifference = 1e-5

        croppedBitmap = when {
            abs(modelInputRatio - bitmapRatio) < maxDifference -> return croppedBitmap
            modelInputRatio < bitmapRatio -> {
                val cropHeight = bitmap.height - (bitmap.width.toFloat() / modelInputRatio)
                Bitmap.createBitmap( bitmap, 0, (cropHeight / 2).toInt(), bitmap.width, (bitmap.height - cropHeight).toInt())
            } else -> {
                val cropWidth = bitmap.width - (bitmap.height.toFloat() * modelInputRatio)
                Bitmap.createBitmap(bitmap, (cropWidth / 2).toInt(), 0, (bitmap.width - cropWidth).toInt(), bitmap.height)
            }
        }
        return croppedBitmap
    }

    override fun onDestroy() {
        super.onDestroy()

        if(this::camera.isInitialized) {
            camera.close()
            session.close()
        }
        cameraThread.quitSafely()
        imageReader?.close()
    }

    private fun sendBroadCast(text: String) {
        val broadcastIntent = Intent()
        broadcastIntent.action = "com.nsdevil.ubt_headpos_test.intent.action.MESSAGE_PROCESSED"
        broadcastIntent.addCategory(Intent.CATEGORY_DEFAULT)
        broadcastIntent.putExtra("omsg", text)
        sendBroadcast(broadcastIntent)
    }

    companion object {
        private val TAG = PoseNetService::class.java.simpleName

        const val MODEL_WIDTH = 257
        const val MODEL_HEIGHT = 257
    }
}