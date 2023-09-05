package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.models.ClientsEntity
import com.progressterra.ipbandroidapi.api.scrm.models.ClientsViewModelResultData
import com.progressterra.ipbandroidapi.api.scrm.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.scrm.models.RGAddressEntity
import com.progressterra.ipbandroidapi.api.scrm.models.RGAddressResultDataList
import com.progressterra.ipbandroidapi.api.scrm.models.RGAddressViewModelResultData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path

interface ScrmService {

    @POST("/address")
    suspend fun postAddress(
        @Header("AccessToken") token: String,
        @Body body: RGAddressEntity
    ): RGAddressViewModelResultData

    @PATCH("/address")
    suspend fun patchAddress(
        @Header("AccessToken") token: String,
        @Body body: RGAddressEntity
    ): RGAddressViewModelResultData

    @GET("/address/{idEntity}")
    suspend fun getAddress(
        @Header("AccessToken") token: String,
        @Path("idEntity") idEntity: String
    ): RGAddressViewModelResultData

    @POST("/address/list")
    suspend fun addressList(
        @Header("AccessToken") token: String,
        @Body body: FilterAndSort
    ): RGAddressResultDataList

    @PATCH("/clientarea")
    suspend fun postClient(
        @Header("AccessToken") token: String,
        @Body body: ClientsEntity
    ): ClientsViewModelResultData

    @GET("/clientarea")
    suspend fun getClient(
        @Header("AccessToken") token: String
    ): ClientsViewModelResultData
}