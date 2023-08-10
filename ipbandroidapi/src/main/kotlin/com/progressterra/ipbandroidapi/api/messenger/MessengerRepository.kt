package com.progressterra.ipbandroidapi.api.messenger

import com.progressterra.ipbandroidapi.api.messenger.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.messenger.models.IncomeDataForCreateDialog
import com.progressterra.ipbandroidapi.api.messenger.models.RGDialogsViewModel
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

    suspend fun clientAreaMessageList(
        accessToken: String,
        body: FilterAndSort
    ): Result<List<RGMessagesViewModel>?>

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

        override suspend fun clientAreaMessageList(
            accessToken: String,
            body: FilterAndSort
        ): Result<List<RGMessagesViewModel>?> = handle {
            val response = service.clientAreaMessageList(accessToken, body)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.dataList
        }
    }
}