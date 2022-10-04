package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

data class DiscountPositionData(
    val idUnique: String,
    val iddhSaleHead: String,
    val iddrDiscountSaleHead: String,
    val iddrSaleRow: String,
    val idrfTypeDiscount: String,
    val percentValue: Int,
    val reasonDiscounts: String,
    val sumDiscount: Int,
    val sumValue: Int,
    val typeDiscount: Int
) {

    internal constructor(data: DrDiscountPosition?) : this(
        data?.idUnique ?: "",
        data?.iddhSaleHead ?: "",
        data?.iddrDiscountSaleHead ?: "",
        data?.iddrSaleRow ?: "",
        data?.idrfTypeDiscount ?: "",
        data?.percentValue ?: 0,
        data?.reasonDiscounts ?: "",
        data?.sumDiscount ?: 0,
        data?.sumValue ?: 0,
        data?.typeDiscount ?: 0
    )
}
