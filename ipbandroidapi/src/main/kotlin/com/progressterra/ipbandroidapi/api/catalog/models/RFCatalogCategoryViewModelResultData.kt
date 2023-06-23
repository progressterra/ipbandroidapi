package com.progressterra.ipbandroidapi.api.catalog.models

import com.google.gson.annotations.SerializedName

data class RFCatalogCategoryViewModelResultData(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: RFCatalogCategoryViewModel? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null
)
