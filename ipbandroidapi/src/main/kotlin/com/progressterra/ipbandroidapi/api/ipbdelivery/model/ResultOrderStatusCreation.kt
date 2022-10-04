package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class ResultOrderStatusCreation(
    @SerializedName("data")
    val deliveryInfo: OrderInfoRaw?
) : BaseResponse()