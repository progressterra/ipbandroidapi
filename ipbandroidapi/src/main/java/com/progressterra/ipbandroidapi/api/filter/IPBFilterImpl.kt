package com.progressterra.ipbandroidapi.api.filter

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.api.filter.models.FilterDataResponse
import com.progressterra.ipbandroidapi.api.filter.models.FilterRequest
import com.progressterra.ipbandroidapi.api.filter.models.IncomeFilterAndSortData
import com.progressterra.ipbandroidapi.api.iecommerscoreapi.models.ProductPageResponse
import com.progressterra.ipbandroidapi.core.NetworkService

class IPBFilterImpl : IPBFilter {
    private val networkService: NetworkService = NetworkService.Base()
    private val api = networkService.createService(
        IPBFilterApi::class.java,
        URL.IPB_PRODUCT_URL
    )

    override suspend fun getFilteredProduct(
        idCategory: String,
        filterAndSortData: IncomeFilterAndSortData
    ): ProductPageResponse {
        return api.getFilteredProducts(
            FilterRequest(
                idCategory = idCategory,
                filterAndSortData = filterAndSortData
            )
        )
    }

    override suspend fun getFilterData(idCategory: String): FilterDataResponse {
        return api.getFilterData(idCategory)
    }
}