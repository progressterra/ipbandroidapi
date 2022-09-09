package com.progressterra.ipbandroidapi.api.iecommerce.youmoney

import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model.PaymentResultData

interface YouMoneyRepository {

    suspend fun sendYooMoneyToken(
        accessToken: String,
        amountPayment: Double,
        paymentToken: String
    ): Result<PaymentResultData>

    suspend fun getPaymentConfirmation(cartId: String): Result<Unit>
}