package com.progressterra.ipbandroidapi.api.iecommerce.core

import com.progressterra.ipbandroidapi.api.iecommerce.model.CatalogResult
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultListRFCatalog
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultProductSet
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultProducts

internal interface IECommerceCoreCloudDataSource {

    suspend fun getProductSizeSet(
        artikul: String, idFeature: String
    ): ResultProductSet

    suspend fun getProductsByIds(
        accessToken: String, idsList: List<String>
    ): ResultProducts

    suspend fun getProductDetailByIDRG(
        idrgGoodsInventory: String
    ): ResultProducts

    suspend fun getProductsByCategory(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ResultProducts

    suspend fun searchProductsByCategory(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ResultProducts

    suspend fun searchProductsByCategoryCollapsed(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ResultProducts

    suspend fun getProductsByCategoryCollapsed(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ResultProducts

    suspend fun getProductByNomenklatura(
        nomenclatura: String, idrfShop: String
    ): ResultProducts

    suspend fun getPartnersGoods(
        idShop: String,
        idEnterprise: String,
        pageNumber: Int,
        pageSize: Int
    ): ResultProducts

    suspend fun getCatalog(accessToken: String): CatalogResult

    suspend fun getCategoryInfo(ids: List<String>): ResultListRFCatalog
}