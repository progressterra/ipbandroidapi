package com.progressterra.ipbandroidapi.api.address.model

import com.google.gson.annotations.SerializedName

/**
* API model
 */
data class MainInfoAboutAddress(
    @SerializedName("defaultBillingAddress")
    val defaultBillingAddress: Address?,
    @SerializedName("defaultShippingAddress")
    val defaultShippingAddress: Address?,
    @SerializedName("listAddAddress")
    val listAddress: List<Address>?
)