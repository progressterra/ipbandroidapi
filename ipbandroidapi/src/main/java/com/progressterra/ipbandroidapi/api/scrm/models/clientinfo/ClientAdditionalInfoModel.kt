package com.progressterra.ipbandroidapi.api.scrm.models.clientinfo

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.ClientAdditionalInfo

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
    fun convertToClientAdditionalInfo(): ClientAdditionalInfo = ClientAdditionalInfo(
        additionalInfo = additionalInfo ?: "",
        statusCompletion = statusCompletion ?: -1,
        emailGeneral = eMailGeneral ?: "",
        phoneGeneral = phoneGeneral ?: ""
    )
}