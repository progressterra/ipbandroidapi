package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.address.model.AddressData
import com.progressterra.ipbandroidapi.api.address.model.AddressRaw
import com.progressterra.ipbandroidapi.api.address.model.AddressesData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BaseAddressRepository(
    handleException: HandleException,
    private val service: AddressService
) : AddressRepository, AbstractRepository(handleException) {

    override suspend fun getAddressList(accessToken: String): Result<AddressesData> = handle {
        val response = service.getAddressList(accessToken)
        if (response.result?.status != 0)
            throw BadRequestException()
        response
    }.map { AddressesData(it.addressInfo) }

    override suspend fun setClientAddress(
        accessToken: String,
        addressData: AddressData
    ): Result<Unit> = handle {
        val response = service.setClientAddress(accessToken, AddressRaw(addressData))
        if (response.result?.status != 0)
            throw BadRequestException()
    }
}