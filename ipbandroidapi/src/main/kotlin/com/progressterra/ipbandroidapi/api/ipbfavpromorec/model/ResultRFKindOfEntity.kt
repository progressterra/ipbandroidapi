package com.progressterra.ipbandroidapi.api.ipbfavpromorec.model

import com.google.gson.annotations.SerializedName

data class ResultRFKindOfEntity (

    @SerializedName("result")
    val result: ResultOperation?,

    @SerializedName("data")
    val data: RFKindOfEntity?
)

