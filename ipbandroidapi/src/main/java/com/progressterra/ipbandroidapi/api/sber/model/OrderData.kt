package com.progressterra.ipbandroidapi.api.sber.model

data class OrderData(
    val errorCode: String,
    val errorMessage: String,
    val orderId: String,
    val formUrl: String
) {

    internal constructor(data: RegisterOrderResponse) : this(
        data.errorCode ?: "",
        data.errorMessage ?: "",
        data.orderId ?: "",
        data.formUrl ?: ""
    )
}