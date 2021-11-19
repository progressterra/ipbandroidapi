package com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.payment


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class RegisterOrderResponse(
    @SerializedName("errorCode")
    val errorCode: String?,
    @SerializedName("errorMessage")
    val errorMessage: String?,
    @SerializedName("orderId")
    val orderId: String?,
    @SerializedName("formUrl")
    val formUrl: String?
) : BaseResponse()