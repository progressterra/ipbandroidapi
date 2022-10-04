package com.progressterra.ipbandroidapi.api.iecommerce.core.model

data class ProductSetData(
    val dataList: List<RGGoodsInventoryExtData>,
    val dataSets: List<SetData>?
) {

    internal constructor(data: ProductSetRaw?) : this(
        data?.dataList?.map { RGGoodsInventoryExtData(it) } ?: emptyList(),
        data?.dataSets?.map { SetData(it) } ?: emptyList()
    )
}
