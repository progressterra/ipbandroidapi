package com.progressterra.ipbandroidapi.api.ipbCollaborationCoreApi.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ResultListEnterpriseData(
    @SerializedName("dataList") val dataList: List<RGEnterpriseData>? = null
) : BaseResponse()