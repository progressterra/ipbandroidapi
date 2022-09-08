package com.progressterra.ipbandroidapi.api.imessenger.model

import com.google.gson.annotations.SerializedName

data class DialogInfoRaw(
    @SerializedName("idEnterprise")
    val idEnterprise: String,
    @SerializedName("idUnique")
    val idUnique: String,
    @SerializedName("dateCreate")
    val dateCreate: String,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("additionalDataJSON")
    val additionalDataJSON: String? = null,
    @SerializedName("additionalData")
    val additionalData: String? = null
)