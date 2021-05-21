package com.progressterra.ipbandroidapi.remoteData.scrm

import com.progressterra.ipbandroidapi.repository.models.access_token.AccessTokenRequest
import com.progressterra.ipbandroidapi.repository.models.access_token.AccessTokenResponse
import com.progressterra.ipbandroidapi.repository.models.bonuses_info.GeneralInfoResponse
import retrofit2.Response
import retrofit2.http.*

internal interface ScrmRepository {
    /**
     * Получение accesstoken
     */
    @POST("api/v3/clients/accesstoken")
    @Headers("Content-Type: application/json")
    suspend fun getAccessToken(
        @Body accessToken: AccessTokenRequest
    ): Response<AccessTokenResponse>

    /**
     * Получение информации о бонусах клиента
     */
    @GET("api/v3/ibonus/generalinfo/{AccessToken}")
    @Headers("Content-Type: application/json")
    suspend fun getGeneralInfo(@Path("AccessToken") accessToken: String): Response<GeneralInfoResponse>
}