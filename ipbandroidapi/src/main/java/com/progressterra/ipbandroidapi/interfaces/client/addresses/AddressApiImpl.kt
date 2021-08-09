package com.progressterra.ipbandroidapi.interfaces.client.addresses

import com.progressterra.ipbandroidapi.interfaces.internal.AddressesRepository
import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata.DadataSuggestionResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.repository.RepositoryImpl

class AddressApiImpl : AddressApi {
    val repository: AddressesRepository = RepositoryImpl()

    override suspend fun getAddressList(accessToken: String): ResponseWrapper<ListOfAddressesResponse> {
        return repository.getAddressList(accessToken)
    }

    override suspend fun addClientAddress(
        accessToken: String,
        addressUI: AddressUI
    ): ResponseWrapper<ResultResponse> {
        return repository.addClientAddress(accessToken, addressUI.convertToUpdateAddressRequest())
    }

    override suspend fun updateClientAddress(
        accessToken: String,
        addressUI: AddressUI
    ): ResponseWrapper<ResultResponse> {
        return repository.updateClientAddress(
            accessToken,
            addressUI.convertToUpdateAddressRequest()
        )
    }

    override suspend fun getSuggestionsAddressFromDadata(query: String): ResponseWrapper<DadataSuggestionResponse> {
        return repository.getSuggestionsAddressFromDadata(DadataSuggestionsRequest(query = query))
    }
}