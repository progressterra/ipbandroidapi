package com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ResultDeliveryList(
    @SerializedName("data")
    val deliveryInfoList: List<DeliveryMethods>? = null,
) : BaseResponse() {

    data class DeliveryMethods(
        @SerializedName("dhPickupPointInfo")
        val dhPickupPointInfo: DhPickupPointInfo? = null,
        @SerializedName("rdDeliveryTime")
        val rdDeliveryTime: String? = null,
        @SerializedName("rdDestinationPoint")
        val rdDestinationPoint: String? = null,
        @SerializedName("rdPrice")
        val rdPrice: Double? = null,
        @SerializedName("rfDeliveryType")
        val rfDeliveryType: String? = null
    )

    data class DhPickupPointInfo(
        @SerializedName("drrdAddress")
        val drrdAddress: String? = null,
        @SerializedName("drrdSite")
        val drrdSite: String? = null,
        @SerializedName("drrdWorkHour")
        val drrdWorkHour: String? = null,
        @SerializedName("drrfLatitude")
        val drrfLatitude: Double? = null,
        @SerializedName("drrfLongitude")
        val drrfLongitude: Double? = null,
        @SerializedName("drrfPickupPointCode")
        val drrfPickupPointCode: String? = null,
        @SerializedName("drrfType")
        val drrfType: String? = null,
        @SerializedName("drrfPaymentAvaliable")
        val drrfPaymentAvaliable: Int? = null,
        @SerializedName("drrdDressingRoom")
        val drrdDressingRoom: Boolean? = null,
        @SerializedName("drrdCanTake")
        val drrdCanTake: Boolean? = null,
        @SerializedName("drrdWhereIs")
        val drrdWhereIs: String? = null,
        @SerializedName("drrdMetroStation")
        val drrdMetroStation: String? = null
    )
}