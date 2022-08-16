package com.progressterra.ipbandroidapi.api.scrm.models.responses.verification

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.AbstractResponse
import com.progressterra.ipbandroidapi.api.scrm.models.BaseResult

data class VerificationEndResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val data: Data,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
) {

    data class Data(
        @SerializedName("idDevice") val idDevice: String
    )
}