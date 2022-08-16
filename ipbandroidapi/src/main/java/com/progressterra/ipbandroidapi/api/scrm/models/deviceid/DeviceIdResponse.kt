package com.progressterra.ipbandroidapi.api.scrm.models.deviceid

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.scrm.models.BaseResult

data class DeviceIdResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val deviceId: String,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
)
