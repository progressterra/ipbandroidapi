package com.progressterra.ipbandroidapi.api.application

import com.progressterra.ipbandroidapi.api.application.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.application.models.RGApplicationEntityCore
import com.progressterra.ipbandroidapi.api.application.models.RGApplicationResultDataList
import com.progressterra.ipbandroidapi.api.application.models.RGApplicationViewModelResultData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface ApplicationService {

    @POST("/application/list")
    suspend fun applicationList(
        @Header("AccessToken") accessToken: String,
        @Body body: FilterAndSort
    ): RGApplicationResultDataList

    @POST("/application")
    suspend fun application(
        @Header("AccessToken") accessToken: String,
        @Body body: RGApplicationEntityCore
    ): RGApplicationViewModelResultData

    @GET("/application/{idEntity}")
    suspend fun applicationByIdEntity(
        @Header("AccessToken") accessToken: String,
        @Path("idEntity") idEntity: String
    ): RGApplicationViewModelResultData
}