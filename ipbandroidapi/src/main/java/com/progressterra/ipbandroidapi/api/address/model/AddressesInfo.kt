package com.progressterra.ipbandroidapi.api.address.model

/**
 * Data model
 */
data class AddressesInfo(
    val defaultBillingAddress: AddressInfo,
    val defaultShippingAddress: AddressInfo,
    val listAddress: List<AddressInfo>
) {

    constructor(data: MainInfoAboutAddress) : this(
        data.defaultBillingAddress?.let { AddressInfo(it) } ?: AddressInfo(),
        data.defaultShippingAddress?.let { AddressInfo(it) } ?: AddressInfo(),
        data.listAddress?.map { AddressInfo(it) } ?: emptyList()
    )
}
