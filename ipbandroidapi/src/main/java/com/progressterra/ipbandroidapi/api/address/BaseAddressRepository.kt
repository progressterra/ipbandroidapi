package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.address.model.AddressData
import com.progressterra.ipbandroidapi.api.address.model.AddressRaw
import com.progressterra.ipbandroidapi.api.address.model.AddressesData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseAddressRepository(
    private val cloudDataSource: AddressCloudDataSource
) : AddressRepository, AbstractRepository() {

    override suspend fun getAddressList(accessToken: String): Result<AddressesData> = handle {
        val response = cloudDataSource.getAddressList(accessToken)
        if (response.result?.status != 0)
            throw BadRequestException()
        response
    }.map { AddressesData(it.addressInfo) }

    override suspend fun setClientAddress(
        accessToken: String,
        addressData: AddressData
    ): Result<Unit> = handle {
        val response = cloudDataSource.setClientAddress(accessToken, AddressRaw(addressData))
        if (response.result?.status != 0)
            throw BadRequestException()
    }
}