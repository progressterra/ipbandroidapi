package com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ResultDeliveryStatusInfo(
    @SerializedName("data") val data: OrderStatusInfo? = null
) : BaseResponse()