package com.progressterra.ipbandroidapi.api.ipbfavpromorec.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param dataList
 */
data class ResultListIDPromo(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("dataList")
    val dataList: List<String>? = null

)

