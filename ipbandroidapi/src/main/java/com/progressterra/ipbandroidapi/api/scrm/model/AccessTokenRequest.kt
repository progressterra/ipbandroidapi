package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

/**
 * API model
 */
data class AccessTokenRequest(
    @SerializedName("idDevice") val idDevice: String,
    @SerializedName("latitude") val latitude: Float,
    @SerializedName("longitude") val longitude: Float
)
