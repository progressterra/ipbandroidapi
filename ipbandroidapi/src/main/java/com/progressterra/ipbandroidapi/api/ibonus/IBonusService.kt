package com.progressterra.ipbandroidapi.api.ibonus

import com.progressterra.ipbandroidapi.api.ibonus.model.BonusesMessagesResponse
import com.progressterra.ipbandroidapi.api.ibonus.model.GeneralBonusResponse
import com.progressterra.ipbandroidapi.api.ibonus.model.TransactionListResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * [Docs](http://84.201.188.117:7003/docsapi/v7/index.html)
 */
internal interface IBonusService {

    /**
     * Получение информации о бонусах клиента
     */
    @GET("api/v7/ibonus/generalinfo/{AccessToken}")
    suspend fun getGeneralInfo(@Path("AccessToken") accessToken: String): GeneralBonusResponse

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