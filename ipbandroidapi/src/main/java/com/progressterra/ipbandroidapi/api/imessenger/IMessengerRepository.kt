package com.progressterra.ipbandroidapi.api.imessenger

import com.progressterra.ipbandroidapi.api.imessenger.model.*

interface IMessengerRepository {

    suspend fun getMessagesList(idRgDialog: String, page: String): Result<List<MessageData>>

    suspend fun sendMessage(
        idrgDialog: String,
        accessToken: String,
        contentText: String
    ): Result<List<MessageData>>

    suspend fun getDialogInfo(
        listId: List<String>,
        descriptionDialog: String,
        additionalData: String,
        additionalDataJSON: String
    ): Result<DialogInfoData>

    suspend fun getDialogList(accessToken: String): Result<List<DialogInfoData>>
}