package com.progressterra.ipbandroidapi.api.ipbdelivery.model


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class MetroStationsResponse(
    @SerializedName("dataList")
    val metroDataList: List<Data>? = null
) : BaseResponse() {

    data class Data(
        @SerializedName("rdLatitude")
        val rdLatitude: Double? = null,
        @SerializedName("rdLineName")
        val rdLineName: String? = null,
        @SerializedName("rdLongtitude")
        val rdLongtitude: Double? = null,
        @SerializedName("rdStationName")
        val rdStationName: String? = null
    )
}