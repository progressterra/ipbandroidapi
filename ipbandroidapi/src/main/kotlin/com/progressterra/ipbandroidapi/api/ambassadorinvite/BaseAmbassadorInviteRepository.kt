package com.progressterra.ipbandroidapi.api.ambassadorinvite

import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.AmbassadorInviteData
import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.InvitedData
import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.InvitingMembersRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseAmbassadorInviteRepository(
    private val cloudDataSource: AmbassadorInviteCloudDataSource
) : AbstractRepository(), AmbassadorInviteRepository {

    override suspend fun getInviteInfo(accessToken: String): Result<AmbassadorInviteData> = handle {
        val response = cloudDataSource.getInviteInfo(accessToken)
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
        val response = cloudDataSource.sendInvites(InvitingMembersRequest(accessTokenAmbassador, listPhones))
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        InvitedData(it.dataInviteByPhone)
    }
}