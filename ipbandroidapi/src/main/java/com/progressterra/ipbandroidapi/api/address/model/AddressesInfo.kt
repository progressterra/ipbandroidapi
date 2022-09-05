package com.progressterra.ipbandroidapi.api.address.model

/**
* Data model
 */
data class AddressesInfo(
    val defaultBillingAddress: AddressInfo,
    val defaultShippingAddress: AddressInfo,
    val listAddress: List<AddressInfo>
)
