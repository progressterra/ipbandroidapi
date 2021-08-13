package com.progressterra.ipbandroidapi.interfaces.client.addresses

import com.progressterra.ipbandroidapi.interfaces.internal.AddressesRepository
import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.Address
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata.DadataSuggestionResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.repository.RepositoryImpl

class AddressApiImpl : AddressApi {
    private val repository: AddressesRepository = RepositoryImpl()

    override suspend fun getAddressList(accessToken: String): ResponseWrapper<ListOfAddressesResponse> {
        return repository.getAddressList(accessToken)
    }

    override suspend fun addClientAddress(
        accessToken: String,
        address: Address
    ): ResponseWrapper<ResultResponse> {
        return repository.addClientAddress(accessToken, address)
    }

    override suspend fun updateClientAddress(
        accessToken: String,
        address: Address
    ): ResponseWrapper<ResultResponse> {
        return repository.updateClientAddress(
            accessToken,
            address
        )
    }

    override suspend fun getSuggestionsAddressFromDadata(query: String): ResponseWrapper<DadataSuggestionResponse> {
        return repository.getSuggestionsAddressFromDadata(DadataSuggestionsRequest(query = query))
    }
}