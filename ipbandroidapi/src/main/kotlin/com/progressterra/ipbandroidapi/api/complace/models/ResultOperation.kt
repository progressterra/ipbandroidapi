package com.progressterra.ipbandroidapi.api.complace.models

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
 * @param xRequestId
 */
data class ResultOperation(

    @SerializedName("status") val status: StatusResult? = null,

    @SerializedName("message") val message: String? = null,

    @SerializedName("messageDev") val messageDev: String? = null,

    @SerializedName("codeResult") val codeResult: Int? = null,

    @SerializedName("duration") val duration: Double? = null,

    @SerializedName("idLog") val idLog: java.util.UUID? = null,

    @SerializedName("x-request-id") val xRequestId: String? = null
)
