package com.progressterra.ipbandroidapi.remoteData.iMessengerCore

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models.DialogInfoRequest
import com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models.DialogInfoResponse
import com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models.MessageSendingRequest
import com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models.MessagesListResponse

internal class IMessengerCoreImpl : IMessengerCore {
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
}