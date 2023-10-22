package com.progressterra.ipbandroidapi.api.iamhere.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param result
 * @param `data`
 * @param totalNumberRecords
 */


data class RGConnectViewModelResultData(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: RGConnectViewModel? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: kotlin.Int? = null

)

