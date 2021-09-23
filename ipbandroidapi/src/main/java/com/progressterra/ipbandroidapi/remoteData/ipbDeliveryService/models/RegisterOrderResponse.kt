package com.progressterra.ipbandroidapi.remoteData.ipbDeliveryService.models


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class RegisterOrderResponse(
    @SerializedName("orderId")
    val orderId: String? = null
) : BaseResponse()