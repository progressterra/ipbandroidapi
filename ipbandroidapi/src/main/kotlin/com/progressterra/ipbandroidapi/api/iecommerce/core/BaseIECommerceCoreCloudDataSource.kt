package com.progressterra.ipbandroidapi.api.iecommerce.core

import com.progressterra.ipbandroidapi.api.iecommerce.core.model.CatalogInfoResponse
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.CatalogResponse
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.ProductPageResponse
import com.progressterra.ipbandroidapi.api.iecommerce.core.model.ProductSetResponse
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BaseIECommerceCoreCloudDataSource(
    private val service: IECommerceCoreService,
    handleException: HandleException
) : AbstractCloudDataSource(handleException), IECommerceCoreCloudDataSource {

    override suspend fun getProductSizeSet(artikul: String, idFeature: String): ProductSetResponse = handle {
        service.getProductSizeSet(artikul, idFeature)
    }

    override suspend fun getProductsByIds(accessToken: String, idsList: List<String>): ProductPageResponse = handle {
        service.getProductsByIds(accessToken, idsList)
    }

    override suspend fun getProductDetailByIDRG(idrgGoodsInventory: String): ProductPageResponse = handle {
        service.getProductDetailByIDRG(idrgGoodsInventory)
    }

    override suspend fun getProductsByCategory(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ProductPageResponse = handle {
        service.getProductsByCategory(
            accessToken,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
    }

    override suspend fun searchProductsByCategory(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ProductPageResponse = handle {
        service.searchProductsByCategory(
            accessToken,
            searchString,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
    }

    override suspend fun searchProductsByCategoryCollapsed(
        accessToken: String,
        searchString: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ProductPageResponse = handle {
        service.searchProductsByCategoryCollapsed(
            accessToken,
            searchString,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
    }

    override suspend fun getProductsByCategoryCollapsed(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ProductPageResponse = handle {
        service.getProductsByCategoryCollapsed(
            accessToken,
            idCategory,
            pageNumberIncome,
            pageSizeIncome,
            sortingField,
            sortingOrder
        )
    }

    override suspend fun getProductByNomenklatura(nomenclatura: String, idrfShop: String): ProductPageResponse =
        handle {
            service.getProductByNomenklatura(nomenclatura, idrfShop)
        }

    override suspend fun getPartnersGoods(
        idShop: String,
        idEnterprise: String,
        pageNumber: Int,
        pageSize: Int
    ): ProductPageResponse = handle {
        service.getPartnersGoods(idShop, idEnterprise, pageNumber, pageSize)
    }

    override suspend fun getCatalog(accessToken: String): CatalogResponse = handle {
        service.getCatalog(accessToken)
    }

    override suspend fun getCategoryInfo(ids: List<String>): CatalogInfoResponse = handle {
        service.getCategoryInfo(ids)
    }
}