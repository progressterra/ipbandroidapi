package com.progressterra.ipbandroidapi.api.messages

import com.progressterra.ipbandroidapi.api.messages.model.NotificationData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BaseMessagesRepository(
    handleException: HandleException,
    private val service: MessagesService
) : AbstractRepository(handleException), MessagesRepository {

    override suspend fun getInAppMessages(accessToken: String): Result<List<NotificationData>> =
        handle {
            val response = service.getInAppMessages(accessToken)
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map { data -> data.dataList?.map { NotificationData(it) } ?: emptyList() }

    override suspend fun setMessageIsRead(idMessage: String): Result<Unit> = handle {
        val response = service.setMessageIsRead(idMessage)
        if (response.status != 0)
            throw BadRequestException()
    }
}