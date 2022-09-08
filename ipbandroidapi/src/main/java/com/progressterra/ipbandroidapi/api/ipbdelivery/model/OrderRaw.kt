package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName

data class OrderRaw(
    @SerializedName("rdAddress")
    val rdAddress: String? = null,
    @SerializedName("rdCustomerName")
    val rdCustomerName: String? = null,
    @SerializedName("rdCustomerPhone")
    val rdCustomerPhone: String? = null,
    @SerializedName("rdDateDelivery")
    val rdDateDelivery: String? = null,
    @SerializedName("rdFrom")
    val rdFrom: String? = null,
    @SerializedName("rdOrderId")
    val rdOrderId: String? = null,
    @SerializedName("rdTo")
    val rdTo: String? = null,
    @SerializedName("rdWeight")
    val rdWeight: Double? = null,
    @SerializedName("rfDeliveryMethod")
    val rfDeliveryMethod: String? = null,
    @SerializedName("rfDeliveryService")
    val rfDeliveryService: String? = null
)