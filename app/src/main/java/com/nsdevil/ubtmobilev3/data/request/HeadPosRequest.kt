package com.nsdevil.ubtmobilev3.data.request

data class HeadPosRequest (
    val examId: Int,
    val examCode: String,
    val variant: String,
    val aiData: List<List<String>>
)
