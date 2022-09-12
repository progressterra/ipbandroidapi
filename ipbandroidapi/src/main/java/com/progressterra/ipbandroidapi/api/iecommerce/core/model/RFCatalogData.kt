package com.progressterra.ipbandroidapi.api.iecommerce.core.model

data class RFCatalogData(
    val idUnique: String,
    val idEnterprise: String,
    val displaying: Int,
    val catalogType: Int,
    val formatViewProductType: Int,
    val lastLoadDate: String,
    val intID: Int,
    val idParentCategory: String,
    val name: String,
    val description: String,
    val urlImage: String,
    val order: Int
) {

    internal constructor(data: RFCatalogRaw?) : this(
        data?.idUnique ?: "",
        data?.idEnterprise ?: "",
        data?.displaying ?: 0,
        data?.catalogType ?: 0,
        data?.formatViewProductType ?: 0,
        data?.lastLoadDate ?: "",
        data?.intID ?: 0,
        data?.idParentCategory ?: "",
        data?.name ?: "",
        data?.description ?: "",
        data?.urlImage ?: "",
        data?.order ?: 0
    )
}
