package com.progressterra.ipbandroidapi.api.ambassador.model

import com.google.gson.annotations.SerializedName

internal data class SetNewPhoneRequest(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("verifiedChannelCode")
    val verifiedChannelCode: String
)