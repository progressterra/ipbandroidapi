package com.progressterra.ipbandroidapi.api.imessengercore.models


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

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