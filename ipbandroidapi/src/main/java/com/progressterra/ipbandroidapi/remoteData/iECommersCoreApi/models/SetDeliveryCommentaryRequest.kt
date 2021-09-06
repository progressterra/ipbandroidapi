package com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models

import com.google.gson.annotations.SerializedName

data class SetDeliveryCommentaryRequest(
    @SerializedName("comment") val commentary: String
)
