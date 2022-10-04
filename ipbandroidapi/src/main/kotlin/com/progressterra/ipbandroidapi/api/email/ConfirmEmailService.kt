package com.progressterra.ipbandroidapi.api.email

import com.progressterra.ipbandroidapi.api.email.model.ConfirmEmailRequest
import com.progressterra.ipbandroidapi.base.BaseResponse
import retrofit2.http.Body
import retrofit2.http.POST

internal interface ConfirmEmailService {

    @POST("/api/v3/gamification/emailconfirm/sendlink")
    suspend fun confirmEmail(
        @Body confirmEmailRequest: ConfirmEmailRequest
    ): BaseResponse
}