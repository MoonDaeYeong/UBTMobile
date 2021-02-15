package com.nsdevil.ubtmobilev3.services

import android.util.Size

data class CameraInfo (
    val name: String,
    val cameraId: String,
    val size: Size,
    val fps: Int
    )
