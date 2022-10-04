package com.progressterra.ipbandroidapi.api.imessenger

import com.progressterra.ipbandroidapi.api.imessenger.model.DialogInfoData
import com.progressterra.ipbandroidapi.api.imessenger.model.DialogInfoRequest
import com.progressterra.ipbandroidapi.api.imessenger.model.MessageData
import com.progressterra.ipbandroidapi.api.imessenger.model.MessageSendingRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseIMessengerRepository(
    private val cloudDataSource: IMessengerCloudDataSource
) : AbstractRepository(), IMessengerRepository {

    override suspend fun getMessagesList(idRgDialog: String, page: String): Result<List<MessageData>> = handle {
        val response = cloudDataSource.getMessagesList(idRgDialog, page)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        it.dataList?.map { data -> MessageData(data) } ?: emptyList()
    }

    override suspend fun sendMessage(
        idrgDialog: String,
        accessToken: String,
        contentText: String
    ): Result<List<MessageData>> = handle {
        val response = cloudDataSource.sendMessage(
            MessageSendingRequest(
                idrgDialog,
                accessToken,
                contentText
            )
        )
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        it.dataList?.map { data -> MessageData(data) } ?: emptyList()
    }

    override suspend fun getDialogInfo(
        listId: List<String>,
        descriptionDialog: String,
        additionalData: String,
        additionalDataJSON: String
    ): Result<DialogInfoData> = handle {
        val response = cloudDataSource.getDialogInfo(
            DialogInfoRequest(
                listId,
                descriptionDialog,
                additionalData,
                additionalDataJSON
            )
        )
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        DialogInfoData(it.dialogInfo)
    }

    override suspend fun getDialogList(accessToken: String): Result<List<DialogInfoData>> = handle {
        val response = cloudDataSource.getDialogList(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        it.dataList?.map { data -> DialogInfoData(data) } ?: emptyList()
    }
}