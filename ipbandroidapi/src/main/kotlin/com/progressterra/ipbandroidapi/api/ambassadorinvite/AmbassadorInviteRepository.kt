package com.progressterra.ipbandroidapi.api.ambassadorinvite

import com.progressterra.ipbandroidapi.api.ambassadorinvite.models.DataInviteByPhone
import com.progressterra.ipbandroidapi.api.ambassadorinvite.models.IncomeDataInviteByPhone
import com.progressterra.ipbandroidapi.api.ambassadorinvite.models.InviteData

interface AmbassadorInviteRepository {

    suspend fun getInviteInfo(accessToken: String): Result<InviteData?>

    suspend fun sendInvites(invitingMembersRequest: IncomeDataInviteByPhone): Result<DataInviteByPhone?>
}