package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.clientinfo

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.scrm.models.BaseResult

data class ClientInfoReponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val data: ClientInfoResponseData,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
)
