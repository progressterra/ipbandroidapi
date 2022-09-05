package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

/**
 * API model
 */
data class ClientAdditionalInfoModel(
    @SerializedName("additionalInfo")
    val additionalInfo: String?,
    @SerializedName("statusCompletion")
    val statusCompletion: Int,
    @SerializedName("eMailGeneral")
    val eMailGeneral: String?,
    @SerializedName("phoneGeneral")
    val phoneGeneral: String?
) {

    fun toClientAdditionalData(): ClientAdditionalData = ClientAdditionalData(
        additionalInfo ?: "",
        statusCompletion,
        eMailGeneral ?: "",
        phoneGeneral ?: ""
    )
}