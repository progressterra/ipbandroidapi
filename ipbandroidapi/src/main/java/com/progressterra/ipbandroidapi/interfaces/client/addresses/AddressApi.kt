package com.progressterra.ipbandroidapi.interfaces.client.addresses

import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.Address
import com.progressterra.ipbandroidapi.api.scrm.models.address.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.dadata.DadataSuggestionResponse

interface AddressApi {

    suspend fun getAddressList(accessToken: String): ResponseWrapper<ListOfAddressesResponse>

    suspend fun addClientAddress(
        accessToken: String,
        address: Address
    ): ResponseWrapper<ResultResponse>

    suspend fun updateClientAddress(
        accessToken: String,
        address: Address
    ): ResponseWrapper<ResultResponse>

    suspend fun getSuggestionsAddressFromDadata(query: String): ResponseWrapper<DadataSuggestionResponse>
}

fun AddressApi(): AddressApi = AddressApiImpl()