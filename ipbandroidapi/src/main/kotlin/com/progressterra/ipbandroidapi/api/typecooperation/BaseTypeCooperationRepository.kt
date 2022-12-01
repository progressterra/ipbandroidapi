package com.progressterra.ipbandroidapi.api.typecooperation

import com.progressterra.ipbandroidapi.api.typecooperation.model.RFTypeCooperationData
import com.progressterra.core.AbstractRepository
import com.progressterra.core.BadRequestException
import com.progressterra.core.HandleException

internal class BaseTypeCooperationRepository(
    handleException: HandleException,
    private val service: TypeCooperationService
) : AbstractRepository(handleException), TypeCooperationRepository {

    override suspend fun getCooperationTypeList(accessToken: String): Result<List<RFTypeCooperationData>> =
        handle {
            val response = service.getCooperationTypeList(accessToken)
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map { data -> data.dataList?.map { RFTypeCooperationData(it) } ?: emptyList() }
}