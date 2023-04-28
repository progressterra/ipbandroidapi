package com.progressterra.ipbandroidapi.api.ipbmediadata.model

import com.google.gson.annotations.SerializedName

data class RGEntitytMediaDataViewModelResultData(

    @SerializedName("result") val result: ResultOperation? = null,

    @SerializedName("data") val data: RGEntitytMediaDataViewModel? = null,

    @SerializedName("totalNumberRecords") val totalNumberRecords: Int? = null
)
