package com.progressterra.ipbandroidapi.api.ibonus

import com.progressterra.ipbandroidapi.api.ibonus.model.BonusesMessagesResponse
import com.progressterra.ipbandroidapi.api.ibonus.model.GeneralInfoResponse
import com.progressterra.ipbandroidapi.api.ibonus.model.TransactionListResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface IBonusService {

    /**
     * Получение информации о бонусах клиента
     */
    @GET("api/v7/ibonus/generalinfo/{AccessToken}")
    suspend fun getGeneralInfo(@Path("AccessToken") accessToken: String): GeneralInfoResponse

    /**
     * Предоставляет данные по всем транзакциям бонусов
     */
    @GET("/api/v7/ibonus/alltransaction/{AccessToken}")
    suspend fun getTransactionsList(@Path("AccessToken") accessToken: String): TransactionListResponse

    /**
     * Получение списка бонусных сообщений
     */
    @GET("/api/v7/ibonus/infobytype/{AccessToken}")
    suspend fun getBonusMessagesList(@Path("AccessToken") accessToken: String): BonusesMessagesResponse
}