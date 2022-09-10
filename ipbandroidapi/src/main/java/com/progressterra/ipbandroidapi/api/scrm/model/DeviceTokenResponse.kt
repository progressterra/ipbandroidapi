package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.BaseResult

internal data class DeviceTokenResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
)
