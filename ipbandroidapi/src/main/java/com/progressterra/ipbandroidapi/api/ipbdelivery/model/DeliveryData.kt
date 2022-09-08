package com.progressterra.ipbandroidapi.api.ipbdelivery.model

data class DeliveryData(
    val deliveryMethodsList: List<DeliveryMethodsData>,
    val deliveryServiceName: String
) {

    constructor(data: DeliveryRaw?) : this(
        data?.deliveryMethodsList?.map { DeliveryMethodsData(it) } ?: emptyList(),
        data?.deliveryServiceName ?: ""
    )
}

