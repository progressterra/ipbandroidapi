package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName

data class ErrorMessage(

    @SerializedName("message")
    val message: String? = null
)