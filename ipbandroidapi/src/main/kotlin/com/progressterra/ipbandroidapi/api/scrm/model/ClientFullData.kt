package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

data class ClientFullData (

    @SerializedName("client")
    val client: Clients? = null,

    @SerializedName("clientAdditionalInfo")
    val clientAdditionalInfo: ClietnsAddtionalInfo? = null
)

