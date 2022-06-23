package com.progressterra.ipbandroidapi.api.filter.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FilterData(
    @SerializedName(COLORS_NAME)
    val color: List<FilterColor?>?,
    @SerializedName(COLLECTIONS_NAME)
    val collections: List<String?>?,
    @SerializedName(TYPES_NAME)
    val types: List<String?>?,
    @SerializedName(SIZES_NAME)
    val sizes: List<String?>?
) : Parcelable {

    companion object {

        const val SIZES_NAME = "sizeOfGoods"

        const val COLLECTIONS_NAME = "collection"

        const val TYPES_NAME = "typeOfGoods"

        const val COLORS_NAME = "color"
    }
}