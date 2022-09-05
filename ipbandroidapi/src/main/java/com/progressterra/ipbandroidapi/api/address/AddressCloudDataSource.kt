package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.address.model.Address
import com.progressterra.ipbandroidapi.api.address.model.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.base.ResultResponse
import retrofit2.Response

interface AddressCloudDataSource {

    suspend fun addClientAddress(accessToken: String, modifyClientAddressRequest: Address): Response<ResultResponse>

    suspend fun updateClientAddress(accessToken: String, modifyClientAddressRequest: Address): Response<ResultResponse>

    suspend fun getAddressList(accessToken: String): Response<ListOfAddressesResponse>

    class Base(
        private val service: AddressService,
        handleException: HandleException
    ) : AddressCloudDataSource, AbstractCloudDataSource(handleException) {

        override suspend fun addClientAddress(
            accessToken: String,
            modifyClientAddressRequest: Address
        ): Response<ResultResponse> = handle {
            service.addClientAddress(accessToken, modifyClientAddressRequest)
        }

        override suspend fun updateClientAddress(
            accessToken: String,
            modifyClientAddressRequest: Address
        ): Response<ResultResponse> = handle {
            service.updateClientAddress(accessToken, modifyClientAddressRequest)
        }

        override suspend fun getAddressList(accessToken: String): Response<ListOfAddressesResponse> = handle {
            service.getAddressList(accessToken)
        }
    }
}