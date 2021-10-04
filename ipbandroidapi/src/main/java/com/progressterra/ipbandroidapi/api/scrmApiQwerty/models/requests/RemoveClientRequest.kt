package com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests

import com.google.gson.annotations.SerializedName

data class RemoveClientRequest(
    @SerializedName("accessToken") val accessToken: String,
    @SerializedName("verifiedCode") val verifiedCode: String
)