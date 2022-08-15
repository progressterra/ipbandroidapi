package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.verification

import com.google.gson.annotations.SerializedName

data class VerificationEndResponseData(
    @SerializedName("idDevice") val idDevice: String
)
