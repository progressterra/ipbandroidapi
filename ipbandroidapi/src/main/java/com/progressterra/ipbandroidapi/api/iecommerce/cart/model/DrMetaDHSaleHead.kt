package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

internal data class DrMetaDHSaleHead(
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String?,
    @SerializedName("key")
    val key: String?,
    @SerializedName("value")
    val value: String?
)