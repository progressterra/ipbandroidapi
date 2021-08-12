package com.progressterra.ipbandroidapi.interfaces.client.addresses

import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata.DadataSuggestionResponse
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT

interface AddressApi {

    suspend fun getAddressList(accessToken: String): ResponseWrapper<ListOfAddressesResponse>

    suspend fun addClientAddress(
        accessToken: String,
        addressUI: AddressUI
    ): ResponseWrapper<ResultResponse>

    suspend fun updateClientAddress(
        accessToken: String,
        addressUI: AddressUI
    ): ResponseWrapper<ResultResponse>

    suspend fun getSuggestionsAddressFromDadata(query: String): ResponseWrapper<DadataSuggestionResponse>
}

fun AddressApi(): AddressApi = AddressApiImpl()