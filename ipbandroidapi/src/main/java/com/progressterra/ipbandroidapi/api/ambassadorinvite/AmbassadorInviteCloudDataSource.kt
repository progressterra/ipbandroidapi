package com.progressterra.ipbandroidapi.api.ambassadorinvite

import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.AmbassadorInviteDataResponse
import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.InviteByPhoneResponse
import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.InvitingMembersRequest
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

internal interface AmbassadorInviteCloudDataSource {

    suspend fun getInviteInfo(accessToken: String): AmbassadorInviteDataResponse

    suspend fun sendInvites(invitingMembersRequest: InvitingMembersRequest): InviteByPhoneResponse

    class Base(
        private val service: AmbassadorInviteService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), AmbassadorInviteCloudDataSource {

        override suspend fun getInviteInfo(accessToken: String): AmbassadorInviteDataResponse = handle {
            service.getInviteInfo(accessToken)
        }

        override suspend fun sendInvites(invitingMembersRequest: InvitingMembersRequest): InviteByPhoneResponse =
            handle {
                service.sendInvites(invitingMembersRequest)
            }
    }
}