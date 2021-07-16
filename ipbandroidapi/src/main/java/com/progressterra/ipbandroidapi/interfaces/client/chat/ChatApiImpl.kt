package com.progressterra.ipbandroidapi.interfaces.client.chat

import com.progressterra.ipbandroidapi.interfaces.internal.ChatRepository
import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.CreateDialogRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.CreateDialogResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.MessageSendingRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.MessagesListResponse
import com.progressterra.ipbandroidapi.repository.RepositoryImpl

class ChatApiImpl : ChatApi {
    private val repository: ChatRepository = RepositoryImpl()


    override suspend fun getMessagesList(
        IDRGDialog: String,
        page: String
    ): ResponseWrapper<MessagesListResponse> {
        return repository.getMessagesList(IDRGDialog, page)
    }

    override suspend fun sendMessage(
        idrgDialog: String,
        accessToken: String,
        contentText: String
    ): ResponseWrapper<MessagesListResponse> {
        val request = MessageSendingRequest(idrgDialog, accessToken, contentText)
        return repository.sendMessage(request)
    }

    override suspend fun createNewDialog(description: String): ResponseWrapper<CreateDialogResponse> {
        val request = CreateDialogRequest(description)
        return repository.createNewDialog(request)
    }
}