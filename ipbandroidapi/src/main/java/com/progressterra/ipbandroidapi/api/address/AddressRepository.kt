package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.scrm.models.address.Address
import com.progressterra.ipbandroidapi.api.scrm.models.address.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.remotedata.models.base.ResultResponse
import retrofit2.Response

interface AddressRepository {

    suspend fun addClientAddress(accessToken: String, modifyClientAddressRequest: Address): Response<ResultResponse>

    suspend fun updateClientAddress(accessToken: String, modifyClientAddressRequest: Address): Response<ResultResponse>

    suspend fun getAddressList(accessToken: String): Response<ListOfAddressesResponse>

    class Base(
        private val cloudDataSource: AddressCloudDataSource
    ) : AddressRepository {

        override suspend fun getAddressList(accessToken: String): Response<ListOfAddressesResponse> =
            cloudDataSource.getAddressList(accessToken)

        override suspend fun addClientAddress(
            accessToken: String,
            modifyClientAddressRequest: Address
        ): Response<ResultResponse> = cloudDataSource.addClientAddress(accessToken, modifyClientAddressRequest)

        override suspend fun updateClientAddress(
            accessToken: String,
            modifyClientAddressRequest: Address
        ): Response<ResultResponse> =
            cloudDataSource.updateClientAddress(accessToken, modifyClientAddressRequest)
    }
}