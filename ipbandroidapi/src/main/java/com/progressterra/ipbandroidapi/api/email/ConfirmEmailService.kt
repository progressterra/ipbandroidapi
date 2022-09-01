package com.progressterra.ipbandroidapi.api.email

import com.progressterra.ipbandroidapi.api.scrm.models.requests.ConfirmEmailRequest
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface ConfirmEmailService {

    @POST("/api/v3/gamification/emailconfirm/sendlink")
    suspend fun confirmEmail(
        @Body confirmEmailRequest: ConfirmEmailRequest
    ): BaseResponse
}