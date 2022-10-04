package com.progressterra.ipbandroidapi.api.iecommerce.core.model

import com.google.gson.annotations.SerializedName

internal data class CatalogItemRaw(
    @SerializedName("item") val item: RFCatalogRaw?,
    @SerializedName("childItems") val childItems: List<CatalogItemRaw>?,
    @SerializedName("totalQuantity") val total: Int?,
    @SerializedName("tottalCount") val totalCount: Int?
)