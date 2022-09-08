package com.progressterra.ipbandroidapi.api.ambassador.models

import com.google.gson.annotations.SerializedName

data class UploadContractOfAmbassadorRequest(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("urlImage")
    val urlImage: String
)
