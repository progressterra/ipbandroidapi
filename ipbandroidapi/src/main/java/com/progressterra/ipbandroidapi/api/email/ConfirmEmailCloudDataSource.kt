package com.progressterra.ipbandroidapi.api.email

import com.progressterra.ipbandroidapi.api.scrm.models.requests.ConfirmEmailRequest
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.remotedata.CloudDataSource
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

interface ConfirmEmailCloudDataSource {

    suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): BaseResponse

    class Base(
        private val service: ConfirmEmailService,
        handleException: HandleException
    ) : CloudDataSource.Abstract(handleException), ConfirmEmailCloudDataSource {

        override suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): BaseResponse = handle {
            service.confirmEmail(confirmEmailRequest)
        }
    }
}