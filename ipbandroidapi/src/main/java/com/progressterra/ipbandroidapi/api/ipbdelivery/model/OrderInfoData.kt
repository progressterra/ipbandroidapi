package com.progressterra.ipbandroidapi.api.ipbdelivery.model


data class OrderInfoData(
    val error: String,
    val order: OrderData,
    val status: String
) {

    constructor(data: OrderInfoRaw?) : this(
        data?.error ?: "",
        OrderData(data?.order),
        data?.status ?: ""
    )
}