package com.nsdevil.ubtmobilev3.utilities

import android.content.Context
import android.view.View
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

fun Context.getColorRes(@ColorRes id: Int) = ContextCompat.getColor(applicationContext, id)