package com.progressterra.ipbandroidapi.api.ambassadorinvite

import com.progressterra.ipbandroidapi.api.ambassadorinvite.models.DataInviteByPhone
import com.progressterra.ipbandroidapi.api.ambassadorinvite.models.IncomeDataInviteByPhone
import com.progressterra.ipbandroidapi.api.ambassadorinvite.models.InviteData
import com.progressterra.ipbandroidapi.api.ambassadorinvite.models.StatusResult
import com.progressterra.ipbandroidapi.core.BadRequestException

internal class BaseAmbassadorInviteRepository(
    private val service: AmbassadorInviteService
) : AmbassadorInviteRepository {

    override suspend fun getInviteInfo(accessToken: String): Result<InviteData?> = runCatching {
        val response = service.getInviteInfo(accessToken)
        if (response.result?.status != StatusResult.ZERO)
            throw BadRequestException()
        response.data
    }

    override suspend fun sendInvites(
        invitingMembersRequest: IncomeDataInviteByPhone
    ): Result<DataInviteByPhone?> = runCatching {
        val response = service.sendInvites(invitingMembersRequest)
        if (response.result?.status != StatusResult.ZERO)
            throw BadRequestException()
        response.data
    }
}