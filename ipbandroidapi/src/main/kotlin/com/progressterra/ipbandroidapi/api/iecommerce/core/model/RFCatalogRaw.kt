package com.progressterra.ipbandroidapi.api.iecommerce.core.model

import com.google.gson.annotations.SerializedName

internal data class RFCatalogRaw(
    @SerializedName("idUnique") val idUnique: String?,
    @SerializedName("idEnterprise") val idEnterprise: String?,
    @SerializedName("displaying") val displaying: Int?,
    @SerializedName("catalogType") val catalogType: Int?,
    @SerializedName("formatViewProductType") val formatViewProductType: Int?,
    @SerializedName("lastLoadDate") val lastLoadDate: String?,
    @SerializedName("intID") val intID: Int?,
    @SerializedName("idParentCategory") val idParentCategory: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("description") val description: String?,
    @SerializedName("urlImage") val urlImage: String?,
    @SerializedName("order") val order: Int?
)