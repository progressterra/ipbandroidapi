package com.progressterra.ipbandroidapi.api.iecommerce.core

import com.progressterra.ipbandroidapi.api.iecommerce.model.CatalogItem
import com.progressterra.ipbandroidapi.api.iecommerce.model.ProductPage
import com.progressterra.ipbandroidapi.api.iecommerce.model.ProductSet
import com.progressterra.ipbandroidapi.api.iecommerce.model.RFCatalog
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseIECommerceCoreRepository(
    private val cloudDataSource: IECommerceCoreCloudDataSource
) : AbstractRepository(), IECommerceCoreRepository {

    override suspend fun getProductSizeSet(
        artikul: String, idFeature: String
    ): Result<ProductSet?> = runCatching {
        val response = cloudDataSource.getProductSizeSet(artikul, idFeature)
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun getProductsByIds(
        accessToken: String, idsList: List<String>
    ): Result<ProductPage?> = runCatching {
        val response = cloudDataSource.getProductsByIds(accessToken, idsList)
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun getProductDetailByIDRG(idrgGoodsInventory: String): Result<ProductPage?> =
        runCatching {
            val response = cloudDataSource.getProductDetailByIDRG(idrgGoodsInventory)
            if (response.result?.status != 0) throw BadRequestException()
            response.data
        }

    override suspend fun getProductsByCategory(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPage?> = runCatching {
        val response = cloudDataSource.getProductsByCategory(
            accessToken, idCategory, pageNumberIncome, pageSizeIncome, sortingField, sortingOrder
        )
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun searchProductsByCategory(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPage?> = runCatching {
        val response = cloudDataSource.searchProductsByCategory(
            accessToken,
            searchString,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun searchProductsByCategoryCollapsed(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPage?> = runCatching {
        val response = cloudDataSource.searchProductsByCategoryCollapsed(
            accessToken,
            searchString,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun getProductsByCategoryCollapsed(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): Result<ProductPage?> = runCatching {
        val response = cloudDataSource.getProductsByCategoryCollapsed(
            accessToken, idCategory, pageNumberIncome, pageSizeIncome, sortingField, sortingOrder
        )
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun getProductByNomenklatura(
        nomenclatura: String, idrfShop: String
    ): Result<ProductPage?> = runCatching {
        val response = cloudDataSource.getProductByNomenklatura(nomenclatura, idrfShop)
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun getPartnersGoods(
        idShop: String, idEnterprise: String, pageNumber: Int, pageSize: Int
    ): Result<ProductPage?> = runCatching {
        val response = cloudDataSource.getPartnersGoods(idShop, idEnterprise, pageNumber, pageSize)
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun getCatalog(accessToken: String): Result<List<CatalogItem>?> = runCatching {
        val response = cloudDataSource.getCatalog(accessToken)
        if (response.result?.status != 0) throw BadRequestException()
        response.dataList
    }

    override suspend fun getCategoryInfo(ids: List<String>): Result<List<RFCatalog>?> =
        runCatching {
            val response = cloudDataSource.getCategoryInfo(ids)
            if (response.result?.status != 0) throw BadRequestException()
            response.dataList
        }
}