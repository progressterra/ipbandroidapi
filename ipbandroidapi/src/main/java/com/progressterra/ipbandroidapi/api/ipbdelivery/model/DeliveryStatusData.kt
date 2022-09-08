package com.progressterra.ipbandroidapi.api.ipbdelivery.model

data class DeliveryStatusData(
    val rdCreationDate: String,
    val rdStatusDate: String,
    val rdDeliveryDate: String,
    val rfDeliveryService: String,
    val rfOrderStatusDescription: String,
    val rdNumberPosition: Int,
    val rdAddress: String,
    val rdOrderNumber: String,
    val rdAmount: Double,
    val rfOrderStatus: String
) {

    constructor(data: ResultDeliveryStatusInfo.Data?) : this(
        data?.rdCreationDate ?: "",
        data?.rdStatusDate ?: "",
        data?.rdDeliveryDate ?: "",
        data?.rfDeliveryService ?: "",
        data?.rfOrderStatusDescription ?: "",
        data?.rdNumberPosition ?: 0,
        data?.rdAddress ?: "",
        data?.rdOrderNumber ?: "",
        data?.rdAmount ?: 0.0,
        data?.rfOrderStatus ?: ""
    )
}
