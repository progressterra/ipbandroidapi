package com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.delivery

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class ResultDeliveryStatusInfo(
    @SerializedName("data") val data: OrderStatusInfo? = null
) : BaseResponse()