package com.nsdevil.ubtmobilev3.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.utilities.CommonUtils
import com.nsdevil.ubtmobilev3.utilities.IMAGE_API_URL
import com.nsdevil.ubtmobilev3.utilities.getColorRes
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("circlePicUrl")
fun bindCirclePicUrl(iv: ImageView, url: String?) {
    if(!url.isNullOrEmpty()) {
        Glide.with(iv).load(String.format("%s%s", IMAGE_API_URL, url)).error(R.drawable.error_profile).apply(
            RequestOptions.circleCropTransform()
        ).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).into(iv)
    }
}

@BindingAdapter("get_user_img")
fun bindGetUserImg(iv: ImageView, url: String?) {
    if(!url.isNullOrEmpty()) {
        Glide.with(iv).load(String.format("%s%s", IMAGE_API_URL, url)).error(R.drawable.error_profile).diskCacheStrategy(
            DiskCacheStrategy.NONE
        ).skipMemoryCache(true).into(iv)
    }
}

@BindingAdapter("status_change_text")
fun bindStatusChangeText(tv: TextView, status: String?) {
    if(!status.isNullOrEmpty()) {
        if(status.equals("start", true))
            tv.setTextColor(tv.context.getColorRes(android.R.color.holo_green_light))
        else if (status.equals("prepare", true) || status.equals("ready", true))
            tv.setTextColor(tv.context.getColorRes(R.color.colorPrimary))
        else
            tv.setTextColor(tv.context.getColorRes(R.color.draw_color_red))

        tv.text = status.toUpperCase(Locale.getDefault())
    }
}

@BindingAdapter("image_from_url")
fun bindImageFromUrl(iv: ImageView, url: String?) {
    val context = iv.context
    if(!url.isNullOrEmpty()) {
        if (url.contains("http", true)) {
            Glide.with(context)
                .load(url)
                .error(R.drawable.ic_ubt_logo)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(iv)
        } else {
            val newUrl = "https://ubtcloud.me/uploadingDir/organizicons/" + url
            Glide.with(context)
                .load(newUrl)
                .error(R.drawable.ic_ubt_logo)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(iv)
        }
    }
}

@BindingAdapter("exam_s_date", "exam_e_date")
fun bindExamDate(tv: TextView, sDate: String?, eDate: String?) {
    if(!sDate.isNullOrEmpty() && !eDate.isNullOrEmpty()) {
        val sdf = SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREAN)

        val sDay = sdf.format(Date(sDate.toLong()))
        val eDay = sdf.format(Date(eDate.toLong()))

        tv.text = String.format("%s ~ %s", sDay, eDay)
    }
}

@BindingAdapter("org_is_mine")
fun bindOrgIsMine(iv: ImageView, mineCheck: Boolean?) {
    if(mineCheck != null) {
        if(mineCheck)
            iv.visibility = View.VISIBLE
        else
            iv.visibility = View.GONE
    }
}

@BindingAdapter("status_change_info_text")
fun bindStatusChangeInfoText(tv: TextView, status: String?) {
    if(!status.isNullOrEmpty()) {
        if(status.equals("start", true)){
            tv.visibility = View.GONE
        } else if (status.equals("prepare", true) || status.equals("ready", true)) {
            tv.setTextColor(tv.context.getColorRes(R.color.colorPrimary))
            tv.text = "The test has not started yet."
            tv.visibility = View.VISIBLE
        } else {
            tv.setTextColor(tv.context.getColorRes(R.color.draw_color_red))
            tv.text = "The test is Finish."
            tv.visibility = View.VISIBLE
        }
    }
}

@BindingAdapter("check_visible")
fun bindCheckVisible(iv: ImageView, checkVisible: Boolean) {
    if(checkVisible) {
       iv.visibility = View.VISIBLE
    } else {
        iv.visibility = View.GONE
    }
}

@BindingAdapter("text_visible")
fun bindAnswerVisible(tv: TextView, textVisible: String?) {
    if(!textVisible.isNullOrEmpty()) {
        tv.text = textVisible
        tv.visibility = View.VISIBLE
    } else {
        tv.visibility = View.GONE
    }
}

@BindingAdapter("html_text")
fun bindHtmlText(tv: TextView, htmlText: String?) {
    if(!htmlText.isNullOrEmpty()) {
        tv.text = CommonUtils.fromHtml(htmlText)
        tv.visibility = View.VISIBLE
    } else {
        tv.visibility = View.GONE
    }
}

@BindingAdapter("check_answer")
fun bindCheckAnswer(btn: AppCompatButton, userCheck: Boolean?) {
    if(userCheck != null) {
        btn.isSelected = userCheck
    }
}

@BindingAdapter("img_file")
fun bindImgFile(iv: ImageView, imgFile: String?) {
    if(!imgFile.isNullOrEmpty()) {
        val file = File(iv.context.filesDir, "answer/$imgFile")
        Glide.with(iv.context).load(file).placeholder(R.drawable.error_profile).into(iv)
        iv.visibility = View.VISIBLE

    } else {
        iv.visibility = View.GONE
    }
}

@BindingAdapter("android:visibility")
fun setVisibility(view: View, value: Boolean) {
    view.visibility = if (value) View.GONE else View.VISIBLE
}