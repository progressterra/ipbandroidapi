package com.progressterra.ipbandroidapi.api.imessengercore

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.api.imessengercore.models.*
import com.progressterra.ipbandroidapi.core.NetworkService

internal class IMessengerCoreImpl : IMessengerCore.Mobile {
    private val networkService: NetworkService = NetworkService.Base()

    private val dialogsAPI =
        networkService.createService(IMessengerCoreAPI::class.java, URL.DIALOGS_URL)

    override suspend fun getMessagesList(IDRGDialog: String, page: String): MessagesListResponse {
        return dialogsAPI.getMessagesList(IDRGDialog, page)
    }

    override suspend fun sendMessage(messageSendingRequest: MessageSendingRequest): MessagesListResponse {
        return dialogsAPI.sendMessage(messageSendingRequest)
    }

    override suspend fun getDialogInfo(dialogInfoRequest: DialogInfoRequest): DialogInfoResponse {
        return dialogsAPI.getDialogInfo(dialogInfoRequest)
    }

    override suspend fun getDialogList(accessToken: String): ResultDialogList {
        return dialogsAPI.getDialogList(accessToken)
    }
}