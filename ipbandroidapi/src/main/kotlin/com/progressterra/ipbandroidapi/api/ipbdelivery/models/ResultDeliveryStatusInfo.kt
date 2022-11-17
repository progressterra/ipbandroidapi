package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName

/**
 * статус заказа.
 *
 * @param result
 * @param data
 */
data class ResultDeliveryStatusInfo(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: OrderStatusInfo? = null
)