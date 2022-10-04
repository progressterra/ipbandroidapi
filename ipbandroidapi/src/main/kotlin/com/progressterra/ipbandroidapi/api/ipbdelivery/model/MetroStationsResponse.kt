package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class MetroStationsResponse(
    @SerializedName("dataList")
    val metroDataList: List<Data>?
) : BaseResponse() {

    data class Data(
        @SerializedName("rdLatitude")
        val rdLatitude: Double?,
        @SerializedName("rdLineName")
        val rdLineName: String?,
        @SerializedName("rdLongtitude")
        val rdLongtitude: Double?,
        @SerializedName("rdStationName")
        val rdStationName: String?
    )
}