package com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class MediaDataResponse(
    @SerializedName("data")
    val mediaData: MediaData? = null
) : BaseResponse()