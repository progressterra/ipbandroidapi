package com.progressterra.ipbandroidapi.api.ambassadorinvite

import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.AmbassadorInviteData
import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.InvitedData
import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.InvitingMembersRequest
import com.progressterra.core.AbstractRepository
import com.progressterra.core.BadRequestException
import com.progressterra.core.HandleException

internal class BaseAmbassadorInviteRepository(
    handleException: HandleException,
    private val service: AmbassadorInviteService
) : AbstractRepository(handleException), AmbassadorInviteRepository {

    override suspend fun getInviteInfo(accessToken: String): Result<AmbassadorInviteData> = handle {
        val response = service.getInviteInfo(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        AmbassadorInviteData(it.inviteData)
    }

    override suspend fun sendInvites(
        accessTokenAmbassador: String,
        listPhones: List<String>
    ): Result<InvitedData> = handle {
        val response = service.sendInvites(InvitingMembersRequest(accessTokenAmbassador, listPhones))
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        InvitedData(it.dataInviteByPhone)
    }
}