package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

internal data class SetDeliveryAddressRequest(
    @SerializedName("accessToken") val accessToken: String,
    @SerializedName("idAddress") val idAddress: String,
    @SerializedName("adressString") val addressString: String
)