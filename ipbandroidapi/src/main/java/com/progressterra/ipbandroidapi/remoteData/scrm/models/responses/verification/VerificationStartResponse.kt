package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.verification

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.scrm.models.BaseResult

data class VerificationStartResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
)