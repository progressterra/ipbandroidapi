package com.progressterra.ipbandroidapi.api.ambassadorinvite

import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.AmbassadorInviteDataResponse
import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.InviteByPhoneResponse
import com.progressterra.ipbandroidapi.api.ambassadorinvite.model.InvitingMembersRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * [Docs](http://84.201.188.117:5027/docsapi/v1/index.html)
 */
internal interface AmbassadorInviteService {

    @GET("/ambassadorinvite/invitedata/{AccessToken}")
    suspend fun getInviteInfo(@Path("AccessToken") accessToken: String): AmbassadorInviteDataResponse

    @POST("/ambassadorinvite/invitebyhpone")
    suspend fun sendInvites(@Body invitingMembersRequest: InvitingMembersRequest): InviteByPhoneResponse
}