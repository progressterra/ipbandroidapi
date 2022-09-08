package com.progressterra.ipbandroidapi.api.ambassadorinvite

import com.progressterra.ipbandroidapi.api.ambassador.models.AmbassadorInviteDataResponse
import com.progressterra.ipbandroidapi.api.ambassador.models.InviteByPhoneResponse
import com.progressterra.ipbandroidapi.api.ambassador.models.InvitingMembersRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface AmbassadorInviteService {

    /**
     * получить текст и персональный код приглашения для отправки контактам
     */
    @GET("/ambassadorinvite/invitedata/{AccessToken}")
    suspend fun getInviteInfo(@Path("AccessToken") accessToken: String): AmbassadorInviteDataResponse

    /**
     * отправить приглашение на список номеров телефонов для вступления в программу лояльности
     */
    @POST("/ambassadorinvite/invitebyhpone")
    suspend fun sendInvites(@Body invitingMembersRequest: InvitingMembersRequest): InviteByPhoneResponse
}