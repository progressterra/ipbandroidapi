package com.progressterra.ipbandroidapi.api.purchases.model

data class PurchaseDetailsData(
    val productsInfo: List<ProductsInfoData>,
    val purchaseDate: String,
    val purchaseId: String,
    val purchaseSum: Int,
    val shopName: String,
    val number: String,
    val address: String
) {

    internal constructor(data: PurchaseDetailsResponse.Data?) : this(
        data?.productsInfo?.map { ProductsInfoData(it) } ?: emptyList(),
        data?.purchaseDate ?: "",
        data?.purchaseId ?: "",
        data?.purchaseSum ?: 0,
        data?.shopName ?: "",
        data?.number ?: "",
        data?.address ?: ""
    )
}
