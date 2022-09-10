package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.BaseResult

internal data class DeviceIdResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val deviceId: String,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
)
