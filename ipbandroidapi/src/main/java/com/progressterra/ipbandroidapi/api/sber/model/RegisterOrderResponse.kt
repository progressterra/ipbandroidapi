package com.progressterra.ipbandroidapi.api.sber.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class RegisterOrderResponse(
    @SerializedName("errorCode")
    val errorCode: String? = null,
    @SerializedName("errorMessage")
    val errorMessage: String? = null,
    @SerializedName("orderId")
    val orderId: String? = null,
    @SerializedName("formUrl")
    val formUrl: String? = null
) : BaseResponse()