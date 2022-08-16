package com.progressterra.ipbandroidapi.api.ipbfavpromoreccore.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

data class IDKindOfResponse(
    @SerializedName("dataList") val dataList: List<String>? = null
) : BaseResponse()