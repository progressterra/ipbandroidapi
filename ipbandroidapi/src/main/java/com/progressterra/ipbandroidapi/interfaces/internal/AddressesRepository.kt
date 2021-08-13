package com.progressterra.ipbandroidapi.interfaces.internal

import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.Address
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata.DadataSuggestionResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata.DadataSuggestionsRequest

internal interface AddressesRepository {
    suspend fun getAddressList(accessToken: String): ResponseWrapper<ListOfAddressesResponse>

    suspend fun addClientAddress(
        accessToken: String,
        modifyClientAddressRequest: Address
    ): ResponseWrapper<ResultResponse>

    suspend fun updateClientAddress(
        accessToken: String,
        modifyClientAddressRequest: Address
    ): ResponseWrapper<ResultResponse>

    suspend fun getSuggestionsAddressFromDadata(dadataSuggestionsRequest: DadataSuggestionsRequest): ResponseWrapper<DadataSuggestionResponse>
}