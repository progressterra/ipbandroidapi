package com.progressterra.ipbandroidapi.api.complace

import com.progressterra.ipbandroidapi.api.complace.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.complace.models.RFComPlaceViewModel
import com.progressterra.ipbandroidapi.api.complace.models.StatusResult
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

interface ComPlaceRepository {

    suspend fun places(
        accessToken: String,
        filterAndSort: FilterAndSort
    ): Result<List<RFComPlaceViewModel>?>

    class Base(
        handleException: HandleException,
        private val service: ComPlaceService
    ) : ComPlaceRepository, AbstractRepository(handleException) {

        override suspend fun places(
            accessToken: String,
            filterAndSort: FilterAndSort
        ): Result<List<RFComPlaceViewModel>?> =
            handle {
                val response = service.places(accessToken, filterAndSort)
                if (response.result?.status == StatusResult.SUCCESS) {
                    throw BadRequestException()
                }
                response.dataList
            }
    }
}