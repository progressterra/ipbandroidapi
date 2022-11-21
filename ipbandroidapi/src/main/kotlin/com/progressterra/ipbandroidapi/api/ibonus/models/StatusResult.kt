package com.progressterra.ipbandroidapi.api.ibonus.models

import com.google.gson.annotations.SerializedName

enum class StatusResult(val value: Int) {

    @SerializedName(value = "0")
    ZERO(0),

    @SerializedName(value = "1")
    ONE(1),

    @SerializedName(value = "2")
    TWO(2),

    @SerializedName(value = "3")
    THREE(3)
}

