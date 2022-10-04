package com.progressterra.ipbandroidapi.api.messages

import com.progressterra.ipbandroidapi.api.messages.model.NotificationData

interface MessagesRepository {

    suspend fun getInAppMessages(accessToken: String): Result<List<NotificationData>>

    suspend fun setMessageIsRead(idMessage: String): Result<Unit>
}