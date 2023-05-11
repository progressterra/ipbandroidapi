package com.progressterra.ipbandroidapi.api.ibonus.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param data
 * @param totalNumberRecords
 */
data class BonusTransactionResultDataList(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: List<BonusTransaction>? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

