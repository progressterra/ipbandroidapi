package com.progressterra.ipbandroidapi.api.scrm.models.email

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.scrm.models.BaseResult

data class EmailResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
)