package com.progressterra.ipbandroidapi.api.sber.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class RegisterOrderResponse(
    @SerializedName("errorCode")
    val errorCode: String?,
    @SerializedName("errorMessage")
    val errorMessage: String?,
    @SerializedName("orderId")
    val orderId: String?,
    @SerializedName("formUrl")
    val formUrl: String?
) : BaseResponse()