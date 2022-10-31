package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param idEnterprise
 * @param displaying
 * @param catalogType
 * @param formatViewProductType
 * @param lastLoadDate
 * @param intID
 * @param idParentCategory
 * @param name
 * @param description
 * @param urlImage
 * @param order
 */

data class RFCatalog(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    @SerializedName("displaying")
    val displaying: Int? = null,

    @SerializedName("catalogType")
    val catalogType: Int? = null,

    @SerializedName("formatViewProductType")
    val formatViewProductType: Int? = null,

    @SerializedName("lastLoadDate")
    val lastLoadDate: String? = null,

    @SerializedName("intID")
    val intID: Int? = null,

    @SerializedName("idParentCategory")
    val idParentCategory: String? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("urlImage")
    val urlImage: String? = null,

    @SerializedName("order")
    val order: Int? = null

)

