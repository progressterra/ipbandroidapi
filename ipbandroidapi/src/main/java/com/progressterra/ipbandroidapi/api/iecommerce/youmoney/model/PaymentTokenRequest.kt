package com.progressterra.ipbandroidapi.api.iecommerce.youmoney.model

import com.google.gson.annotations.SerializedName

//TODO specify serialized names
internal class PaymentTokenRequest(
    @SerializedName("amountPayment")
    val amountPayment: Double,
    @SerializedName("payment_token")
    val paymentToken: String
)