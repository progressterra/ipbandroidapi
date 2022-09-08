package com.progressterra.ipbandroidapi.api.typecooperation

import com.progressterra.ipbandroidapi.api.typecooperation.model.CooperationListResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface TypeCooperationService {

    @GET("/typecooperation/list/{AccessToken}")
    suspend fun getCooperationTypeList(@Path("AccessToken") accessToken: String): CooperationListResponse
}