package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

data class PaymentPositionSaleData(
    val idUnique: String,
    val iddhSaleHead: String,
    val iddrPaymentSaleHead: String,
    val iddrSaleRow: String,
    val idrfTypePaymentMethod: String,
    val relationData: String,
    val sumPayment: Int
) {

    internal constructor(data: DrPaymentPositionSale?) : this(
        data?.idUnique ?: "",
        data?.iddhSaleHead ?: "",
        data?.iddrPaymentSaleHead ?: "",
        data?.iddrSaleRow ?: "",
        data?.idrfTypePaymentMethod ?: "",
        data?.relationData ?: "",
        data?.sumPayment ?: 0
    )
}
