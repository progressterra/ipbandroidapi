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

    @PUT("/api/v3/addressclient/{AccessToken}")
    suspend fun updateClientAddress(
        accessToken: String,
        addressUI: AddressUI
    ): ResponseWrapper<ResultResponse>

    @Headers("Authorization: Token 444220bc01c3cb6a7bd102bdfb72175a2deee88e")
    @POST("suggestions/api/4_1/rs/suggest/address")
    suspend fun getSuggestionsAddressFromDadata(query: String): ResponseWrapper<DadataSuggestionResponse>
}

fun AddressApi(): AddressApi = AddressApiImpl()