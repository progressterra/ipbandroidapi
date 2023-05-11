package com.progressterra.ipbandroidapi.api.ipbmediadata.model

import com.google.gson.annotations.SerializedName

data class InfoImage(

    @SerializedName("url")
    val url: String? = null,

    @SerializedName("sizeType")
    val sizeType: String? = null,

    @SerializedName("width")
    val width: Int? = null,

    @SerializedName("height")
    val height: Int? = null,

    @SerializedName("size")
    val propertySize: Long? = null
)
