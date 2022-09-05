package com.progressterra.ipbandroidapi.api.color.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class ColoredResponse(
    @SerializedName("data")
    val id: String?
) : BaseResponse()