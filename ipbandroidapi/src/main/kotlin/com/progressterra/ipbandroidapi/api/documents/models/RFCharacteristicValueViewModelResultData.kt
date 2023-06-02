package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param data
 * @param totalNumberRecords
 */
data class RFCharacteristicValueViewModelResultData(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: RFCharacteristicValueViewModel? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)
