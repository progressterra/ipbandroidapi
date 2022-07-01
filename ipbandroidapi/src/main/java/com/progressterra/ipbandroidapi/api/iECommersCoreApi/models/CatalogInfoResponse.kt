package com.progressterra.ipbandroidapi.api.iECommersCoreApi.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class CatalogInfoResponse(
    @SerializedName("dataList")
    val dataList: List<CatalogInfo>
) : BaseResponse()
