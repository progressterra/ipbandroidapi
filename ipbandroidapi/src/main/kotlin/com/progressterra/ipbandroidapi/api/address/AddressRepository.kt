package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.address.models.DataAddress
import com.progressterra.ipbandroidapi.api.address.models.RGAddress

interface AddressRepository {

    suspend fun uploadClientAddress(
        accessToken: String,
        request: RGAddress
    ): Result<String?>

    suspend fun updateClientAddress(
        accessToken: String,
        request: RGAddress
    ): Result<Unit>

    suspend fun addressList(accessToken: String): Result<DataAddress?>

    suspend fun defaultShippingAddress(accessToken: String): Result<RGAddress?>

    suspend fun defaultBillingAddress(accessToken: String): Result<RGAddress?>
}