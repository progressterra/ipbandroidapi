package com.progressterra.ipbandroidapi.api.iMessengerCore

import com.progressterra.ipbandroidapi.api.iMessengerCore.models.*

/**
 * http://84.201.184.154:5093/docsapi/v1/index.html
 */
interface IMessengerCore {

    interface Mobile {
        suspend fun getMessagesList(
            IDRGDialog: String,
            page: String
        ): MessagesListResponse

        suspend fun sendMessage(
            messageSendingRequest: MessageSendingRequest
        ): MessagesListResponse

        suspend fun getDialogInfo(dialogInfoRequest: DialogInfoRequest): DialogInfoResponse

        /**
         * Получение списка диалогов для заданного пользователя
         */
        suspend fun getDialogList(accessToken: String): ResultDialogList
    }

    companion object {
        fun Mobile(): Mobile = IMessengerCoreImpl()
    }
}