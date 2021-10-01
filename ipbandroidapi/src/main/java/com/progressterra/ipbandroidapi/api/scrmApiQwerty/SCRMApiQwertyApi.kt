package com.progressterra.ipbandroidapi.api.scrmApiQwerty

import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests.RemoveClientRequest
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

internal interface SCRMApiQwertyApi {


    /**
     *  ClientManagement
     */
    // Инициируем удаление клиента - отправляем код подтверждения на основной канал (сейчас номер телефона)
    @POST("/client/management/{AccessToken}/remove/begin")
    suspend fun removeClientBegin(@Path("AccessToken") accessToken: String): BaseResponse

    //  Если код верификации отправленный на основной канал верен,
    // то удаляем клиента - ОЧИЩАЕМ ФИО, Дату рождения, Пол. Рвем запись в ClientChannel
    @POST("/client/management/{AccessToken}/remove/end")
    suspend fun removeClientEnd(
        @Path("AccessToken") accessToken: String,
        @Body removeClientRequest: RemoveClientRequest
    ): BaseResponse
}