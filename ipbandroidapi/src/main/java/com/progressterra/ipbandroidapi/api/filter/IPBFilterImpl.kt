package com.progressterra.ipbandroidapi.api.filter

import com.progressterra.ipbandroidapi.api.filter.models.FilterDataResponse
import com.progressterra.ipbandroidapi.api.filter.models.IncomeFilterAndSortData
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.ProductPageResponse
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings

class IPBFilterImpl : IPBFilter {
    private val networkService: NetworkService = NetworkServiceImpl()
    private val api = networkService.createService(
        IPBFilter::class.java,
        NetworkSettings.IPB_FILTER_URL
    )

    override suspend fun getFilteredProduct(
        idCategory: String,
        filterAndSortData: IncomeFilterAndSortData
    ): ProductPageResponse {
        return api.getFilteredProduct(idCategory = idCategory, filterAndSortData = filterAndSortData)
    }

    override suspend fun getFilterData(idCategory: String): FilterDataResponse {
        return api.getFilterData(idCategory)
    }
}