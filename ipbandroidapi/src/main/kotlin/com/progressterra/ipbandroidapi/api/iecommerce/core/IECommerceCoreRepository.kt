package com.progressterra.ipbandroidapi.api.iecommerce.core

import com.progressterra.ipbandroidapi.api.iecommerce.core.model.CatalogData
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.CatalogItemData
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.ProductPageData
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.ProductSetData

interface IECommerceCoreRepository {

    suspend fun getProductSizeSet(artikul: String, idFeature: String): Result<ProductSetData>

    suspend fun getProductsByIds(accessToken: String, idsList: List<String>): Result<ProductPageData>

    suspend fun getProductDetailByIDRG(idrgGoodsInventory: String): Result<ProductPageData>

    suspend fun getProductsByCategory(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPageData>

    suspend fun searchProductsByCategory(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPageData>

    suspend fun searchProductsByCategoryCollapsed(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPageData>

    suspend fun getProductsByCategoryCollapsed(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPageData>

    suspend fun getProductByNomenklatura(nomenclatura: String, idrfShop: String): Result<ProductPageData>

    suspend fun getPartnersGoods(
        idShop: String,
        idEnterprise: String,
        pageNumber: Int,
        pageSize: Int
    ): Result<ProductPageData>

    suspend fun getCatalog(accessToken: String): Result<List<CatalogItemData>>

    suspend fun getCategoryInfo(ids: List<String>): Result<List<CatalogData>>
}