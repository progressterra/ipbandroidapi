package com.progressterra.ipbandroidapi.api.ipbmediadata.models


import com.google.gson.annotations.SerializedName

data class MediaRaw(
        @SerializedName("alias")
        val alias: String? = null,
        @SerializedName("contentType")
        val contentType: Int? = null,
        @SerializedName("dataJSON")
        val dataJSON: String? = null,
        @SerializedName("dateEvent")
        val dateEvent: String? = null,
        @SerializedName("idUnique")
        val idUnique: String? = null,
        @SerializedName("order")
        val order: Int? = null,
        @SerializedName("previewText")
        val previewText: String? = null,
        @SerializedName("size")
        val size: Int? = null,
        @SerializedName("stringData")
        val stringData: String? = null,
        @SerializedName("tag")
        val tag: Int? = null,
        @SerializedName("urlData")
        val urlData: String? = null
)