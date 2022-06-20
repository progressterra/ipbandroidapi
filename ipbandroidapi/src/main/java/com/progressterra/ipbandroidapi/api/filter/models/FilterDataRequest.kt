package com.progressterra.ipbandroidapi.api.filter.models

import com.google.gson.annotations.SerializedName

data class FilterDataRequest(
    @SerializedName("idCategory")
    val idCategory: String
)