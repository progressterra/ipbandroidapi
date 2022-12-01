package com.progressterra.ipbandroidapi.message

import com.progressterra.ipbandroidapi.message.models.IncomeDataGetOrCreateDialog
import com.progressterra.ipbandroidapi.message.models.IncomeMessagesTextData
import com.progressterra.ipbandroidapi.message.models.ResultDialog
import com.progressterra.ipbandroidapi.message.models.ResultDialogList
import com.progressterra.ipbandroidapi.message.models.ResultListMessages
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * [Docs](http://84.201.188.117:5093/docsapi/v1/index.html)
 */
interface IMessengerService {

    @GET("/messenger/mobile/messages/{dialogId}/{currentPage}")
    suspend fun messagesList(
        @Path("dialogId") idRgDialog: String, @Path("currentPage") page: String
    ): ResultListMessages

    @POST("/messenger/mobile/messages/text")
    suspend fun sendMessage(@Body request: IncomeMessagesTextData): ResultListMessages

    @POST("/messenger/mobile/dialog/bylistuser")
    suspend fun dialogInfo(@Body request: IncomeDataGetOrCreateDialog): ResultDialog

    @GET("/messenger/mobile/list/{AccessToken}")
    suspend fun dialogList(@Path("AccessToken") accessToken: String): ResultDialogList
}