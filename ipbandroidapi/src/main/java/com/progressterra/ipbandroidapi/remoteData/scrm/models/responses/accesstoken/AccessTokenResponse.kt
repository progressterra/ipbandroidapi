package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.accesstoken

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.scrm.models.BaseResult

data class AccessTokenResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val data: String,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
)
