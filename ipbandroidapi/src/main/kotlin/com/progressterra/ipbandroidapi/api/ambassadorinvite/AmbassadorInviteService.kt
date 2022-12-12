package com.progressterra.ipbandroidapi.api.ambassadorinvite

import com.progressterra.ipbandroidapi.api.ambassadorinvite.models.IncomeDataInviteByPhone
import com.progressterra.ipbandroidapi.api.ambassadorinvite.models.ResultAmbassadorInviteData
import com.progressterra.ipbandroidapi.api.ambassadorinvite.models.ResultInviteByPhone
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * [Docs](http://84.201.188.117:5027/docsapi/v1/index.html)
 */
internal interface AmbassadorInviteService {

    @GET("/ambassadorinvite/invitedata/{AccessToken}")
    suspend fun getInviteInfo(@Path("AccessToken") accessToken: String): ResultAmbassadorInviteData

    @POST("/ambassadorinvite/invitebyhpone")
    suspend fun sendInvites(@Body invitingMembersRequest: IncomeDataInviteByPhone): ResultInviteByPhone
}