package com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model

data class ConfirmationData(
    val confirmationUrl: String,
    val type: String
) {

    internal constructor(data: ConfirmationRaw?) : this(
        data?.confirmationUrl ?: "",
        data?.type ?: ""
    )
}
