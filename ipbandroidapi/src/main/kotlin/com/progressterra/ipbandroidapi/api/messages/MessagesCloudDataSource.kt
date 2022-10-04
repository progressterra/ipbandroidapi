package com.progressterra.ipbandroidapi.api.messages

import com.progressterra.ipbandroidapi.api.messages.model.NotificationsResponse
import com.progressterra.ipbandroidapi.base.BaseResponse
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

internal interface MessagesCloudDataSource {

    suspend fun getInAppMessages(accessToken: String): NotificationsResponse

    suspend fun setMessageIsRead(idMessage: String): BaseResponse

    class Base(
        private val service: MessagesService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), MessagesCloudDataSource {

        override suspend fun getInAppMessages(accessToken: String): NotificationsResponse = handle {
            service.getInAppMessages(accessToken)
        }

        override suspend fun setMessageIsRead(idMessage: String): BaseResponse = handle {
            service.setMessageIsRead(idMessage)
        }
    }
}