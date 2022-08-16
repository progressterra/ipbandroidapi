package com.progressterra.ipbandroidapi.api.iecommerscoreapi.models

import com.google.gson.annotations.SerializedName

data class ImplementBonusRequest(
    @SerializedName("sumPaymentBonus") val bonusCount: Int
)