package com.progressterra.ipbandroidapi.api.iecommerce.youmoney

import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model.PaymentTokenRequest
import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model.YooMoneyConfirmationResponse
import com.progressterra.ipbandroidapi.base.BaseResponse
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

internal interface YouMoneyCloudDataSource {

    suspend fun sendYooMoneyToken(
        accessToken: String,
        data: PaymentTokenRequest
    ): YooMoneyConfirmationResponse

    suspend fun getPaymentConfirmation(cartId: String): BaseResponse

    class Base(private val service: YouMoneyService, handleException: HandleException) :
        AbstractCloudDataSource(handleException), YouMoneyCloudDataSource {

        override suspend fun sendYooMoneyToken(
            accessToken: String,
            data: PaymentTokenRequest
        ): YooMoneyConfirmationResponse = handle {
            service.sendYooMoneyToken(accessToken, data)
        }

        override suspend fun getPaymentConfirmation(cartId: String): BaseResponse = handle {
            service.getPaymentConfirmation(cartId)
        }
    }
}