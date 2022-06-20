package com.progressterra.ipbandroidapi.api.filter.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class FilterDataResponse(
    @SerializedName("data")
    val data: FilterData
) : BaseResponse()