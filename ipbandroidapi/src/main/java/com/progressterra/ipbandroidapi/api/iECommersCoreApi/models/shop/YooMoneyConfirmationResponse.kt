package com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.shop


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class YooMoneyConfirmationResponse(
    @SerializedName("data")
    val `data`: Data?,
) : BaseResponse()

data class Data(
    @SerializedName("confirmation")
    val confirmation: Confirmation?,
    @SerializedName("userMessage")
    val userMessage: String?
)

data class Confirmation(
    @SerializedName("confirmation_url")
    val confirmationUrl: String?,
    @SerializedName("type")
    val type: String?
)