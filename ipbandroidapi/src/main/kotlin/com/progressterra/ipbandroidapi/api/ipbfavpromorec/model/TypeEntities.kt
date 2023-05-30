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

    @SerializedName("0")
    ZERO,

    @SerializedName("1")
    ONE,

    @SerializedName("2")
    TWO,

    @SerializedName("3")
    THREE,

    @SerializedName("4")
    FOUR,

    @SerializedName("5")
    FIVE,

    @SerializedName("6")
    SIX;
}

