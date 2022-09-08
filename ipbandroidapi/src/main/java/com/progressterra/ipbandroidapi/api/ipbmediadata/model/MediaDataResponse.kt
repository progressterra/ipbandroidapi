package com.progressterra.ipbandroidapi.api.ipbmediadata.model


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class MediaDataResponse(
    @SerializedName("data")
    val mediaData: MediaRaw? = null
) : BaseResponse()