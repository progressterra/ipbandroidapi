package com.progressterra.ipbandroidapi.api.ipbmediadata.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.checklist.model.ResultOperation

data class DataMediaDataResultDataList(
    @SerializedName("result") val result: ResultOperation?,
    @SerializedName("dataList") val dataList: List<DataMediaData>?,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int?
)
