package com.progressterra.ipbandroidapi.api.auth.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param data 
 * @param totalNumberRecords 
 */


data class ResultSendCodeForClientResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: ResultSendCodeForClient? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null

)

