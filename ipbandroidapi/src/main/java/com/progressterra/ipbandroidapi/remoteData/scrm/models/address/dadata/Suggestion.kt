package com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata


import com.google.gson.annotations.SerializedName

data class Suggestion(
    @SerializedName("data")
    val data: Data? = null,
    @SerializedName("unrestricted_value")
    val unrestrictedValue: String? = null,
    @SerializedName("value")
    val value: String? = null
)