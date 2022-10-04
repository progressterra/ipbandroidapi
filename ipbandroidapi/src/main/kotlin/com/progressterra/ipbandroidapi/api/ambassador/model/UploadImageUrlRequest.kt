package com.progressterra.ipbandroidapi.api.ambassador.model

import com.google.gson.annotations.SerializedName

internal data class UploadImageUrlRequest(
    @SerializedName("urlImage")
    val urlImage: String
)