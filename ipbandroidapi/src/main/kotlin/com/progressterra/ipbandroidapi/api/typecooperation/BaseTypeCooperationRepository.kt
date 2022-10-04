package com.progressterra.ipbandroidapi.api.typecooperation

import com.progressterra.ipbandroidapi.api.typecooperation.model.RFTypeCooperationData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseTypeCooperationRepository(
    private val cloudDataSource: TypeCooperationCloudDataSource
) : AbstractRepository(), TypeCooperationRepository {

    override suspend fun getCooperationTypeList(accessToken: String): Result<List<RFTypeCooperationData>> =
        handle {
            val response = cloudDataSource.getCooperationTypeList(accessToken)
            if (response.status != 0)
                throw BadRequestException()
            response
        }.map { data -> data.dataList?.map { RFTypeCooperationData(it) } ?: emptyList() }
}