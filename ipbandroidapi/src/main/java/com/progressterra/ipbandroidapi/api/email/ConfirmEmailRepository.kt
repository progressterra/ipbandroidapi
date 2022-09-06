package com.progressterra.ipbandroidapi.api.email

import com.progressterra.ipbandroidapi.api.email.model.ConfirmEmailRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

interface ConfirmEmailRepository {

    suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): Result<Unit>

    class Base(
        private val cloudDataSource: ConfirmEmailCloudDataSource
    ) : ConfirmEmailRepository, AbstractRepository() {

        override suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): Result<Unit> =
            handle {
                val response = cloudDataSource.confirmEmail(confirmEmailRequest)
                if (response.result?.status != 0)
                    throw BadRequestException()
            }
    }
}