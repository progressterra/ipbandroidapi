package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.client_info_response

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.ClientAdditionalInfo

data class ClientAdditionalModel(
    @SerializedName("additionalInfo")
    val additionalInfo: String? = "",
    @SerializedName("statusCompletion")
    val statusCompletion: Int? = null,
    @SerializedName("eMailGeneral")
    val eMailGeneral: String? = "",
    @SerializedName("phoneGeneral")
    val phoneGeneral: String? = ""
) {
    fun convertToClientAdditionalInfo(): ClientAdditionalInfo = ClientAdditionalInfo(
        additionalInfo = additionalInfo ?: "",
        statusCompletion = statusCompletion ?: -1,
        emailGeneral = eMailGeneral ?: "",
        phoneGeneral = phoneGeneral ?: ""
    )
}