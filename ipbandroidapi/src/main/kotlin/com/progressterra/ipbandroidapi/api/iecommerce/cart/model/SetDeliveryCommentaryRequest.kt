package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

internal data class SetDeliveryCommentaryRequest(
    @SerializedName("comment") val commentary: String
)
