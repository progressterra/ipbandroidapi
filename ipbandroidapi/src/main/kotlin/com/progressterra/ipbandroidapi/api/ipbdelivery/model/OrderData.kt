package com.progressterra.ipbandroidapi.api.ipbdelivery.model

data class OrderData(
    val rdAddress: String,
    val rdCustomerName: String,
    val rdCustomerPhone: String,
    val rdDateDelivery: String,
    val rdFrom: String,
    val rdOrderId: String,
    val rdTo: String,
    val rdWeight: Double,
    val rfDeliveryMethod: String,
    val rfDeliveryService: String
) {

    internal constructor(data: OrderRaw?) : this(
        data?.rdAddress ?: "",
        data?.rdCustomerName ?: "",
        data?.rdCustomerPhone ?: "",
        data?.rdDateDelivery ?: "",
        data?.rdFrom ?: "",
        data?.rdOrderId ?: "",
        data?.rdTo ?: "",
        data?.rdWeight ?: 0.0,
        data?.rfDeliveryMethod ?: "",
        data?.rfDeliveryService ?: ""
    )
}