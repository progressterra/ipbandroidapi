package com.progressterra.ipbandroidapi.api.catalog

import com.progressterra.ipbandroidapi.api.catalog.models.CatalogItem
import com.progressterra.ipbandroidapi.api.catalog.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.catalog.models.StatusResult
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

interface CatalogRepository {

    suspend fun catalog(
        filterAndSort: FilterAndSort
    ): Result<CatalogItem?>

    class Base(
        handleException: HandleException,
        private val service: CatalogService
    ) : CatalogRepository, AbstractRepository(handleException) {

        override suspend fun catalog(
            filterAndSort: FilterAndSort
        ): Result<CatalogItem?> = handle {
            val result = service.catalog(filterAndSort)
            if (result.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            result.data
        }
    }
}