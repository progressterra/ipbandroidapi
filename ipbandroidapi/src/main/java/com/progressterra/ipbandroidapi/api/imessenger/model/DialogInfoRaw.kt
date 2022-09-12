package com.progressterra.ipbandroidapi.api.imessenger.model

import com.google.gson.annotations.SerializedName

internal data class DialogInfoRaw(
    @SerializedName("idEnterprise")
    val idEnterprise: String,
    @SerializedName("idUnique")
    val idUnique: String,
    @SerializedName("dateCreate")
    val dateCreate: String,
    @SerializedName("description")
    val description: String?,
    @SerializedName("additionalDataJSON")
    val additionalDataJSON: String?,
    @SerializedName("additionalData")
    val additionalData: String?
)