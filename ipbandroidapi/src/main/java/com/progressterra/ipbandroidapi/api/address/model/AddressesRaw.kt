package com.progressterra.ipbandroidapi.api.address.model

import com.google.gson.annotations.SerializedName

/**
* API model
 */
internal data class AddressesRaw(
    @SerializedName("defaultBillingAddress")
    val defaultBillingAddress: AddressRaw?,
    @SerializedName("defaultShippingAddress")
    val defaultShippingAddress: AddressRaw?,
    @SerializedName("listAddAddress")
    val listAddress: List<AddressRaw>?
)