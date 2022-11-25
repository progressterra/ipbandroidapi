package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

enum class StatusOrder(val value: Int) {
    @SerializedName("0")
    ORDER(0),
    @SerializedName("1")
    CONFIRM_FROM_STORE(1),
    @SerializedName("2")
    CONFIRM_FROM_CALL_CENTER(2),
    @SerializedName("3")
    SENT_TO_WAREHOUSE(3),
    @SerializedName("4")
    SENT_DELIVERY_SERVICE(4),
    @SerializedName("5")
    ON_PICK_UP_POINT(5),
    @SerializedName("6")
    DELIVERED(6),
    @SerializedName("7")
    CANCELED(7)
}