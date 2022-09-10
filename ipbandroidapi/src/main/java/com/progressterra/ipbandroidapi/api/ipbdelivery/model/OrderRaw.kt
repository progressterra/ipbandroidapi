package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName

internal data class OrderRaw(
    @SerializedName("rdAddress")
    val rdAddress: String?,
    @SerializedName("rdCustomerName")
    val rdCustomerName: String?,
    @SerializedName("rdCustomerPhone")
    val rdCustomerPhone: String?,
    @SerializedName("rdDateDelivery")
    val rdDateDelivery: String?,
    @SerializedName("rdFrom")
    val rdFrom: String?,
    @SerializedName("rdOrderId")
    val rdOrderId: String?,
    @SerializedName("rdTo")
    val rdTo: String?,
    @SerializedName("rdWeight")
    val rdWeight: Double?,
    @SerializedName("rfDeliveryMethod")
    val rfDeliveryMethod: String?,
    @SerializedName("rfDeliveryService")
    val rfDeliveryService: String?
)