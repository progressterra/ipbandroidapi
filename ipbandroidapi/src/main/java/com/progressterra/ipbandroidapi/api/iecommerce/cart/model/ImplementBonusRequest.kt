package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

data class ImplementBonusRequest(
    @SerializedName("sumPaymentBonus") val bonusCount: Int
)