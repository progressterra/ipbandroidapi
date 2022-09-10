package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

internal data class ClientAdditionalRaw(
    @SerializedName("additionalInfo")
    val additionalInfo: String?,
    @SerializedName("statusCompletion")
    val statusCompletion: Int,
    @SerializedName("eMailGeneral")
    val eMailGeneral: String?,
    @SerializedName("phoneGeneral")
    val phoneGeneral: String?
)