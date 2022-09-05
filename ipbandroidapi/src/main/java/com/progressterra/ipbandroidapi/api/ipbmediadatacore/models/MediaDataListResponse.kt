package com.progressterra.ipbandroidapi.api.ipbmediadatacore.models


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class MediaDataListResponse(
    @SerializedName("dataList")
    val mediaDataList: List<MediaData>? = null,
) : BaseResponse()