package com.progressterra.ipbandroidapi.api.filter.models

import com.google.gson.annotations.SerializedName

data class FilterData(
    @SerializedName("color")
    val color: List<FilterColor?>,
    @SerializedName("collection")
    val collections: List<String?>,
    @SerializedName("typeOfGoods")
    val types: List<String?>,
    @SerializedName("sizeOfGoods")
    val sizes: List<String?>
)
