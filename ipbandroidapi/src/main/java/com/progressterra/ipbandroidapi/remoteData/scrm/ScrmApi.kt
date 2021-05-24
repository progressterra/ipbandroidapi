package com.progressterra.ipbandroidapi.remoteData.scrm

import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.AccessTokenRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.VerificationRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.AccessTokenResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.GeneralInfoResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.VerificationResponse
import retrofit2.Response
import retrofit2.http.*

internal interface ScrmApi {

    /**
     * Начало верификации канала
     *
     * @param verificationRequest данные верификации
     * @return ответ сервера
     */
    @POST("/api/v3/clients/verificationchannelbegin")
    @Headers("Content-Type: text/json")
    suspend fun verificationChannelBegin(@Body verificationRequest: VerificationRequest): Response<ResultResponse>

    /**
     * Окончание верификации канала
     *
     * @param verificationRequest данные верификации
     * @return ответ сервера
     */
//    Не используется, так что не смотри пока что, это в следующем ПРе
    @POST("/api/v3/clients/verificationchannelend")
    @Headers("Content-Type : application/json")
    fun verificationChannelEnd(@Body verificationRequest: VerificationRequest): VerificationResponse

    /**
     * Получение accesstoken
     */
    @POST("api/v3/clients/accesstoken")
    @Headers("Content-Type: application/json")
    suspend fun getAccessToken(@Body accessToken: AccessTokenRequest): Response<AccessTokenResponse>

    /**
     * Получение информации о бонусах клиента
     */
    @GET("api/v3/ibonus/generalinfo/{AccessToken}")
    @Headers("Content-Type: application/json")
    suspend fun getGeneralInfo(@Path("AccessToken") accessToken: String): Response<GeneralInfoResponse>
}