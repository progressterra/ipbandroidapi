package com.progressterra.ipbandroidapi.api.color.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.filter.models.FilterColor
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ColorResponse(
    @SerializedName("dataList")
    val data: List<FilterColor>
) : BaseResponse()
