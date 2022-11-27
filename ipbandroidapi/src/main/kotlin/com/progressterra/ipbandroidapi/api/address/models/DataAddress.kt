package com.progressterra.ipbandroidapi.api.address.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param defaultShippingAddress 
 * @param defaultBillingAddress 
 * @param listAddAddress 
 */
data class DataAddress (

    @SerializedName("defaultShippingAddress")
    val defaultShippingAddress: RGAddress? = null,

    @SerializedName("defaultBillingAddress")
    val defaultBillingAddress: RGAddress? = null,

    @SerializedName("listAddAddress")
    val listAddAddress: List<RGAddress>? = null
)