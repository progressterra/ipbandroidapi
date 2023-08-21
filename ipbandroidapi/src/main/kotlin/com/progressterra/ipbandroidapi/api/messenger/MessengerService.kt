package com.progressterra.ipbandroidapi.api.messenger

import com.progressterra.ipbandroidapi.api.messenger.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.messenger.models.IncomeDataForCreateDialog
import com.progressterra.ipbandroidapi.api.messenger.models.IncomeDataSearchDialog
import com.progressterra.ipbandroidapi.api.messenger.models.RGDialogsViewModelResultData
import com.progressterra.ipbandroidapi.api.messenger.models.RGDialogsViewModelResultDataList
import com.progressterra.ipbandroidapi.api.messenger.models.RGMessagesEntityCreate
import com.progressterra.ipbandroidapi.api.messenger.models.RGMessagesViewModelResultData
import com.progressterra.ipbandroidapi.api.messenger.models.RGMessagesViewModelResultDataList
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

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

    @POST("/clientarea/dialog/search")
    suspend fun clientAreaDialogSearch(
        @Header("AccessToken") accessToken: String,
        @Body body: IncomeDataSearchDialog
    ): RGDialogsViewModelResultData

    @POST("/clientarea/message/list")
    suspend fun clientAreaMessageList(
        @Header("AccessToken") accessToken: String,
        @Body body: FilterAndSort
    ): RGMessagesViewModelResultDataList
}