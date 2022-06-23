package com.progressterra.ipbandroidapi.api.filter.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FilterData(
    @SerializedName("color")
    val color: List<FilterColor?>?,
    @SerializedName("collection")
    val collections: List<String?>?,
    @SerializedName("typeOfGoods")
    val types: List<String?>?,
    @SerializedName("sizeOfGoods")
    val sizes: List<String?>?
) : Parcelable