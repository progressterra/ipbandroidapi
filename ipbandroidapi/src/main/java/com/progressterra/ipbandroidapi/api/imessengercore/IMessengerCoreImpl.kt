package com.progressterra.ipbandroidapi.api.imessengercore

import com.progressterra.ipbandroidapi.api.imessengercore.models.*
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remotedata.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remotedata.NetworkSettings

internal class IMessengerCoreImpl : IMessengerCore.Mobile {
    private val networkService: NetworkService = NetworkServiceImpl()


    private val dialogsAPI =
        networkService.createService(IMessengerCoreAPI::class.java, NetworkSettings.DIALOGS_URL)

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