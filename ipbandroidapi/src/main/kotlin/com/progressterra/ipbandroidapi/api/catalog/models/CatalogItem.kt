package com.progressterra.ipbandroidapi.api.catalog.models

import com.google.gson.annotations.SerializedName

/**
 * Элемент каталога
 *
 * @param itemCategory 
 * @param listChildItems Список дочерних элементов каталога
 */


data class CatalogItem (

    @SerializedName("itemCategory")
    val itemCategory: RFCatalogCategoryViewModel? = null,

    /* Список дочерних элементов каталога */
    @SerializedName("listChildItems")
    val listChildItems: List<CatalogItem>? = null

)

