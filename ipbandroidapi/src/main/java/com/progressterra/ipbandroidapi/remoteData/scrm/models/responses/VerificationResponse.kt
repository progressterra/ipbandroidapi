package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse


internal data class VerificationResponse(
    @SerializedName("tokenIncome")
    val tokenIncome: String? = null,
    @SerializedName("accessToken")
    val accessToken: String? = null
) : BaseResponse()
