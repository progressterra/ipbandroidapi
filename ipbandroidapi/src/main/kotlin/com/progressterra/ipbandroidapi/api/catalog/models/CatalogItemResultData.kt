package com.progressterra.ipbandroidapi.api.catalog.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data 
 * @param totalNumberRecords 
 */


data class CatalogItemResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: CatalogItem? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

