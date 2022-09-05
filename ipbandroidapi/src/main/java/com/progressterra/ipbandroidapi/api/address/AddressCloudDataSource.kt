package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.address.model.Address
import com.progressterra.ipbandroidapi.api.address.model.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.base.ResultResponse

interface AddressCloudDataSource {

    suspend fun setClientAddress(accessToken: String, modifyClientAddressRequest: Address): ResultResponse

    suspend fun getAddressList(accessToken: String): ListOfAddressesResponse

    class Base(
        private val service: AddressService,
        handleException: HandleException
    ) : AddressCloudDataSource, AbstractCloudDataSource(handleException) {

        override suspend fun setClientAddress(
            accessToken: String,
            modifyClientAddressRequest: Address
        ): ResultResponse = handle {
            service.setClientAddress(accessToken, modifyClientAddressRequest)
        }

        override suspend fun getAddressList(accessToken: String): ListOfAddressesResponse = handle {
            service.getAddressList(accessToken)
        }
    }
}