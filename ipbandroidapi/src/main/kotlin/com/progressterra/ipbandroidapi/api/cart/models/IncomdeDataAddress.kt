package com.progressterra.ipbandroidapi.api.cart.models

import com.google.gson.annotations.SerializedName

data class IncomdeDataAddress(
    @SerializedName("addressString") val addressString: String? = null,
    @SerializedName("idAddress") val idAddress: String? = null,
)
