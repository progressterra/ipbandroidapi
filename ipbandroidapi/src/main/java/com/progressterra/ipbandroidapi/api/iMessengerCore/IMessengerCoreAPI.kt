package com.progressterra.ipbandroidapi.api.iMessengerCore

import com.progressterra.ipbandroidapi.api.iMessengerCore.models.DialogInfoRequest
import com.progressterra.ipbandroidapi.api.iMessengerCore.models.DialogInfoResponse
import com.progressterra.ipbandroidapi.api.iMessengerCore.models.MessageSendingRequest
import com.progressterra.ipbandroidapi.api.iMessengerCore.models.MessagesListResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


internal interface IMessengerCoreAPI {
    /**
     * получение списка сообщений
     */
    @GET("/messenger/mobile/messages/{dialogId}/{currentPage}")
    suspend fun getMessagesList(
        @Path("dialogId") IDRGDialog: String,
        @Path("currentPage") page: String
    ): MessagesListResponse

    /**
     * отправка сообщения
     */
    @POST("/messenger/mobile/messages/text")
    suspend fun sendMessage(
        @Body messageSendingRequest: MessageSendingRequest
    ): MessagesListResponse

    /**
     * получение информации о диалоге между текущим пользователем и организацией
     * необходимо передать айди текущего пользователя, айди организации
     */
    @POST("/messenger/mobile/dialog/bylistuser")
    suspend fun getDialogInfo(@Body dialogInfoRequest: DialogInfoRequest): DialogInfoResponse
}