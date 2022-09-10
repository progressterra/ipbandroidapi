package com.progressterra.ipbandroidapi.api.messages

import com.progressterra.ipbandroidapi.api.messages.model.NotificationData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseMessagesRepository(
    private val cloudDataSource: MessagesCloudDataSource
) : AbstractRepository(), MessagesRepository {

    override suspend fun getInAppMessages(accessToken: String): Result<List<NotificationData>> = handle {
        val response = cloudDataSource.getInAppMessages(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { data -> data.dataList?.map { NotificationData(it) } ?: emptyList() }

    override suspend fun setMessageIsRead(idMessage: String): Result<Unit> = handle {
        val response = cloudDataSource.setMessageIsRead(idMessage)
        if (response.status != 0)
            throw BadRequestException()
    }
}