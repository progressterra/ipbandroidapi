package com.progressterra.ipbandroidapi.api.email

import com.progressterra.ipbandroidapi.api.email.model.ConfirmEmailRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository

interface ConfirmEmailRepository {

    suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): Result<Boolean>

    class Base(
        private val cloudDataSource: ConfirmEmailCloudDataSource
    ) : ConfirmEmailRepository, AbstractRepository() {

        override suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): Result<Boolean> =
            handle {
                cloudDataSource.confirmEmail(confirmEmailRequest)
            }.map { it.result?.status == 0 }
    }
}