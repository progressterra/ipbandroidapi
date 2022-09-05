package com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.payment

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class SendCardDataResponse(
    @SerializedName("paymentOrderResponse")
    val data: PaymentData?
) : BaseResponse()

data class PaymentData(
    @SerializedName("acsUrl")
    val acsUrl: String? = null,
    @SerializedName("error")
    val error: String? = null,
    @SerializedName("errorCode")
    val errorCode: String? = null,
    @SerializedName("errorMessage")
    val errorMessage: String? = null,
    @SerializedName("info")
    val info: String? = null,
    @SerializedName("paReq")
    val paReq: String? = null,
    @SerializedName("redirect")
    val redirect: String? = null,
    @SerializedName("termUrl")
    val termUrl: String? = null
)