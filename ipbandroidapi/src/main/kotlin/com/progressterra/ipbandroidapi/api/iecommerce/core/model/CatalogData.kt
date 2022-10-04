package com.progressterra.ipbandroidapi.api.iecommerce.core.model

data class CatalogData(
    val name: String
) {

    internal constructor(data: CatalogRaw?) : this(
        data?.name ?: ""
    )
}
