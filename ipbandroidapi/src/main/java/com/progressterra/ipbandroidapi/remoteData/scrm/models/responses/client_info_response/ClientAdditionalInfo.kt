package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.client_info_response

import com.google.gson.annotations.SerializedName

internal data class ClientAdditionalInfo(
    @SerializedName("additionalInfo")
    val additionalInfo: String? = "",
    @SerializedName("statusCompletion")
    val statusCompletion: Int? = null,
    @SerializedName("eMailGeneral")
    val eMailGeneral: String? = "",
    @SerializedName("phoneGeneral")
    val phoneGeneral: String? = ""
)