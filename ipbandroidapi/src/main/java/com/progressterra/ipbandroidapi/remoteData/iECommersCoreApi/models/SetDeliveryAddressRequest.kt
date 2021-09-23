package com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models

import com.google.gson.annotations.SerializedName

data class SetDeliveryAddressRequest(
    @SerializedName("accessToken") val accessToken: String,
    @SerializedName("idAddress") val idAddress: String,
    @SerializedName("adressString") val addressString: String
)