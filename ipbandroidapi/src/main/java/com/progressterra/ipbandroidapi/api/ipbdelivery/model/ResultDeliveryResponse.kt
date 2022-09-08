package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class ResultDeliveryResponse(
    @SerializedName("dataList")
    val deliveryInfoList: List<DeliveryRaw>? = null,
) : BaseResponse()