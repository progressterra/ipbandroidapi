package com.progressterra.ipbandroidapi.api.iecommerce.core

import com.progressterra.ipbandroidapi.api.iecommerce.model.CatalogItem
import com.progressterra.ipbandroidapi.api.iecommerce.model.ProductPage
import com.progressterra.ipbandroidapi.api.iecommerce.model.ProductSet
import com.progressterra.ipbandroidapi.api.iecommerce.model.RFCatalog

interface IECommerceCoreRepository {

    suspend fun getProductSizeSet(
        artikul: String, idFeature: String
    ): Result<ProductSet?>

    suspend fun getProductsByIds(
        accessToken: String, idsList: List<String>
    ): Result<ProductPage?>

    suspend fun getProductDetailByIDRG(
        idrgGoodsInventory: String
    ): Result<ProductPage?>

    suspend fun getProductsByCategory(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPage?>

    suspend fun searchProductsByCategory(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPage?>

    suspend fun searchProductsByCategoryCollapsed(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPage?>

    suspend fun getProductsByCategoryCollapsed(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPage?>

    suspend fun getProductByNomenklatura(
        nomenclatura: String, idrfShop: String
    ): Result<ProductPage?>

    suspend fun getPartnersGoods(
        idShop: String, idEnterprise: String, pageNumber: Int, pageSize: Int
    ): Result<ProductPage?>

    suspend fun getCatalog(accessToken: String): Result<List<CatalogItem>?>

    suspend fun getCategoryInfo(ids: List<String>): Result<List<RFCatalog>?>
}