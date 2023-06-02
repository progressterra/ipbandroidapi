package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param data
 * @param totalNumberRecords
 */
data class DHDocSetFullDataResultData(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: DHDocSetFullData? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)
