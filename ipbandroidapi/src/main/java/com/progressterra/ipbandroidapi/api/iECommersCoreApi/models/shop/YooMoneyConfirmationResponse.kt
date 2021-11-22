package com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.shop


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class YooMoneyConfirmationResponse(
    @SerializedName("data")
    val dataResultPayment: DataResultPayment? = null,
) : BaseResponse()

data class DataResultPayment(
    @SerializedName("confirmation")
    val confirmation: Confirmation? = null,
    @SerializedName("userMessage")
    val userMessage: String? = null
)

data class Confirmation(
    @SerializedName("confirmation_url")
    val confirmationUrl: String? = null,
    @SerializedName("type")
    val type: String? = null
)