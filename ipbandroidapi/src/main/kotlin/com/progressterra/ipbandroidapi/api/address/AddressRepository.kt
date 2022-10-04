package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.address.model.AddressData
import com.progressterra.ipbandroidapi.api.address.model.AddressesData

interface AddressRepository {

    suspend fun setClientAddress(
        accessToken: String,
        addressData: AddressData
    ): Result<Unit>

    suspend fun getAddressList(accessToken: String): Result<AddressesData>
}