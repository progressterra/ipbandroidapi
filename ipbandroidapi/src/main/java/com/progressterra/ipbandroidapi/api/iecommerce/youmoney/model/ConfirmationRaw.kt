package com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model

import com.google.gson.annotations.SerializedName

internal data class ConfirmationRaw(
    @SerializedName("confirmation_url")
    val confirmationUrl: String?,
    @SerializedName("type")
    val type: String?
)