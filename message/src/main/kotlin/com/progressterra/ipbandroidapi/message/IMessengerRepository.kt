package com.progressterra.ipbandroidapi.message

import com.progressterra.ipbandroidapi.message.models.IncomeDataGetOrCreateDialog
import com.progressterra.ipbandroidapi.message.models.IncomeMessagesTextData
import com.progressterra.ipbandroidapi.message.models.RGDialogs
import com.progressterra.ipbandroidapi.message.models.RGMessages

interface IMessengerRepository {

    suspend fun messagesList(idRgDialog: String, page: String): Result<List<RGMessages>?>

    suspend fun sendMessage(request: IncomeMessagesTextData): Result<List<RGMessages>?>

    suspend fun dialogInfo(request: IncomeDataGetOrCreateDialog): Result<RGDialogs?>

    suspend fun dialogList(accessToken: String): Result<List<RGDialogs>?>
}