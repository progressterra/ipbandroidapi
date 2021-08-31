package com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class CreateDialogResponse(
    @SerializedName("data")
    val data: CreateDialogData? = null,
) : BaseResponse()


data class CreateDialogData(
    @SerializedName("dateCreate")
    val dateCreate: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,
    @SerializedName("idUnique")
    val idUnique: String? = null
)