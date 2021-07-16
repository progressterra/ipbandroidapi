package com.progressterra.ipbandroidapi.interfaces.client.chat

import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.CreateDialogResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.MessagesListResponse

interface ChatApi {

    // получение списка сообщений
    suspend fun getMessagesList(
        IDRGDialog: String,
        page: String
    ): ResponseWrapper<MessagesListResponse>

    // отправка сообщения
    suspend fun sendMessage(
        idrgDialog: String,
        accessToken: String,
        contentText: String
    ): ResponseWrapper<MessagesListResponse>

    // создание нового диалога
    suspend fun createNewDialog(
        description: String
    ): ResponseWrapper<CreateDialogResponse>

    companion object {
        fun getInstance(): ChatApi {
            return ChatApiImpl()
        }
    }
}