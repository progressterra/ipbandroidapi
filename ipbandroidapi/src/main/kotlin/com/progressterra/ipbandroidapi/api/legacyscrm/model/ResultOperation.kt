package com.progressterra.ipbandroidapi.api.legacyscrm.model

import com.google.gson.annotations.SerializedName

data class ResultOperation (

    @SerializedName("status")
    val status: Int? = null,

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

