package com.progressterra.ipbandroidapi.api.filter.models

import com.google.gson.annotations.SerializedName

data class FilterColor(
    @SerializedName("url")
    val url: String?,
    @SerializedName("hexCode")
    val hexCode: String?,
    @SerializedName("colorName")
    val colorName: String?
)