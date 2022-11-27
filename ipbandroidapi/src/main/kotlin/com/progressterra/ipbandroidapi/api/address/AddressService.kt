package com.progressterra.ipbandroidapi.api.address

import com.progressterra.ipbandroidapi.api.address.models.RGAddress
import com.progressterra.ipbandroidapi.api.address.models.ResultClientAddress
import com.progressterra.ipbandroidapi.api.address.models.ResultOperation
import com.progressterra.ipbandroidapi.api.address.models.ResultSingleClientAddress
import retrofit2.http.*

/**
 * [Docs](http://84.201.188.117:5021/docsapi/v3/index.html)
 */
internal interface AddressService {

    @POST("/api/v3/addressclient/{AccessToken}")
    suspend fun uploadClientAddress(
        @Path("AccessToken") accessToken: String,
        @Body request: RGAddress
    ): ResultOperation

    @PUT("/api/v3/addressclient/{AccessToken}")
    suspend fun updateClientAddress(
        @Path("AccessToken") accessToken: String,
        @Body request: RGAddress
    ): ResultOperation

    @GET("/api/v3/addressclient/list/{AccessToken}")
    suspend fun addressList(@Path("AccessToken") accessToken: String): ResultClientAddress

    @GET("/api/v3/addressclient/shipping/{AccessToken}")
    suspend fun defaultShippingAddress(@Path("AccessToken") accessToken: String): ResultSingleClientAddress

    @GET("/api/v3/addressclient/billing/{AccessToken}")
    suspend fun defaultBillingAddress(@Path("AccessToken") accessToken: String): ResultSingleClientAddress
}