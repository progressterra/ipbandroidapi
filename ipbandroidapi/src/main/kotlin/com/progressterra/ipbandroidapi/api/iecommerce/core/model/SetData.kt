package com.progressterra.ipbandroidapi.api.iecommerce.core.model

data class SetData(
    val idrgGoodsInventory: String,
    val name: String
) {

    internal constructor(data: SetRaw?) : this(
        data?.idrgGoodsInventory ?: "",
        data?.name ?: ""
    )
}
