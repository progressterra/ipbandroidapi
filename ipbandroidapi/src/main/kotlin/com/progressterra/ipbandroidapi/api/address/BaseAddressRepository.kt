package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.address.models.DataAddress
import com.progressterra.ipbandroidapi.api.address.models.RGAddress
import com.progressterra.ipbandroidapi.api.address.models.StatusResult
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseAddressRepository(
    private val service: AddressService
) : AddressRepository {

    override suspend fun uploadClientAddress(
        accessToken: String,
        request: RGAddress
    ): Result<Unit> = runCatching {
        val response = service.uploadClientAddress(accessToken, request)
        if (response.status != StatusResult.ZERO)
            throw BadRequestException()
    }

    override suspend fun updateClientAddress(
        accessToken: String,
        request: RGAddress
    ): Result<Unit> = runCatching {
        val response = service.updateClientAddress(accessToken, request)
        if (response.status != StatusResult.ZERO)
            throw BadRequestException()
    }

    override suspend fun addressList(accessToken: String): Result<DataAddress?> = runCatching {
        val response = service.addressList(accessToken)
        if (response.result?.status != StatusResult.ZERO)
            throw BadRequestException()
        response.data
    }

    override suspend fun defaultShippingAddress(
        accessToken: String
    ): Result<RGAddress?> = runCatching {
        val response = service.defaultShippingAddress(accessToken)
        if (response.result?.status != StatusResult.ZERO)
            throw BadRequestException()
        response.data
    }

    override suspend fun defaultBillingAddress(
        accessToken: String
    ): Result<RGAddress?> = runCatching {
        val response = service.defaultBillingAddress(accessToken)
        if (response.result?.status != StatusResult.ZERO)
            throw BadRequestException()
        response.data
    }
}