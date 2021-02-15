package com.nsdevil.ubtmobilev3.data.response

data class AllOrgResponse(
    val content: List<Content>,
    val page: Int,
    val size: Int,
    val totalElements: Int,
    val totalPages: Int,
    val last: Boolean
) {
    data class Content(
        val organizUrl: String,
        val organizName: String,
        val organizPort: String,
        val organizLogo: String,
        val organizId: Int,
        val phone: String,
        val coverImage: String,
        val isMy: Boolean,
        val description: String,
        val organizType: String
    )
}