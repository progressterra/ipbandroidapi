package com.progressterra.ipbandroidapi.api.iecommerscoreapi.models

import com.google.gson.annotations.SerializedName

data class SetDeliveryCommentaryRequest(
    @SerializedName("comment") val commentary: String
)
