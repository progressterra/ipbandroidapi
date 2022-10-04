package com.progressterra.ipbandroidapi.api.email.model

import com.google.gson.annotations.SerializedName

internal data class ConfirmEmailRequest(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("email")
    val email: String
)