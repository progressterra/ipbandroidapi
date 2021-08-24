package com.progressterra.ipbandroidapi.remoteData.ipbFavPromoRecCore.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class IDKindOfResponse(
    @SerializedName("dataList") val dataList: List<String>? = null
) : BaseResponse()