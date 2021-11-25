package com.progressterra.ipbandroidapi.api.ipbMediaDataCore.models


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class MediaDataListResponse(
    @SerializedName("dataList")
    val mediaDataList: List<MediaData>? = null,
) : BaseResponse()