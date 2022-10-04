package com.progressterra.ipbandroidapi.api.ambassador.model

import com.google.gson.annotations.SerializedName

internal data class UploadContractOfAmbassadorRequest(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("urlImage")
    val urlImage: String
)
