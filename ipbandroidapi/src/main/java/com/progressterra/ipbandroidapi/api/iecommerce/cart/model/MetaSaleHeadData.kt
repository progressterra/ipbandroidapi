package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

data class MetaSaleHeadData(
    val idUnique: String,
    val iddhSaleHead: String,
    val key: String,
    val value: String
) {

    internal constructor(data: DrMetaDHSaleHead?) : this(
        data?.idUnique ?: "",
        data?.iddhSaleHead ?: "",
        data?.key ?: "",
        data?.value ?: ""
    )
}
