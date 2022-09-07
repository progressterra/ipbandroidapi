package com.progressterra.ipbandroidapi.api.address.model

/**
 * Data model
 */
data class AddressesData(
    val defaultBillingAddress: AddressData,
    val defaultShippingAddress: AddressData,
    val listAddress: List<AddressData>
) {

    constructor(data: AddressesRaw) : this(
        data.defaultBillingAddress?.let { AddressData(it) } ?: AddressData(),
        data.defaultShippingAddress?.let { AddressData(it) } ?: AddressData(),
        data.listAddress?.map { AddressData(it) } ?: emptyList()
    )
}
