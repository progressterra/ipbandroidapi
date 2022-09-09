package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

data class SetDeliveryCommentaryRequest(
    @SerializedName("comment") val commentary: String
)
