package com.progressterra.ipbandroidapi.api.ipbcollaborationcoreapi.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class ResultListEnterpriseData(
    @SerializedName("dataList") val dataList: List<RGEnterpriseData>? = null
) : BaseResponse()