package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.address.model.Address
import com.progressterra.ipbandroidapi.api.address.model.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.base.ResultResponse
import retrofit2.Response
import retrofit2.http.*

interface AddressService {

    @PUT("/api/v3/addressclient/{AccessToken}")
    suspend fun setClientAddress(
        @Path("AccessToken") accessToken: String,
        @Body modifyClientAddressRequest: Address
    ): ResultResponse

    @GET("/api/v3/addressclient/list/{AccessToken}")
    suspend fun getAddressList(@Path("AccessToken") accessToken: String): ListOfAddressesResponse
}