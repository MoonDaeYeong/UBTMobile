package com.nsdevil.ubtmobilev3.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00cc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ^2\u00020\u0001:\u0001^B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\bH\u0002J\u0010\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020=H\u0002J3\u0010>\u001a\u0002002\u0006\u0010?\u001a\u00020\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ\u0010\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020FH\u0002J\u001a\u0010H\u001a\u00020I2\u0006\u0010<\u001a\u00020=2\b\b\u0002\u0010J\u001a\u00020\bH\u0002J+\u0010K\u001a\u0002072\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M032\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010403H\u0002\u00a2\u0006\u0002\u0010NJ\u0018\u0010O\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\bH\u0002J\b\u0010P\u001a\u00020QH\u0002J\u0012\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010UH\u0016J\b\u0010V\u001a\u000207H\u0016J\b\u0010W\u001a\u000207H\u0016J-\u0010X\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0006H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010ZJ\u0010\u0010[\u001a\u0002072\u0006\u0010G\u001a\u00020FH\u0002J\u0010\u0010\\\u001a\u0002072\u0006\u0010]\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\f\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\f\u001a\u0004\b*\u0010+R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010403X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u00105\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006_"}, d2 = {"Lcom/nsdevil/ubtmobilev3/services/PoseNetService;", "Landroid/app/Service;", "()V", "camera", "Landroid/hardware/camera2/CameraDevice;", "cameraHandler", "Landroid/os/Handler;", "cameraId", "", "getCameraId", "()Ljava/lang/String;", "cameraId$delegate", "Lkotlin/Lazy;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "getCameraManager", "()Landroid/hardware/camera2/CameraManager;", "cameraManager$delegate", "cameraThread", "Landroid/os/HandlerThread;", "frameCounter", "", "imageAvailableListener", "Landroid/media/ImageReader$OnImageAvailableListener;", "imageReader", "Landroid/media/ImageReader;", "localBinder", "Landroid/os/Binder;", "newCameraInfo", "Lcom/nsdevil/ubtmobilev3/services/CameraInfo;", "getNewCameraInfo", "()Lcom/nsdevil/ubtmobilev3/services/CameraInfo;", "newCameraInfo$delegate", "poseNet", "Lubl/headpos/lib/Posenet;", "previewRequest", "Landroid/hardware/camera2/CaptureRequest;", "getPreviewRequest", "()Landroid/hardware/camera2/CaptureRequest;", "previewRequest$delegate", "rgbBytes", "", "getRgbBytes", "()[I", "rgbBytes$delegate", "sdf", "Ljava/text/SimpleDateFormat;", "session", "Landroid/hardware/camera2/CameraCaptureSession;", "testDate", "yuvBytes", "", "", "[[B", "appendLog", "", "modulusDistance", "", "towards", "calculateEyeDistance", "person", "Lubl/headpos/lib/Person;", "createCaptureSession", "device", "targets", "", "Landroid/view/Surface;", "handler", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cropBitmap", "Landroid/graphics/Bitmap;", "bitmap", "faceChooseAlgorithm", "", "AlgType", "fillBytes", "planes", "Landroid/media/Image$Plane;", "([Landroid/media/Image$Plane;[[B)V", "handleDistance", "initializeCamera", "Lkotlinx/coroutines/Job;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "openCamera", "manager", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processImage", "sendBroadCast", "text", "Companion", "app_debug"})
public final class PoseNetService extends android.app.Service {
    private final android.os.Binder localBinder = null;
    private android.media.ImageReader imageReader;
    private ubl.headpos.lib.Posenet poseNet;
    private final kotlin.Lazy cameraManager$delegate = null;
    private final android.os.HandlerThread cameraThread = null;
    private final android.os.Handler cameraHandler = null;
    private android.hardware.camera2.CameraCaptureSession session;
    private android.hardware.camera2.CameraDevice camera;
    private int frameCounter = 0;
    private final java.text.SimpleDateFormat sdf = null;
    private final java.text.SimpleDateFormat testDate = null;
    private final kotlin.Lazy rgbBytes$delegate = null;
    private byte[][] yuvBytes;
    private final kotlin.Lazy newCameraInfo$delegate = null;
    private final kotlin.Lazy cameraId$delegate = null;
    private final kotlin.Lazy previewRequest$delegate = null;
    private android.media.ImageReader.OnImageAvailableListener imageAvailableListener;
    private static final java.lang.String TAG = null;
    public static final int MODEL_WIDTH = 257;
    public static final int MODEL_HEIGHT = 257;
    @org.jetbrains.annotations.NotNull()
    public static final com.nsdevil.ubtmobilev3.services.PoseNetService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    private final android.hardware.camera2.CameraManager getCameraManager() {
        return null;
    }
    
    private final int[] getRgbBytes() {
        return null;
    }
    
    private final com.nsdevil.ubtmobilev3.services.CameraInfo getNewCameraInfo() {
        return null;
    }
    
    private final java.lang.String getCameraId() {
        return null;
    }
    
    private final android.hardware.camera2.CaptureRequest getPreviewRequest() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final kotlinx.coroutines.Job initializeCamera() {
        return null;
    }
    
    private final void processImage(android.graphics.Bitmap bitmap) {
    }
    
    private final float faceChooseAlgorithm(ubl.headpos.lib.Person person, java.lang.String AlgType) {
        return 0.0F;
    }
    
    private final void calculateEyeDistance(ubl.headpos.lib.Person person) {
    }
    
    private final void handleDistance(double modulusDistance, java.lang.String towards) {
    }
    
    private final void appendLog(double modulusDistance, java.lang.String towards) {
    }
    
    private final void fillBytes(android.media.Image.Plane[] planes, byte[][] yuvBytes) {
    }
    
    private final android.graphics.Bitmap cropBitmap(android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void sendBroadCast(java.lang.String text) {
    }
    
    public PoseNetService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/nsdevil/ubtmobilev3/services/PoseNetService$Companion;", "", "()V", "MODEL_HEIGHT", "", "MODEL_WIDTH", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}