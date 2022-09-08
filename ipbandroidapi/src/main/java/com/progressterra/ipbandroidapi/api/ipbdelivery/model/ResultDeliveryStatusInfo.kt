package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class ResultDeliveryStatusInfo(
    @SerializedName("data") val data: Data? = null
) : BaseResponse() {

    data class Data(
        @SerializedName("rdCreationDate")
        val rdCreationDate: String? = null,
        @SerializedName("rdStatusDate")
        val rdStatusDate: String? = null,
        @SerializedName("rdDeliveryDate")
        val rdDeliveryDate: String? = null,
        @SerializedName("rfDeliveryService")
        val rfDeliveryService: String? = null,
        @SerializedName("rfOrderStatusDescription")
        val rfOrderStatusDescription: String? = null,
        @SerializedName("rdNumberPosition")
        val rdNumberPosition: Int? = null,
        @SerializedName("rdAddress")
        val rdAddress: String? = null,
        @SerializedName("rdOrderNumber")
        val rdOrderNumber: String? = null,
        @SerializedName("rdAmount")
        val rdAmount: Double? = null,
        @SerializedName("rfOrderStatus")
        val rfOrderStatus: String? = null
    )
}