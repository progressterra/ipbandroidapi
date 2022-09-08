package com.progressterra.ipbandroidapi.api.ipbmediadata.model


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class MediaDataListResponse(
    @SerializedName("dataList")
    val mediaDataList: List<MediaRaw>? = null,
) : BaseResponse()