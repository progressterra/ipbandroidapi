package com.progressterra.ipbandroidapi.api.ipbmediadata.model

import com.google.gson.annotations.SerializedName

internal data class MediaRaw(
        @SerializedName("alias")
        val alias: String?,
        @SerializedName("contentType")
        val contentType: Int?,
        @SerializedName("dataJSON")
        val dataJSON: String?,
        @SerializedName("dateEvent")
        val dateEvent: String?,
        @SerializedName("idUnique")
        val idUnique: String?,
        @SerializedName("order")
        val order: Int?,
        @SerializedName("previewText")
        val previewText: String?,
        @SerializedName("size")
        val size: Int?,
        @SerializedName("stringData")
        val stringData: String?,
        @SerializedName("tag")
        val tag: Int?,
        @SerializedName("urlData")
        val urlData: String?
)