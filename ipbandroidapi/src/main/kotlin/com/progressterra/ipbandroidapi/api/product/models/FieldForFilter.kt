


package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param fieldName 
 * @param listValue 
 * @param comparisonType 
 */

data class FieldForFilter (

    @SerializedName("fieldName")
    val fieldName: String? = null,

    @SerializedName("listValue")
    val listValue: List<String>? = null,

    @SerializedName("comparisonType")
    val comparisonType: TypeComparison? = null

)

