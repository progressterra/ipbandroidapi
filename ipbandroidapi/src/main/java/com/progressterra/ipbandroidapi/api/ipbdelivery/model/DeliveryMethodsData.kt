package com.progressterra.ipbandroidapi.api.ipbdelivery.model

data class DeliveryMethodsData(
    val dhPickupPointData: DhPickupPointData,
    val rdDeliveryTime: String,
    val rdDestinationPoint: String,
    val rdPrice: Double,
    val rfDeliveryType: String
) {

    internal constructor(data: DeliveryMethodsRaw?) : this(
        DhPickupPointData(data?.dhPickupPointInfo),
        data?.rdDeliveryTime ?: "",
        data?.rdDestinationPoint ?: "",
        data?.rdPrice ?: 0.0,
        data?.rfDeliveryType ?: ""
    )
}