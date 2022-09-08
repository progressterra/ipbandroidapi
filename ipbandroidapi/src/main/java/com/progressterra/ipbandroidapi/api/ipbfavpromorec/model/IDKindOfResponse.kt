package com.progressterra.ipbandroidapi.api.ipbfavpromorec.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class IDKindOfResponse(
    @SerializedName("dataList") val dataList: List<String>?
) : BaseResponse()