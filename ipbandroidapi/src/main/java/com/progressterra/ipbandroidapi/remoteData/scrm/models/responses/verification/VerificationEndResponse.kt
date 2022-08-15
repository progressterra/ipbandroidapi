package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.verification

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.scrm.models.BaseResult

data class VerificationEndResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val data: VerificationEndResponseData,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
)
