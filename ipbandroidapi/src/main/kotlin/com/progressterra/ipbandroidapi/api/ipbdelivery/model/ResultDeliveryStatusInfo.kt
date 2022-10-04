package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class ResultDeliveryStatusInfo(
    @SerializedName("data") val data: Data?
) : BaseResponse() {

    data class Data(
        @SerializedName("rdCreationDate")
        val rdCreationDate: String?,
        @SerializedName("rdStatusDate")
        val rdStatusDate: String?,
        @SerializedName("rdDeliveryDate")
        val rdDeliveryDate: String?,
        @SerializedName("rfDeliveryService")
        val rfDeliveryService: String?,
        @SerializedName("rfOrderStatusDescription")
        val rfOrderStatusDescription: String?,
        @SerializedName("rdNumberPosition")
        val rdNumberPosition: Int?,
        @SerializedName("rdAddress")
        val rdAddress: String?,
        @SerializedName("rdOrderNumber")
        val rdOrderNumber: String?,
        @SerializedName("rdAmount")
        val rdAmount: Double?,
        @SerializedName("rfOrderStatus")
        val rfOrderStatus: String?
    )
}