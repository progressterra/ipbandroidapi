package com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class DialogInfoResponse(
    @SerializedName("data")
    val dialogInfo: DialogInfo,
) : BaseResponse()

data class DialogInfo(
    @SerializedName("dateCreate")
    val dateCreate: String,
    @SerializedName("description")
    val description: String?,
    @SerializedName("idEnterprise")
    val idEnterprise: String,
    @SerializedName("idUnique")
    val idUnique: String,
    @SerializedName("additionalDataJSON")
    val additionalDataJSON: String?,
    @SerializedName("additionalData")
    val additionalData: String?
)