package com.progressterra.ipbandroidapi.remoteData.iMessengerCore

import com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models.DialogInfoRequest
import com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models.DialogInfoResponse
import com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models.MessageSendingRequest
import com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models.MessagesListResponse

/**
 * http://84.201.184.154:5093/docsapi/v1/index.html
 */
interface IMessengerCore {

    suspend fun getMessagesList(
        IDRGDialog: String,
        page: String
    ): MessagesListResponse

    suspend fun sendMessage(
        messageSendingRequest: MessageSendingRequest
    ): MessagesListResponse

    suspend fun getDialogInfo(dialogInfoRequest: DialogInfoRequest): DialogInfoResponse
}

fun IMessengerCore(): IMessengerCore = IMessengerCoreImpl()