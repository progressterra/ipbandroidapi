package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param dataList
 */
data class CatalogResult(

    @SerializedName("result") val result: ResultOperation? = null,

    @SerializedName("dataList") val dataList: List<CatalogItem>? = null

)

