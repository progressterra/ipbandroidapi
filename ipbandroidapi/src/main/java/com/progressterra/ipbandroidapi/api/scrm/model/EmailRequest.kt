package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

/**
 * API model
 */
data class EmailRequest(
    @SerializedName("email") val email: String
)
