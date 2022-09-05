package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.address.model.Address
import com.progressterra.ipbandroidapi.api.address.model.AddressInfo
import com.progressterra.ipbandroidapi.api.address.model.AddressesInfo
import com.progressterra.ipbandroidapi.core.AbstractRepository

interface AddressRepository {

    suspend fun setClientAddress(
        accessToken: String,
        addressInfo: AddressInfo
    ): Result<Boolean>

    suspend fun getAddressList(accessToken: String): Result<AddressesInfo>

    class Base(
        private val cloudDataSource: AddressCloudDataSource
    ) : AddressRepository, AbstractRepository() {

        override suspend fun getAddressList(accessToken: String): Result<AddressesInfo> = handle {
            cloudDataSource.getAddressList(accessToken)
        }.map { AddressesInfo(it.addressInfo) }

        override suspend fun setClientAddress(
            accessToken: String,
            addressInfo: AddressInfo
        ): Result<Boolean> = handle {
            cloudDataSource.setClientAddress(accessToken, Address(addressInfo))
        }.map {
            it.status == 0
        }
    }
}