package com.progressterra.ipbandroidapi.api.messenger

import com.progressterra.ipbandroidapi.api.messenger.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.messenger.models.IncomeDataForCreateDialog
import com.progressterra.ipbandroidapi.api.messenger.models.RGDialogsViewModel
import com.progressterra.ipbandroidapi.api.messenger.models.RGMessages
import com.progressterra.ipbandroidapi.api.messenger.models.RGMessagesEntity
import com.progressterra.ipbandroidapi.api.messenger.models.RGMessagesEntityCreate
import com.progressterra.ipbandroidapi.api.messenger.models.RGMessagesViewModel
import com.progressterra.ipbandroidapi.api.messenger.models.StatusResult
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

interface MessengerRepository {

    suspend fun clientAreaMessage(
        accessToken: String,
        body: RGMessagesEntityCreate
    ): Result<RGMessagesViewModel?>

    suspend fun clientAreaDialog(
        accessToken: String,
        body: IncomeDataForCreateDialog
    ): Result<RGDialogsViewModel?>

    suspend fun clientAreaDialogList(
        accessToken: String,
        body: FilterAndSort
    ): Result<List<RGDialogsViewModel>?>

    suspend fun postMessage(
        accessToken: String,
        body: RGMessagesEntity
    ): Result<RGMessagesViewModel?>

    suspend fun patchMessage(
        accessToken: String,
        body: RGMessages
    ): Result<RGMessagesViewModel?>

    suspend fun entityById(
        accessToken: String,
        idEntity: String
    ): Result<RGMessagesViewModel?>

    suspend fun messageList(
        accessToken: String,
        body: FilterAndSort
    ): Result<List<RGMessages>?>

    class Base(
        handleException: HandleException,
        private val service: MessengerService
    ) : MessengerRepository, AbstractRepository(handleException) {

        override suspend fun clientAreaMessage(
            accessToken: String,
            body: RGMessagesEntityCreate
        ): Result<RGMessagesViewModel?> = handle {
            val response = service.clientAreaMessage(accessToken, body)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun clientAreaDialog(
            accessToken: String,
            body: IncomeDataForCreateDialog
        ): Result<RGDialogsViewModel?> = handle {
            val response = service.clientAreaDialog(accessToken, body)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun clientAreaDialogList(
            accessToken: String,
            body: FilterAndSort
        ): Result<List<RGDialogsViewModel>?> = handle {
            val response = service.clientAreaDialogList(accessToken, body)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.dataList
        }

        override suspend fun postMessage(
            accessToken: String,
            body: RGMessagesEntity
        ): Result<RGMessagesViewModel?> = handle {
            val response = service.postMessage(accessToken, body)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun patchMessage(
            accessToken: String,
            body: RGMessages
        ): Result<RGMessagesViewModel?> = handle {
            val response = service.patchMessage(accessToken, body)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun entityById(
            accessToken: String,
            idEntity: String
        ): Result<RGMessagesViewModel?> = handle {
            val response = service.entityById(accessToken, idEntity)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun messageList(
            accessToken: String,
            body: FilterAndSort
        ): Result<List<RGMessages>?> = handle {
            val response = service.messageList(accessToken, body)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.dataList
        }
    }
}