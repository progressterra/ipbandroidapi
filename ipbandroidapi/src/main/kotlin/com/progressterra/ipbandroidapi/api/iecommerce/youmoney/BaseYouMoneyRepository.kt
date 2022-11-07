package com.progressterra.ipbandroidapi.api.iecommerce.youmoney

import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model.PaymentResultData
import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model.PaymentTokenRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BaseYouMoneyRepository(
    handleException: HandleException,
    private val service: YouMoneyService
) : AbstractRepository(handleException), YouMoneyRepository {

    override suspend fun sendYooMoneyToken(
        accessToken: String,
        amountPayment: Double,
        paymentToken: String
    ): Result<PaymentResultData> = handle {
        val response = service.sendYooMoneyToken(
            accessToken,
            PaymentTokenRequest(amountPayment, paymentToken)
        )
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        PaymentResultData(it.dataResultPayment)
    }

    override suspend fun getPaymentConfirmation(cartId: String): Result<Unit> = handle {
        val response = service.getPaymentConfirmation(cartId)
        if (response.status != 0)
            throw BadRequestException()
    }
}