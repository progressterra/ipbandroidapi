package com.progressterra.ipbandroidapi.api.email

import com.progressterra.ipbandroidapi.api.email.model.ConfirmEmailRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseConfirmEmailRepository(
    private val cloudDataSource: ConfirmEmailCloudDataSource
) : ConfirmEmailRepository, AbstractRepository() {


    override suspend fun confirmEmail(accessToken: String, email: String): Result<Unit> =
        handle {
            val response = cloudDataSource.confirmEmail(ConfirmEmailRequest(accessToken, email))
            if (response.result?.status != 0)
                throw BadRequestException()
        }
}