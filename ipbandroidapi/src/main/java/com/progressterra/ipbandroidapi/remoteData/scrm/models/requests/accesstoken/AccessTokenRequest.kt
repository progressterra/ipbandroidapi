package com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.accesstoken

import com.google.gson.annotations.SerializedName

data class AccessTokenRequest(
    @SerializedName("idDevice") val idDevice: String,
    @SerializedName("latitude") val latitude: Float,
    @SerializedName("longitude") val longitude: Float
)
