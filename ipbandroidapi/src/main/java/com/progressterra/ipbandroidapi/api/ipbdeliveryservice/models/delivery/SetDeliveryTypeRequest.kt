package com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.delivery

import com.google.gson.annotations.SerializedName

internal data class SetDeliveryTypeRequest(
    @SerializedName("rfMethodType")
    val rfMethodType: Int,
    @SerializedName("rfServiceType")
    val rfServiceType: Int,
    @SerializedName("rdPickUpPoint")
    val rdPickUpPoint: String? = null
)

enum class DeliveryMethodType(val type: Int) {
    COURIER(0),
    PVZ(1),
    POSTAMAT(2)
}

enum class ServiceMethodType(val type: Int) {
    IML(0)
}