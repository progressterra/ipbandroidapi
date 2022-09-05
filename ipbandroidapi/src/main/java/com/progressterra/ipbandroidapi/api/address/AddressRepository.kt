package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.address.model.Address
import com.progressterra.ipbandroidapi.api.address.model.AddressesInfo
import com.progressterra.ipbandroidapi.core.AbstractRepository

interface AddressRepository {

    suspend fun addClientAddress(
        accessToken: String,
        modifyClientAddressRequest: Address
    ): Result<Boolean>

    suspend fun updateClientAddress(
        accessToken: String,
        modifyClientAddressRequest: Address
    ): Result<Boolean>

    suspend fun getAddressList(accessToken: String): Result<AddressesInfo>

    class Base(
        private val cloudDataSource: AddressCloudDataSource
    ) : AddressRepository, AbstractRepository() {

        override suspend fun getAddressList(accessToken: String): Result<AddressesInfo> = handle {
            cloudDataSource.getAddressList(accessToken)
        }.map { it.body()!!.addressInfo.toAddressesInfo() }

        override suspend fun addClientAddress(
            accessToken: String,
            modifyClientAddressRequest: Address
        ): Result<Boolean> = handle {
            cloudDataSource.addClientAddress(
                accessToken,
                modifyClientAddressRequest
            )
        }.map {
            it.body()?.status == 0
        }

        override suspend fun updateClientAddress(
            accessToken: String,
            modifyClientAddressRequest: Address
        ): Result<Boolean> = handle {
            cloudDataSource.updateClientAddress(accessToken, modifyClientAddressRequest)
        }.map {
            it.body()?.status == 0
        }
    }
}