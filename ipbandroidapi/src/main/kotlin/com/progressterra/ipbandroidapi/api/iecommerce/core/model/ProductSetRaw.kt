package com.progressterra.ipbandroidapi.api.iecommerce.core.model

import com.google.gson.annotations.SerializedName

internal data class ProductSetRaw(
    @SerializedName("dataList") val dataList: List<RGGoodsInventoryExtRaw>?,
    @SerializedName("listDataSets") val dataSets: List<SetRaw>?
)