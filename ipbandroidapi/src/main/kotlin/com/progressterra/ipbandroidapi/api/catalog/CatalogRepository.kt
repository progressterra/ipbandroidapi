package com.progressterra.ipbandroidapi.api.catalog

import com.progressterra.ipbandroidapi.api.catalog.models.CatalogItem
import com.progressterra.ipbandroidapi.api.catalog.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.catalog.models.RFCatalogCategoryViewModel
import com.progressterra.ipbandroidapi.api.catalog.models.StatusResult
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

interface CatalogRepository {

    suspend fun catalog(
        accessToken: String,
        filterAndSort: FilterAndSort
    ): Result<CatalogItem?>

    suspend fun category(
        accessToken: String,
        path: String
    ): Result<RFCatalogCategoryViewModel?>

    class Base(
        handleException: HandleException,
        private val service: CatalogService
    ) : CatalogRepository, AbstractRepository(handleException) {

        override suspend fun category(
            accessToken: String,
            path: String
        ): Result<RFCatalogCategoryViewModel?> = handle {
            val result = service.category(accessToken, path)
            if (result.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            result.data
        }

        override suspend fun catalog(
            accessToken: String,
            filterAndSort: FilterAndSort
        ): Result<CatalogItem?> = handle {
            val result = service.catalog(accessToken, filterAndSort)
            if (result.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            result.data
        }
    }
}