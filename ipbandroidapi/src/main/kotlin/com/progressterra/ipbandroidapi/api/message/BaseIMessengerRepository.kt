package com.progressterra.ipbandroidapi.api.message

import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.api.message.models.IncomeDataGetOrCreateDialog
import com.progressterra.ipbandroidapi.api.message.models.IncomeMessagesTextData
import com.progressterra.ipbandroidapi.api.message.models.RGDialogs
import com.progressterra.ipbandroidapi.api.message.models.RGMessages
import com.progressterra.ipbandroidapi.api.message.models.StatusResult


class BaseIMessengerRepository(
    private val service: IMessengerService
) : IMessengerRepository {

    override suspend fun messagesList(idRgDialog: String, page: String): Result<List<RGMessages>?> =
        runCatching {
            val response = service.messagesList(idRgDialog, page)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.dataList
        }

    override suspend fun sendMessage(request: IncomeMessagesTextData): Result<List<RGMessages>?> =
        runCatching {
            val response = service.sendMessage(request)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.dataList
        }

    override suspend fun dialogInfo(request: IncomeDataGetOrCreateDialog): Result<RGDialogs?> =
        runCatching {
            val response = service.dialogInfo(request)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.data
        }

    override suspend fun dialogList(accessToken: String): Result<List<RGDialogs>?> = runCatching {
        val response = service.dialogList(accessToken)
        if (response.result?.status != StatusResult.ZERO)
            throw BadRequestException()
        response.dataList
    }
}