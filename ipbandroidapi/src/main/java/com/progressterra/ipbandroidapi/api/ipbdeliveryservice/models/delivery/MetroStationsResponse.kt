package com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.delivery


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

data class MetroStationsResponse(
    @SerializedName("dataList")
    val metroDataList: List<MetroData>? = null
) : BaseResponse()

data class MetroData(
    @SerializedName("rdLatitude")
    val rdLatitude: Double? = null,
    @SerializedName("rdLineName")
    val rdLineName: String? = null,
    @SerializedName("rdLongtitude")
    val rdLongtitude: Double? = null,
    @SerializedName("rdStationName")
    val rdStationName: String? = null
)