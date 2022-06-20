package com.progressterra.ipbandroidapi.api.filter

import com.progressterra.ipbandroidapi.api.filter.models.FilterDataResponse
import com.progressterra.ipbandroidapi.api.filter.models.IncomeFilterAndSortData
import com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.ProductPageResponse

interface IPBFilter {
    suspend fun getFilteredProduct(idCategory: String, filterAndSortData: IncomeFilterAndSortData): ProductPageResponse

    suspend fun getFilterData(idCategory: String): FilterDataResponse

    companion object {
        fun Filter(): IPBFilter = IPBFilterImpl()
    }
}