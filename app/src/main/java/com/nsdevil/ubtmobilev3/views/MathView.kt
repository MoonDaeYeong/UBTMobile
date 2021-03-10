package com.nsdevil.ubtmobilev3.views

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.util.AttributeSet
import android.util.Log
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MathView : WebView {
    private var text: String? = null

    @Volatile
    private var pageLoaded = false

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun init(context: Context) {
        setBackgroundColor(Color.TRANSPARENT)
        text = ""
        pageLoaded = false

        // enable javascript
        settings.loadWithOverviewMode = true
        settings.javaScriptEnabled = true
        settings.defaultFontSize = 22

        // caching
        val dir = context.cacheDir
        if (!dir.exists()) {
            Log.d(TAG, "directory does not exist")
            val mkdirsStatus = dir.mkdirs()
            if (!mkdirsStatus) {
                Log.e(TAG, "directory creation failed")
            }
        }
        settings.setAppCachePath(dir.path)
        settings.setAppCacheEnabled(true)
        settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK

        // disable click
        isClickable = false
        isLongClickable = false
        settings.useWideViewPort = true
        loadUrl("file:///android_asset/www/MathLive.html")
        webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                pageLoaded = true
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    evaluateJavascript("showFormula('" + text + "')", null)
                } else {
                    loadUrl("javascript:showFormula('" + text + "')")
                }
                //        loadUrl("javascript:showFormula('" + MathView.this.text  + "')");
                super.onPageFinished(view, url)
            }
        }
    }

    fun setText(text: String?) {
        this.text = text
        if (pageLoaded) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                evaluateJavascript("showFormula('" + this@MathView.text + "')", null)
            } else {
                loadUrl("javascript:showFormula('" + this@MathView.text + "')")
            }

//      loadUrl("javascript:showFormula('" + MathView.this.text  + "')");
        } else {
            Log.e(TAG, "Page is not loaded yet.")
        }
    }

    fun getText(): String {
        return text!!.substring(1, text!!.length - 1)
    }

    companion object {
        private val TAG = MathView::class.java.simpleName
    }
}