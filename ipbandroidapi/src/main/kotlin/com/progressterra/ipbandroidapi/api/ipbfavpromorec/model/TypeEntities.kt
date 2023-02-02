package com.progressterra.ipbandroidapi.api.ipbfavpromorec.model

import com.google.gson.annotations.SerializedName

/**
 * 0 - ENTERPRISE
 * 1 - PRODUCT
 * 2 - OFFER
 * 3 - POST
 * ???
 */
enum class TypeEntities {

    @SerializedName(value = "0")
    ZERO,

    @SerializedName(value = "1")
    ONE,

    @SerializedName(value = "2")
    TWO,

    @SerializedName(value = "3")
    THREE,

    @SerializedName(value = "4")
    FOUR,

    @SerializedName(value = "5")
    FIVE,

    @SerializedName(value = "6")
    SIX;
}

