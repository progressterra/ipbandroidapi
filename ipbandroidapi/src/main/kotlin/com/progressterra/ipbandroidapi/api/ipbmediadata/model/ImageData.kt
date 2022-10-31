package com.progressterra.ipbandroidapi.api.ipbmediadata.model

import com.google.gson.annotations.SerializedName

data class ImageData(
    @SerializedName("listInfoImage") val list: List<Item>
) {

    data class Item(
        @SerializedName("URL") val url: String, @SerializedName("SizeType") val sizeType: Int
    )
}