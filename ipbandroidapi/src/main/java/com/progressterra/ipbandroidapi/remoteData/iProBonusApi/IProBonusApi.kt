package com.progressterra.ipbandroidapi.remoteData.iProBonusApi

import com.progressterra.ipbandroidapi.remoteData.ipbAmbassador.models.client_info.ClientInfoResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAmbassador.models.client_info.UpdateUserInfoRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

internal interface IProBonusApi {
    /**
     * получение базовой информации о клиенте
     * */
    @GET("/api/v3/clients/{AccessToken}/withadditionalinfo")
    suspend fun getClientInfo(@Path("AccessToken") accessToken: String): ClientInfoResponse

    /**
     * обновление базовой информации о клиенте
     * */
    @POST("/api/v3/clients/personalinfo/{AccessToken}")
    suspend fun updatePersonalInfo(
        @Path("AccessToken") accessToken: String,
        @Body updatePersonalData: UpdateUserInfoRequest
    ): ClientInfoResponse
}