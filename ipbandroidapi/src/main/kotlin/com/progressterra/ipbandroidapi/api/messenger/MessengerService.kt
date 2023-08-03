package com.progressterra.ipbandroidapi.api.messenger

import com.progressterra.ipbandroidapi.api.messenger.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.messenger.models.IncomeDataForCreateDialog
import com.progressterra.ipbandroidapi.api.messenger.models.RGDialogsViewModelResultData
import com.progressterra.ipbandroidapi.api.messenger.models.RGDialogsViewModelResultDataList
import com.progressterra.ipbandroidapi.api.messenger.models.RGMessages
import com.progressterra.ipbandroidapi.api.messenger.models.RGMessagesEntity
import com.progressterra.ipbandroidapi.api.messenger.models.RGMessagesEntityCreate
import com.progressterra.ipbandroidapi.api.messenger.models.RGMessagesResultDataList
import com.progressterra.ipbandroidapi.api.messenger.models.RGMessagesViewModelResultData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path

interface MessengerService {

    @POST("/clientarea/message")
    suspend fun clientAreaMessage(
        @Header("AccessToken") accessToken: String,
        @Body body: RGMessagesEntityCreate
    ): RGMessagesViewModelResultData

    @POST("/clientarea/dialog")
    suspend fun clientAreaDialog(
        @Header("AccessToken") accessToken: String,
        @Body body: IncomeDataForCreateDialog
    ): RGDialogsViewModelResultData

    @POST("/clientarea/dialog/list")
    suspend fun clientAreaDialogList(
        @Header("AccessToken") accessToken: String,
        @Body body: FilterAndSort
    ): RGDialogsViewModelResultDataList

    @POST("/message")
    suspend fun postMessage(
        @Header("AccessToken") accessToken: String,
        @Body body: RGMessagesEntity
    ): RGMessagesViewModelResultData

    @PATCH("/message")
    suspend fun patchMessage(
        @Header("AccessToken") accessToken: String,
        @Body body: RGMessages
    ): RGMessagesViewModelResultData

    @GET("/message/entity/{idEntity}")
    suspend fun entityById(
        @Header("AccessToken") accessToken: String,
        @Path("idEntity") idEntity: String
    ): RGMessagesViewModelResultData

    @POST("/message/list")
    suspend fun messageList(
        @Header("AccessToken") accessToken: String,
        @Body body: FilterAndSort
    ): RGMessagesResultDataList
}