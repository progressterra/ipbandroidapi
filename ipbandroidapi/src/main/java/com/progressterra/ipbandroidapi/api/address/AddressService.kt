package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.scrm.models.address.Address
import com.progressterra.ipbandroidapi.api.scrm.models.address.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.remotedata.models.base.ResultResponse
import retrofit2.Response
import retrofit2.http.*

interface AddressService {

    @POST("/api/v3/addressclient/{AccessToken}")
    suspend fun addClientAddress(
        @Path("AccessToken") accessToken: String,
        @Body modifyClientAddressRequest: Address
    ): Response<ResultResponse>

    @PUT("/api/v3/addressclient/{AccessToken}")
    suspend fun updateClientAddress(
        @Path("AccessToken") accessToken: String,
        @Body modifyClientAddressRequest: Address
    ): Response<ResultResponse>

    @GET("/api/v3/addressclient/list/{AccessToken}")
    suspend fun getAddressList(@Path("AccessToken") accessToken: String): Response<ListOfAddressesResponse>
}