package com.progressterra.ipbandroidapi.api.sber.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class GetOrderStatusResponse(
    @SerializedName("orderStatus") val orderStatus: OrderStatus
) : BaseResponse()