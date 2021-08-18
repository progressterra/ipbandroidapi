package com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class DialogInfoResponse(
    @SerializedName("data")
    val dialogInfo: DialogInfo? = null,
) : BaseResponse()

data class DialogInfo(
    @SerializedName("dateCreate")
    val dateCreate: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,
    @SerializedName("idUnique")
    val idUnique: String? = null,
    @SerializedName("additionalDataJSON")
    val additionalDataJSON: String? = null,
    @SerializedName("additionalData")
    val additionalData: String? = null
)