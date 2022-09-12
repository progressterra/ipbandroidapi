package com.progressterra.ipbandroidapi.api.typecooperation

import com.progressterra.ipbandroidapi.api.typecooperation.model.CooperationListResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * [Docs](http://84.201.188.117:5087/docsapi/v1/index.html)
 */
internal interface TypeCooperationService {

    @GET("/typecooperation/list/{AccessToken}")
    suspend fun getCooperationTypeList(@Path("AccessToken") accessToken: String): CooperationListResponse
}