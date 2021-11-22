package com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.shop

import java.math.BigDecimal

internal class PaymentTokenRequest(
    val amountPayment: BigDecimal,
    val payment_token: String
)