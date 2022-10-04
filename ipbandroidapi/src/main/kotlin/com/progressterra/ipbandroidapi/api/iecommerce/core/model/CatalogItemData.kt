package com.progressterra.ipbandroidapi.api.iecommerce.core.model

data class CatalogItemData(
    val item: RFCatalogData,
    val childItems: List<CatalogItemData>,
    val total: Int,
    val totalCount: Int
) {

    internal constructor(data: CatalogItemRaw?) : this(
        RFCatalogData(data?.item),
        data?.childItems?.map { CatalogItemData(it) } ?: emptyList(),
        data?.total ?: 0,
        data?.totalCount ?: 0
    )
}
