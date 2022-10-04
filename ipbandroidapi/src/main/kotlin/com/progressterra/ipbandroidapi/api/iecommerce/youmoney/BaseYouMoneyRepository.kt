package com.progressterra.ipbandroidapi.api.iecommerce.youmoney

import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model.PaymentResultData
import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model.PaymentTokenRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseYouMoneyRepository(
    private val cloudDataSource: YouMoneyCloudDataSource
) : AbstractRepository(), YouMoneyRepository {

    override suspend fun sendYooMoneyToken(
        accessToken: String,
        amountPayment: Double,
        paymentToken: String
    ): Result<PaymentResultData> = handle {
        val response = cloudDataSource.sendYooMoneyToken(
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
        val response = cloudDataSource.getPaymentConfirmation(cartId)
        if (response.status != 0)
            throw BadRequestException()
    }
}