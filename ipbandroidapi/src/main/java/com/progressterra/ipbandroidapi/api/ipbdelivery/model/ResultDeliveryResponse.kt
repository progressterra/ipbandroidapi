package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class ResultDeliveryResponse(
    @SerializedName("dataList")
    val deliveryInfoList: List<DeliveryRaw>?,
) : BaseResponse()