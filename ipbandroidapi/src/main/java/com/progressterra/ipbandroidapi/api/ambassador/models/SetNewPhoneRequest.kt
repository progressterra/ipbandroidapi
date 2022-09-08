package com.progressterra.ipbandroidapi.api.ambassador.models

import com.google.gson.annotations.SerializedName

data class SetNewPhoneRequest(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("verifiedChannelCode")
    val verifiedChannelCode: String
)