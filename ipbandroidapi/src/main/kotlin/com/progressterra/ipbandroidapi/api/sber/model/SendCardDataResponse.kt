package com.progressterra.ipbandroidapi.api.sber.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class SendCardDataResponse(
    @SerializedName("paymentOrderResponse")
    val data: Data
) : BaseResponse() {

    data class Data(
        @SerializedName("acsUrl")
        val acsUrl: String?,
        @SerializedName("error")
        val error: String?,
        @SerializedName("errorCode")
        val errorCode: String?,
        @SerializedName("errorMessage")
        val errorMessage: String?,
        @SerializedName("info")
        val info: String?,
        @SerializedName("paReq")
        val paReq: String?,
        @SerializedName("redirect")
        val redirect: String?,
        @SerializedName("termUrl")
        val termUrl: String?
    )
}