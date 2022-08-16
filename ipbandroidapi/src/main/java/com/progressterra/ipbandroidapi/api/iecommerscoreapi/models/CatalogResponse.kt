package com.progressterra.ipbandroidapi.api.iecommerscoreapi.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

data class CatalogResponse(
    @SerializedName("dataList") val data: List<CatalogItem>? = null
) : BaseResponse()

data class CatalogItem(
    @SerializedName("item") val item: RFCatalog? = null,
    @SerializedName("childItems") val childItems: List<CatalogItem>? = null,
    @SerializedName("totalQuantity") val total: Int? = null,
    @SerializedName("tottalCount") val totalCount: Int? = null
)

data class RFCatalog(
    @SerializedName("idUnique") val idUnique: String? = null,
    @SerializedName("idEnterprise") val idEnterprise: String? = null,
    @SerializedName("displaying") val displaying: Int? = null,
    @SerializedName("catalogType") val catalogType: Int? = null,
    @SerializedName("formatViewProductType") val formatViewProductType: Int? = null,
    @SerializedName("lastLoadDate") val lastLoadDate: String? = null,
    @SerializedName("intID") val intID: Int? = null,
    @SerializedName("idParentCategory") val idParentCategory: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("urlImage") val urlImage: String? = null,
    @SerializedName("order") val order: Int? = null
)