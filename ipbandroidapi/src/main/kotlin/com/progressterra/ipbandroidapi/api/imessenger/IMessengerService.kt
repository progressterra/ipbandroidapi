package com.progressterra.ipbandroidapi.api.imessenger

import com.progressterra.ipbandroidapi.api.imessenger.model.*
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * [Docs](http://84.201.188.117:5093/docsapi/v1/index.html)
 */
internal interface IMessengerService {

    @GET("/messenger/mobile/messages/{dialogId}/{currentPage}")
    suspend fun getMessagesList(
        @Path("dialogId") IDRGDialog: String,
        @Path("currentPage") page: String
    ): MessagesListResponse

    @POST("/messenger/mobile/messages/text")
    suspend fun sendMessage(
        @Body messageSendingRequest: MessageSendingRequest
    ): MessagesListResponse

    @POST("/messenger/mobile/dialog/bylistuser")
    suspend fun getDialogInfo(@Body dialogInfoRequest: DialogInfoRequest): DialogInfoResponse

    @GET("/messenger/mobile/list/{AccessToken}")
    suspend fun getDialogList(@Path("AccessToken") accessToken: String): ResultDialogList
}