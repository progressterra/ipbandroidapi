package com.progressterra.ipbandroidapi.api.iecommerce.core

import com.progressterra.ipbandroidapi.api.iecommerce.core.model.CatalogInfoResponse
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.CatalogResponse
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.ProductPageResponse
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.ProductSetResponse

internal interface IECommerceCoreCloudDataSource {

    suspend fun getProductSizeSet(artikul: String, idFeature: String): ProductSetResponse

    suspend fun getProductsByIds(accessToken: String, idsList: List<String>): ProductPageResponse

    suspend fun getProductDetailByIDRG(idrgGoodsInventory: String): ProductPageResponse

    suspend fun getProductsByCategory(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ProductPageResponse

    suspend fun searchProductsByCategory(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ProductPageResponse

    suspend fun searchProductsByCategoryCollapsed(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ProductPageResponse

    suspend fun getProductsByCategoryCollapsed(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ProductPageResponse

    suspend fun getProductByNomenklatura(nomenclatura: String, idrfShop: String): ProductPageResponse

    suspend fun getPartnersGoods(
        idShop: String,
        idEnterprise: String,
        pageNumber: Int,
        pageSize: Int
    ): ProductPageResponse

    suspend fun getCatalog(accessToken: String): CatalogResponse

    suspend fun getCategoryInfo(ids: List<String>): CatalogInfoResponse
}