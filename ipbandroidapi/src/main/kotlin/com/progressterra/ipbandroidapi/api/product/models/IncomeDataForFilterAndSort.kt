package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param filterAndSortData
 * @param idCategory
 */

data class IncomeDataForFilterAndSort(

    @SerializedName("filterAndSortData")
    val filterAndSortData: FilterAndSort? = null,

    @SerializedName("idCategory")
    val idCategory: String? = null

)

