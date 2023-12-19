package com.progressterra.ipbandroidapi.api.checklist.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param listFields 
 * @param sort 
 * @param searchData 
 * @param skip 
 * @param take 
 */


data class FilterAndSort (

    @SerializedName("listFields")
    val listFields: List<FieldForFilter>? = null,

    @SerializedName("sort")
    val sort: SortData? = null,

    @SerializedName("searchData")
    val searchData: String? = null,

    @SerializedName("skip")
    val skip: Int? = null,

    @SerializedName("take")
    val take: Int? = null

)

