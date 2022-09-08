package com.progressterra.ipbandroidapi.api.ipbdelivery.model

data class MetroStationsData(
    val rdLatitude: Double,
    val rdLineName: String,
    val rdLongtitude: Double,
    val rdStationName: String
) {

    constructor(data: MetroStationsResponse.Data) : this(
        data.rdLatitude ?: 0.0,
        data.rdLineName ?: "",
        data.rdLongtitude ?: 0.0,
        data.rdStationName ?: ""
    )
}
