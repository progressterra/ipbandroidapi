package com.progressterra.ipbandroidapi.api.imessenger.model

import com.google.gson.annotations.SerializedName

//TODO how to use??
data class AdditionalDataJSON(
    @SerializedName("IDEnterprise")
    val IDEnterprise: String,
    @SerializedName("URLImage")
    val URLImage: String
)