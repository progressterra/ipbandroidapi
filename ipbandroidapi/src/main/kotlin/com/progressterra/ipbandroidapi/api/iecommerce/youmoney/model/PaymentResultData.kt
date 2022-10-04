package com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model

data class PaymentResultData(
    val confirmation: ConfirmationData,
    val userMessage: String
) {

    internal constructor(data: YooMoneyConfirmationResponse.Data?) : this(
        ConfirmationData(data?.confirmation),
        data?.userMessage ?: ""
    )
}
