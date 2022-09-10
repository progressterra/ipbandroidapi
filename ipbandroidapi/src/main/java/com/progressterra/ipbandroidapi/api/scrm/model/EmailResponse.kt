package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.BaseResult

internal data class EmailResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
)