package com.progressterra.ipbandroidapi.api.scrm.models.responses.clientinfo

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.scrm.models.BaseResult

data class ClientInfoReponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val data: ClientInfoResponseData,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
) {
    data class ClientInfoResponseData(
        @SerializedName("client") val clientInfo: ClientInfoModel,
        @SerializedName("clientAdditionalInfo") val clientAdditionalInfo: ClientAdditionalInfoModel
    )
}
