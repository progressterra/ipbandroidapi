package com.progressterra.ipbandroidapi.api.iecommerce.core

import com.progressterra.ipbandroidapi.api.iecommerce.model.CatalogResult
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultListRFCatalog
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultProductSet
import com.progressterra.ipbandroidapi.api.iecommerce.model.ResultProducts
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BaseIECommerceCoreCloudDataSource(
    private val service: IECommerceCoreService, handleException: HandleException
) : AbstractCloudDataSource(handleException), IECommerceCoreCloudDataSource {

    override suspend fun getProductSizeSet(artikul: String, idFeature: String): ResultProductSet =
        handle {
            service.getProductSizeSet(artikul, idFeature)
        }

    override suspend fun getProductsByIds(
        accessToken: String, idsList: List<String>
    ): ResultProducts = handle {
        service.getProductsByIds(accessToken, idsList)
    }

    override suspend fun getProductDetailByIDRG(idrgGoodsInventory: String): ResultProducts =
        handle {
            service.getProductDetailByIDRG(idrgGoodsInventory)
        }

    override suspend fun getProductsByCategory(
        accessToken: String,
        idCategory: String,
        pageNumberIncome: Int,
        pageSizeIncome: Int,
        sortingField: Int,
        sortingOrder: Int
    ): ResultProducts = handle {
        service.getProductsByCategory(
            accessToken, idCategory, pageNumberIncome, pageSizeIncome, sortingField, sortingOrder
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
    ): ResultProducts = handle {
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
    ): ResultProducts = handle {
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
    ): ResultProducts = handle {
        service.getProductsByCategoryCollapsed(
            accessToken, idCategory, pageNumberIncome, pageSizeIncome, sortingField, sortingOrder
        )
    }

    override suspend fun getProductByNomenklatura(
        nomenclatura: String, idrfShop: String
    ): ResultProducts = handle {
        service.getProductByNomenklatura(nomenclatura, idrfShop)
    }

    override suspend fun getPartnersGoods(
        idShop: String, idEnterprise: String, pageNumber: Int, pageSize: Int
    ): ResultProducts = handle {
        service.getPartnersGoods(idShop, idEnterprise, pageNumber, pageSize)
    }

    override suspend fun getCatalog(accessToken: String): CatalogResult = handle {
        service.getCatalog(accessToken)
    }

    override suspend fun getCategoryInfo(ids: List<String>): ResultListRFCatalog = handle {
        service.getCategoryInfo(ids)
    }
}