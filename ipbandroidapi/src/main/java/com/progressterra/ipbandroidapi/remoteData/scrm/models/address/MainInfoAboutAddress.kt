package com.progressterra.ipbandroidapi.remoteData.scrm.models.address


import com.google.gson.annotations.SerializedName

data class MainInfoAboutAddress(
    @SerializedName("defaultBillingAddress")
    val defaultBillingAddress: Address?,
    @SerializedName("defaultShippingAddress")
    val defaultShippingAddress: Address?,
    @SerializedName("listAddAddress")
    val listAddress: List<Address>?
)