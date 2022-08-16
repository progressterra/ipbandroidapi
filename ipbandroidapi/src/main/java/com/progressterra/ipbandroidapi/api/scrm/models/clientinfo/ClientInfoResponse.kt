package com.progressterra.ipbandroidapi.api.scrm.models.clientinfo

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.scrm.models.BaseResult

data class ClientInfoResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val data: ClientInfoResponseData,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
) {
    data class ClientInfoResponseData(
        @SerializedName("client") val clientInfo: ClientInfoModel,
        @SerializedName("clientAdditionalInfo") val clientAdditionalInfo: ClientAdditionalInfoModel
    )
}
