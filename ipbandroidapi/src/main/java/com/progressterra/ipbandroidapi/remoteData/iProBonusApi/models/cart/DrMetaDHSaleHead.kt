package com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart


import com.google.gson.annotations.SerializedName

data class DrMetaDHSaleHead(
    @SerializedName("idUnique")
    val idUnique: String? = null,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,
    @SerializedName("key")
    val key: String? = null,
    @SerializedName("value")
    val value: String? = null
)