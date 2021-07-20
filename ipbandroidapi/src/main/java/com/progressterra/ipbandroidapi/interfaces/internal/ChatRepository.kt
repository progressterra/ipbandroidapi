package com.progressterra.ipbandroidapi.interfaces.internal

import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.CreateDialogRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.CreateDialogResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.MessageSendingRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.MessagesListResponse

interface ChatRepository {

    suspend fun getMessagesList(
        IDRGDialog: String,
        page: String
    ): ResponseWrapper<MessagesListResponse>

    suspend fun sendMessage(messageSendingRequest: MessageSendingRequest): ResponseWrapper<MessagesListResponse>

    suspend fun createNewDialog(createDialogRequest: CreateDialogRequest): ResponseWrapper<CreateDialogResponse>
}