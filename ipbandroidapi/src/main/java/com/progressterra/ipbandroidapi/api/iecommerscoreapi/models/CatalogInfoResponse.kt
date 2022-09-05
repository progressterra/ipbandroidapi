package com.progressterra.ipbandroidapi.api.iecommerscoreapi.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class CatalogInfoResponse(
    @SerializedName("dataList")
    val dataList: List<CatalogInfo>
) : BaseResponse()
