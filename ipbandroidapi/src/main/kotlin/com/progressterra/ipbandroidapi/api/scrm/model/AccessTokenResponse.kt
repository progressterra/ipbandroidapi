package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.BaseResult

internal data class AccessTokenResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val data: String,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
)
