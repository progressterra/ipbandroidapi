package com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.delivery


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ResultDeliveryList(
    @SerializedName("dataList")
    val deliveryInfoList: List<DeliveryInfo>? = null,
) : BaseResponse() {

    data class DeliveryInfo(
        @SerializedName("deliveryMethodsList")
        val deliveryMethodsList: List<DeliveryMethods>? = null,
        @SerializedName("deliveryServiceName")
        val deliveryServiceName: String? = null
    )

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
        val drrfType: String? = null
    )
}