package com.nsdevil.ubtmobilev3.dialog

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.databinding.DialogSignPadBinding
import com.nsdevil.ubtmobilev3.utilities.CommonUtils.userExam
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class SignPadDialog (context: Context) : AlertDialog(context, R.style.AlertDialogLightX) {

    private lateinit var binding: DialogSignPadBinding

    private val signFile get() =  File(context.getExternalFilesDir(null), String.format("sign_%s.png",userExam.examCode))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogSignPadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getLoadBitMap()
        subscribeUi()
    }

    private fun subscribeUi() {
        binding.apply {
            btnDelete.setOnClickListener {
                signPad.clear()
            }

            btnConfirm.setOnClickListener {
                if(signPad.isEmpty()) {
                    Toast.makeText(context, "Please Sign.", Toast.LENGTH_SHORT).show()
                } else {
                    saveBitmap(signPad.getSignatureBitmap())
                }
            }
        }
    }

    private fun getLoadBitMap() {
        if(signFile.exists() && signFile.length() > 1) {
            try {
                val bitmap = BitmapFactory.decodeFile(signFile.absolutePath)
                binding.signPad.setSignatureBitmap(bitmap)
            } catch (ex: Exception) {
                println("사진 에러: " + ex.message)
            }
        }
    }

    private fun saveBitmap(bitmap: Bitmap) {

        try {
            FileOutputStream(signFile).use { out ->
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
            }
            dismiss()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}