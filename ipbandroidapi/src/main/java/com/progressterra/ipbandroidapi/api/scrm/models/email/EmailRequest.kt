package com.progressterra.ipbandroidapi.api.scrm.models.email

import com.google.gson.annotations.SerializedName

data class EmailRequest(
    @SerializedName("email") val email: String
)
