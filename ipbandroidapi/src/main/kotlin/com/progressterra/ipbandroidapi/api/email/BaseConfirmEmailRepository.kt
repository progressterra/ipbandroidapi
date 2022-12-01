package com.progressterra.ipbandroidapi.api.email

import com.progressterra.ipbandroidapi.api.email.model.ConfirmEmailRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

internal class BaseConfirmEmailRepository(
    handleException: HandleException,
    private val service: ConfirmEmailService
) : ConfirmEmailRepository, AbstractRepository(handleException) {

    override suspend fun confirmEmail(accessToken: String, email: String): Result<Unit> =
        handle {
            val response = service.confirmEmail(ConfirmEmailRequest(accessToken, email))
            if (response.result?.status != 0)
                throw BadRequestException()
        }
}