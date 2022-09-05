package com.progressterra.ipbandroidapi.api.ipbmediadatacore.models


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class MediaDataResponse(
    @SerializedName("data")
    val mediaData: MediaData? = null
) : BaseResponse()