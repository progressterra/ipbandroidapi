package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

/**
 * API model
 */
data class ClientAdditionalRaw(
    @SerializedName("additionalInfo")
    val additionalInfo: String?,
    @SerializedName("statusCompletion")
    val statusCompletion: Int,
    @SerializedName("eMailGeneral")
    val eMailGeneral: String?,
    @SerializedName("phoneGeneral")
    val phoneGeneral: String?
)