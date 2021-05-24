package com.progressterra.ipbandroidapi.remoteData.scrm

import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.body.VerificationRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.VerificationResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

internal interface ScrmAPI {

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

}