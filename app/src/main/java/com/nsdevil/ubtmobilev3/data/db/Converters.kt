package com.nsdevil.ubtmobilev3.data.db

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.nsdevil.ubtmobilev3.data.response.QuestionResponse

class Converters {
    @TypeConverter
    fun mediaToJsonString(media: QuestionResponse.Result.Question.Data.MediaX): String = Gson().toJson(media)

    @TypeConverter
    fun stringToMedia(value: String?): QuestionResponse.Result.Question.Data.MediaX = Gson().fromJson(value, QuestionResponse.Result.Question.Data.MediaX::class.java)
}