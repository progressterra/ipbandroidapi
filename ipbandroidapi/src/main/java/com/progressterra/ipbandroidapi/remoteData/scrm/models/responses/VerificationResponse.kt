package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse

// Тоже пока не используется, переделан будет
internal data class VerificationResponse(
    @SerializedName("result")
    val result: ResultResponse? = null,
    @SerializedName("tokenIncome")
    val tokenIncome: String? = null,
    @SerializedName("accessToken")
    val accessToken: String? = null
)
