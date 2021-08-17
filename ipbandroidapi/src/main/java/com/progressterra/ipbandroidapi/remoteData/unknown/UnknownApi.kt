package com.progressterra.ipbandroidapi.remoteData.unknown

import com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.client_info.UpdateUserInfoRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.client_info_response.ClientInfoResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

internal interface UnknownApi {
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