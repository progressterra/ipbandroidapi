package com.progressterra.ipbandroidapi.api.ibonus

import com.progressterra.ipbandroidapi.api.scrm.models.responses.BonusesMessagesResponse
import com.progressterra.ipbandroidapi.api.scrm.models.responses.GeneralInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.models.responses.TransactionListResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

internal interface IBonusService {

    /**
     * Получение информации о бонусах клиента
     */
    @GET("api/v7/ibonus/generalinfo/{AccessToken}")
    @Headers("Content-Type: application/json")
    suspend fun generalInfo(@Path("AccessToken") accessToken: String): GeneralInfoResponse

    /**
     * Предоставляет данные по всем транзакциям бонусов
     */
    @GET("/api/v7/ibonus/alltransaction/{AccessToken}")
    suspend fun transactionsList(@Path("AccessToken") accessToken: String): TransactionListResponse

    /**
     * Получение списка бонусных сообщений
     */
    @GET("/api/v7/ibonus/infobytype/{AccessToken}")
    suspend fun bonusMessagesList(@Path("AccessToken") accessToken: String): BonusesMessagesResponse
}