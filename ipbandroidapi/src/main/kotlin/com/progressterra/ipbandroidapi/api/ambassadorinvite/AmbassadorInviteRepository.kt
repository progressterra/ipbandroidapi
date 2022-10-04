package com.progressterra.ipbandroidapi.api.ambassadorinvite

import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.AmbassadorInviteData
import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.InvitedData

interface AmbassadorInviteRepository {

    suspend fun getInviteInfo(accessToken: String): Result<AmbassadorInviteData>

    suspend fun sendInvites(
        accessTokenAmbassador: String,
        listPhones: List<String>
    ): Result<InvitedData>
}