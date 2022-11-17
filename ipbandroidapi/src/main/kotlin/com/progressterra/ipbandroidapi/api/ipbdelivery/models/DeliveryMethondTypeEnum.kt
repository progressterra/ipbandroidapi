package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName

enum class DeliveryMethondTypeEnum(val value: Int) {

    @SerializedName(value = "0")
    ZERO(0),

    @SerializedName(value = "1")
    ONE(1),

    @SerializedName(value = "2")
    TWO(2)
}