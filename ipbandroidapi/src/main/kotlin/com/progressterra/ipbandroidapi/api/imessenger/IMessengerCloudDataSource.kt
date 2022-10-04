package com.progressterra.ipbandroidapi.api.imessenger

import com.progressterra.ipbandroidapi.api.imessenger.model.*
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

internal interface IMessengerCloudDataSource {

    suspend fun getMessagesList(IDRGDialog: String, page: String): MessagesListResponse

    suspend fun sendMessage(messageSendingRequest: MessageSendingRequest): MessagesListResponse

    suspend fun getDialogInfo(dialogInfoRequest: DialogInfoRequest): DialogInfoResponse

    suspend fun getDialogList(accessToken: String): ResultDialogList

    class Base(
        private val service: IMessengerService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), IMessengerCloudDataSource {

        override suspend fun getMessagesList(IDRGDialog: String, page: String): MessagesListResponse = handle {
            service.getMessagesList(IDRGDialog, page)
        }

        override suspend fun sendMessage(messageSendingRequest: MessageSendingRequest): MessagesListResponse = handle {
            service.sendMessage(messageSendingRequest)
        }

        override suspend fun getDialogInfo(dialogInfoRequest: DialogInfoRequest): DialogInfoResponse = handle {
            service.getDialogInfo(dialogInfoRequest)
        }

        override suspend fun getDialogList(accessToken: String): ResultDialogList = handle {
            service.getDialogList(accessToken)
        }
    }
}