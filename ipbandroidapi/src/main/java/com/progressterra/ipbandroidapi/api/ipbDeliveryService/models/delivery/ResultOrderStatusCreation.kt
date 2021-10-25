package com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ResultOrderStatusCreation(
    @SerializedName("data")
    val deliveryInfo: DeliveryInfo? = null
) : BaseResponse() {
    data class DeliveryInfo(
        @SerializedName("error")
        val error: String? = null,
        @SerializedName("order")
        val order: Order? = null,
        @SerializedName("status")
        val status: String? = null
    )

    data class Order(
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
}