package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.BaseResult

/**
 * API model
 */
data class ClientInfoResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val data: Data,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
) {
    data class Data(
        @SerializedName("client") val client: ClientRaw,
        @SerializedName("clientAdditionalInfo") val clientAdditional: ClientAdditionalRaw
    )
}
