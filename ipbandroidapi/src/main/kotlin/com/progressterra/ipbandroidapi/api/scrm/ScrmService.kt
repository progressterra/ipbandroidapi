package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.models.ClientsEntity
import com.progressterra.ipbandroidapi.api.scrm.models.ClientsViewModelResultData
import com.progressterra.ipbandroidapi.api.scrm.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.scrm.models.RGAddressEntity
import com.progressterra.ipbandroidapi.api.scrm.models.RGAddressResultDataList
import com.progressterra.ipbandroidapi.api.scrm.models.RGAddressViewModelResultData
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST

interface ScrmService {

    @POST("/address")
    suspend fun postAddress(
        token: String,
        body: RGAddressEntity
    ): RGAddressViewModelResultData

    @PATCH("/address")
    suspend fun patchAddress(
        token: String,
        body: RGAddressEntity
    ): RGAddressViewModelResultData

    @GET("/address/{idEntity}")
    suspend fun getAddress(
        token: String,
        idEntity: String
    ): RGAddressViewModelResultData

    @POST("/address/list")
    suspend fun addressList(
        token: String,
        body: FilterAndSort
    ): RGAddressResultDataList

    @PATCH("/clientarea")
    suspend fun postClient(
        token: String,
        body: ClientsEntity
    ): ClientsViewModelResultData

    @GET("/clientarea")
    suspend fun getClient(
        token: String
    ): ClientsViewModelResultData
}