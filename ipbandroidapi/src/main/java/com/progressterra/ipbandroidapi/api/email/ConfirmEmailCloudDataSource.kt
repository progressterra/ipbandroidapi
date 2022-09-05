package com.progressterra.ipbandroidapi.api.email

import com.progressterra.ipbandroidapi.api.email.model.ConfirmEmailRequest
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.base.BaseResponse

interface ConfirmEmailCloudDataSource {

    suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): BaseResponse

    class Base(
        private val service: ConfirmEmailService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), ConfirmEmailCloudDataSource {

        override suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): BaseResponse = handle {
            service.confirmEmail(confirmEmailRequest)
        }
    }
}