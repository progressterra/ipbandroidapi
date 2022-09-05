package com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.payment

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class GetOrderStatusResponse(
    @SerializedName("orderStatus") val orderStatus: OrderStatus? = null
) : BaseResponse()

enum class OrderStatus(val value: Int) {
    @SerializedName("0")
    REG_WITHOUT_PAY(0),
    @SerializedName("1")
    PAYMENT_ON_HOLD(1),
    @SerializedName("2")
    FULL_AUTH_OF_PAY(2),
    @SerializedName("3")
    AUTH_CANCELED(3),
    @SerializedName("4")
    AUTH_RETURNED(4),
    @SerializedName("5")
    AUTH_INIT_ACS_BANK(5),
    @SerializedName("6")
    AUTH_REJECTED(6)
}