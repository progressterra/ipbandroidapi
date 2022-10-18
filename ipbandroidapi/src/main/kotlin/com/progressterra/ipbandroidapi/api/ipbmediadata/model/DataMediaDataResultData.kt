package com.progressterra.ipbandroidapi.api.ipbmediadata.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.checklist.model.ResultOperation

data class DataMediaDataResultData(
    @SerializedName("result") val result: ResultOperation?,
    @SerializedName("data") val data: DataMediaData?,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int?
)
