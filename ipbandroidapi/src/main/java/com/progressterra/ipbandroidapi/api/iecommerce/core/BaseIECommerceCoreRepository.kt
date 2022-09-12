package com.progressterra.ipbandroidapi.api.iecommerce.core

import com.progressterra.ipbandroidapi.api.iecommerce.core.model.CatalogData
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.CatalogItemData
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.ProductPageData
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.ProductSetData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseIECommerceCoreRepository(
    private val cloudDataSource: IECommerceCoreCloudDataSource
) : AbstractRepository(), IECommerceCoreRepository {

    override suspend fun getProductSizeSet(artikul: String, idFeature: String): Result<ProductSetData> = handle {
        val response = cloudDataSource.getProductSizeSet(artikul, idFeature)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { ProductSetData(it.data) }

    override suspend fun getProductsByIds(accessToken: String, idsList: List<String>): Result<ProductPageData> =
        handle {
            val response = cloudDataSource.getProductsByIds(accessToken, idsList)
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map { ProductPageData(it.data) }

    override suspend fun getProductDetailByIDRG(idrgGoodsInventory: String): Result<ProductPageData> = handle {
        val response = cloudDataSource.getProductDetailByIDRG(idrgGoodsInventory)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { ProductPageData(it.data) }

    override suspend fun getProductsByCategory(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPageData> = handle {
        val response = cloudDataSource.getProductsByCategory(
            accessToken,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { ProductPageData(it.data) }

    override suspend fun searchProductsByCategory(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPageData> = handle {
        val response = cloudDataSource.searchProductsByCategory(
            accessToken,
            searchString,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { ProductPageData(it.data) }

    override suspend fun searchProductsByCategoryCollapsed(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPageData> = handle {
        val response = cloudDataSource.searchProductsByCategoryCollapsed(
            accessToken,
            searchString,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { ProductPageData(it.data) }

    override suspend fun getProductsByCategoryCollapsed(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPageData> = handle {
        val response = cloudDataSource.getProductsByCategoryCollapsed(
            accessToken,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { ProductPageData(it.data) }

    override suspend fun getProductByNomenklatura(nomenclatura: String, idrfShop: String): Result<ProductPageData> =
        handle {
            val response = cloudDataSource.getProductByNomenklatura(nomenclatura, idrfShop)
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map { ProductPageData(it.data) }

    override suspend fun getPartnersGoods(
        idShop: String,
        idEnterprise: String,
        pageNumber: Int,
        pageSize: Int
    ): Result<ProductPageData> = handle {
        val response = cloudDataSource.getPartnersGoods(idShop, idEnterprise, pageNumber, pageSize)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { ProductPageData(it.data) }

    override suspend fun getCatalog(accessToken: String): Result<List<CatalogItemData>> = handle {
        val response = cloudDataSource.getCatalog(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { it.data?.map { item -> CatalogItemData(item) } ?: emptyList() }

    override suspend fun getCategoryInfo(ids: List<String>): Result<List<CatalogData>> = handle {
        val response = cloudDataSource.getCategoryInfo(ids)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map { it.dataList.map { item -> CatalogData(item) } }
}