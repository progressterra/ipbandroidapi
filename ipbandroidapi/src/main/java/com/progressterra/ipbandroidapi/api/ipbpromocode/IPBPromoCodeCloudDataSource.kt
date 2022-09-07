package com.progressterra.ipbandroidapi.api.ipbpromocode

import com.progressterra.ipbandroidapi.base.BaseResponse
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

interface IPBPromoCodeCloudDataSource {

    suspend fun setPromoCode(accessToken: String, promoCode: String): BaseResponse

    class Base(
        private val service: IPBPromoCodeService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), IPBPromoCodeCloudDataSource {

        override suspend fun setPromoCode(accessToken: String, promoCode: String): BaseResponse = handle {
            service.setPromoCode(accessToken, promoCode)
        }
    }
}