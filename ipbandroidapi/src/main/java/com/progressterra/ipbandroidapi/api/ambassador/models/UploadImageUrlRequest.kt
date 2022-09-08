package com.progressterra.ipbandroidapi.api.ambassador.models

import com.google.gson.annotations.SerializedName

data class UploadImageUrlRequest(
    @SerializedName("urlImage")
    val urlImage: String
)