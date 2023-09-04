package com.progressterra.ipbandroidapi.api.legacyscrm.model

import com.google.gson.annotations.SerializedName

data class IncomeDataCreateAccessToken (

    @SerializedName("idDevice")
    val idDevice: String? = null,

    @SerializedName("latitude")
    val latitude: Float? = null,

    @SerializedName("longitude")
    val longitude: Float? = null
)

