package com.progressterra.ipbandroidapi.api.sizetable.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

data class SizeTableResponse(
    @SerializedName("data")
    val tableUrl: String?
) : BaseResponse()