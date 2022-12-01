package com.progressterra.ipbandroidapi.api.iecommerce.core

import com.progressterra.ipbandroidapi.api.iecommerce.model.CatalogItem
import com.progressterra.ipbandroidapi.api.iecommerce.model.ProductPage
import com.progressterra.ipbandroidapi.api.iecommerce.model.ProductSet
import com.progressterra.ipbandroidapi.api.iecommerce.model.RFCatalog
import com.progressterra.core.AbstractRepository
import com.progressterra.core.BadRequestException
import com.progressterra.core.HandleException

internal class BaseIECommerceCoreRepository(
    handleException: HandleException,
    private val service: IECommerceCoreService
) : AbstractRepository(handleException), IECommerceCoreRepository {

    override suspend fun getProductSizeSet(
        artikul: String, idFeature: String
    ): Result<ProductSet?> = handle {
        val response = service.getProductSizeSet(artikul, idFeature)
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun getProductsByIds(
        accessToken: String, idsList: List<String>
    ): Result<ProductPage?> = handle {
        val response = service.getProductsByIds(accessToken, idsList)
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun getProductDetailByIDRG(idrgGoodsInventory: String): Result<ProductPage?> =
        handle {
            val response = service.getProductDetailByIDRG(idrgGoodsInventory)
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
    ): Result<ProductPage?> = handle {
        val response = service.getProductsByCategory(
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
    ): Result<ProductPage?> = handle {
        val response = service.searchProductsByCategory(
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
    ): Result<ProductPage?> = handle {
        val response = service.searchProductsByCategoryCollapsed(
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
    ): Result<ProductPage?> = handle {
        val response = service.getProductsByCategoryCollapsed(
            accessToken, idCategory, pageNumberIncome, pageSizeIncome, sortingField, sortingOrder
        )
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun getProductByNomenklatura(
        nomenclatura: String, idrfShop: String
    ): Result<ProductPage?> = handle {
        val response = service.getProductByNomenklatura(nomenclatura, idrfShop)
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun getPartnersGoods(
        idShop: String, idEnterprise: String, pageNumber: Int, pageSize: Int
    ): Result<ProductPage?> = handle {
        val response = service.getPartnersGoods(idShop, idEnterprise, pageNumber, pageSize)
        if (response.result?.status != 0) throw BadRequestException()
        response.data
    }

    override suspend fun getCatalog(accessToken: String): Result<List<CatalogItem>?> = handle {
        val response = service.getCatalog(accessToken)
        if (response.result?.status != 0) throw BadRequestException()
        response.dataList
    }

    override suspend fun getCategoryInfo(ids: List<String>): Result<List<RFCatalog>?> =
        handle {
            val response = service.getCategoryInfo(ids)
            if (response.result?.status != 0) throw BadRequestException()
            response.dataList
        }
}