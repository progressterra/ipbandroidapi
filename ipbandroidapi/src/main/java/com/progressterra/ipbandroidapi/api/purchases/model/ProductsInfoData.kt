package com.progressterra.ipbandroidapi.api.purchases.model

data class ProductsInfoData(
    val addedBonusesSum: Double,
    val beginPrice: Double,
    val price: Double,
    val productId: String,
    val productImageDataJson: String,
    val productName: String,
    val spentBonusesSum: Int
) {

    internal constructor(data: ProductsInfoRaw?) : this(
        data?.addedBonusesSum ?: 0.0,
        data?.beginPrice ?: 0.0,
        data?.price ?: 0.0,
        data?.productId ?: "",
        data?.productImageDataJson ?: "",
        data?.productName ?: "",
        data?.spentBonusesSum ?: 0
    )
}
