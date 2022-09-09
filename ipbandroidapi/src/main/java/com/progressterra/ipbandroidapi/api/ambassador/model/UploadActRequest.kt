package com.progressterra.ipbandroidapi.api.ambassador.model

import com.google.gson.annotations.SerializedName

data class UploadActRequest(
    @SerializedName("iddh")
    val iddh: String,
    @SerializedName("urlImageAct")
    val urlImageAct: String
)