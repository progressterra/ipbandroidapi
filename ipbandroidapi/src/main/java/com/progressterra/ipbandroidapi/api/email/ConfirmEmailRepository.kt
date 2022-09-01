package com.progressterra.ipbandroidapi.api.email

import com.progressterra.ipbandroidapi.api.scrm.models.requests.ConfirmEmailRequest
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

interface ConfirmEmailRepository {

    suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): BaseResponse

    class Base(
        private val cloudDataSource: ConfirmEmailCloudDataSource
    ) : ConfirmEmailRepository {

        override suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): BaseResponse =
            cloudDataSource.confirmEmail(confirmEmailRequest)
    }
}