package com.progressterra.ipbandroidapi.api.ipbmediadata.model

import com.google.gson.annotations.SerializedName

data class DataMediaData(
    @SerializedName("idUnique") val idUnique: String?,
    @SerializedName("dateEvent") val dateEvent: String?,
    @SerializedName("urlData") val urlData: String?,
    @SerializedName("alias") val alias: String?,
    @SerializedName("contentType") val contentType: Int?,
    @SerializedName("order") val order: Int?,
    @SerializedName("tag") val tag: Int?,
    @SerializedName("stringData") val stringData: String?,
    @SerializedName("dataJSON") val dataJSON: String?,
    @SerializedName("previewText") val previewText: String?,
    @SerializedName("size") val size: Int?
)
