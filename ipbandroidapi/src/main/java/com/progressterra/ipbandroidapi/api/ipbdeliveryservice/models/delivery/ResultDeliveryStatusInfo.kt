package com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.delivery

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

data class ResultDeliveryStatusInfo(
    @SerializedName("data") val data: OrderStatusInfo? = null
) : BaseResponse()