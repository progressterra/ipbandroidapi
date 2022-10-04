package com.progressterra.ipbandroidapi.api.address.model

data class AddressesData(
    val defaultBillingAddress: AddressData,
    val defaultShippingAddress: AddressData,
    val listAddress: List<AddressData>
) {

    internal constructor(data: AddressesRaw?) : this(
        AddressData(data?.defaultBillingAddress),
        AddressData(data?.defaultShippingAddress),
        data?.listAddress?.map { AddressData(it) } ?: emptyList()
    )
}
