package com.progressterra.ipbandroidapi.api.iecommerce.core.model

data class ProductPageData(
    val countItemsInPage: Int,
    val totalPage: Int,
    val numberCurrentPage: Int,
    val allQuantityItemsProducts: Int,
    val listProducts: List<RGGoodsInventoryExtData>
) {

    internal constructor(data: ProductPageRaw?) : this(
        data?.countItemsInPage ?: 0,
        data?.totalPage ?: 0,
        data?.numberCurrentPage ?: 0,
        data?.allQuantityItemsProducts ?: 0,
        data?.listProducts?.map { RGGoodsInventoryExtData(it) } ?: emptyList()
    )
}
