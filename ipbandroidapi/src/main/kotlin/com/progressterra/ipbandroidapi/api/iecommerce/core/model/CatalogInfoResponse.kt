package com.progressterra.ipbandroidapi.api.iecommerce.core.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class CatalogInfoResponse(
    @SerializedName("dataList")
    val dataList: List<CatalogRaw>
) : BaseResponse()
