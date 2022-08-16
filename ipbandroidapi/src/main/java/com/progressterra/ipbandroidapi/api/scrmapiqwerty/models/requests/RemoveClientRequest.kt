package com.progressterra.ipbandroidapi.api.scrmapiqwerty.models.requests

import com.google.gson.annotations.SerializedName

data class RemoveClientRequest(
    @SerializedName("accessToken") val accessToken: String,
    @SerializedName("verifiedCode") val verifiedCode: String
)