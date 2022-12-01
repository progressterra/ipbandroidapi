package com.progressterra.message.models

import com.google.gson.annotations.SerializedName

enum class StatusResult {

    @SerializedName(value = "0")
    ZERO,

    @SerializedName(value = "1")
    ONE,

    @SerializedName(value = "2")
    TWO
}