package com.progressterra.ipbandroidapi.api.filter.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FilterColor(
    @SerializedName("url")
    val url: String?,
    @SerializedName("hexCode")
    val hexCode: String?,
    @SerializedName("colorName")
    val colorName: String?
) : Parcelable