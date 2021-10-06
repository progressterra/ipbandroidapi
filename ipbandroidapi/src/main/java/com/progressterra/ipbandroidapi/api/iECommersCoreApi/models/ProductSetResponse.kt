package com.progressterra.ipbandroidapi.api.iECommersCoreApi.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ProductSetResponse(
    @SerializedName("data") val data: ProductSet? = null
) : BaseResponse()


data class ProductSet(
    @SerializedName("dataList") val dataList: List<RGGoodsInventoryExt>? = null,
    @SerializedName("listDataSets") val dataSets: List<SetData>? = null
)

data class SetData(
    @SerializedName("idrgGoodsInventory") val idrgGoodsInventory: String? = null,
    @SerializedName("name") val name: String? = null
)