package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.deviceid

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.scrm.models.BaseResult

data class DeviceIdResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val deviceId: String,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
)
