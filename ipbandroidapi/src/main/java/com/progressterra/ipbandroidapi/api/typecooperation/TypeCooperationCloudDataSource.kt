package com.progressterra.ipbandroidapi.api.typecooperation

import com.progressterra.ipbandroidapi.api.typecooperation.model.CooperationListResponse
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

interface TypeCooperationCloudDataSource {

    suspend fun getCooperationTypeList(accessToken: String): CooperationListResponse

    class Base(
        private val service: TypeCooperationService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), TypeCooperationCloudDataSource {

        override suspend fun getCooperationTypeList(accessToken: String): CooperationListResponse = handle {
            service.getCooperationTypeList(accessToken)
        }
    }
}