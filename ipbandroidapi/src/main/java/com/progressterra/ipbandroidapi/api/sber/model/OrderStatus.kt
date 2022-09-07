package com.progressterra.ipbandroidapi.api.sber.model

import com.google.gson.annotations.SerializedName

enum class OrderStatus {
    @SerializedName("0")
    REG_WITHOUT_PAY,
    @SerializedName("1")
    PAYMENT_ON_HOLD,
    @SerializedName("2")
    FULL_AUTH_OF_PAY,
    @SerializedName("3")
    AUTH_CANCELED,
    @SerializedName("4")
    AUTH_RETURNED,
    @SerializedName("5")
    AUTH_INIT_ACS_BANK,
    @SerializedName("6")
    AUTH_REJECTED
}