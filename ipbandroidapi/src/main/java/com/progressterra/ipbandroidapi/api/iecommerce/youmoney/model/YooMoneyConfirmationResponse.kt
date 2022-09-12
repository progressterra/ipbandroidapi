package com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class YooMoneyConfirmationResponse(
    @SerializedName("data")
    val dataResultPayment: Data?,
) : BaseResponse() {

    data class Data(
        @SerializedName("confirmation")
        val confirmation: ConfirmationRaw?,
        @SerializedName("userMessage")
        val userMessage: String?
    )
}



