package com.progressterra.ipbandroidapi.api.message.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param status
 * @param message
 * @param messageDev
 * @param codeResult
 * @param duration
 * @param idLog
 */
data class ResultOperation(

    @SerializedName("status")
    val status: StatusResult? = null,

    @SerializedName("message")
    val message: String? = null,

    @SerializedName("messageDev")
    val messageDev: String? = null,

    @SerializedName("codeResult")
    val codeResult: Int? = null,

    @SerializedName("duration")
    val duration: Double? = null,

    @SerializedName("idLog")
    val idLog: String? = null
)