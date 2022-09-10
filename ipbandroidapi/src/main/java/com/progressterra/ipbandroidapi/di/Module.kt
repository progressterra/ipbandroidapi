package com.progressterra.ipbandroidapi.di

import com.progressterra.ipbandroidapi.api.address.AddressCloudDataSource
import com.progressterra.ipbandroidapi.api.address.AddressRepository
import com.progressterra.ipbandroidapi.api.address.BaseAddressRepository
import org.koin.dsl.module

val iPBAndroidAPIModule = module {

    single<AddressRepository> {
        BaseAddressRepository(AddressCloudDataSource.Base())
    }
}