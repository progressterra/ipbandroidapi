package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

enum class StatusOrder {
    @SerializedName("0")
    ORDER,
    @SerializedName("1")
    CONFIRM_FROM_STORE,
    @SerializedName("2")
    CONFIRM_FROM_CALL_CENTER,
    @SerializedName("3")
    SENT_TO_WAREHOUSE,
    @SerializedName("4")
    SENT_DELIVERY_SERVICE,
    @SerializedName("5")
    ON_PICK_UP_POINT,
    @SerializedName("6")
    DELIVERED,
    @SerializedName("7")
    CANCELED
}