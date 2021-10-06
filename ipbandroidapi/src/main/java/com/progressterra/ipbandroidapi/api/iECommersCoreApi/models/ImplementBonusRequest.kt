package com.progressterra.ipbandroidapi.api.iECommersCoreApi.models

import com.google.gson.annotations.SerializedName

data class ImplementBonusRequest(
    @SerializedName("sumPaymentBonus") val bonusCount: Int
)