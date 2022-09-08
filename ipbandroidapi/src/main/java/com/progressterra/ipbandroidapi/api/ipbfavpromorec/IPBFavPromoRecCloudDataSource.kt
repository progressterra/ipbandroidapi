package com.progressterra.ipbandroidapi.api.ipbfavpromorec

import com.progressterra.ipbandroidapi.api.ipbfavpromorec.model.IDKindOfResponse
import com.progressterra.ipbandroidapi.base.BaseResponse
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

interface IPBFavPromoRecCloudDataSource {

    suspend fun getIDKindOf(iDKindOf: String): IDKindOfResponse

    suspend fun getClientEntityByType(accessToken: String, type: Int): IDKindOfResponse

    suspend fun addToFavorite(accessToken: String, idEntity: String, type: Int): BaseResponse

    suspend fun removeFromFavorite(accessToken: String, idEntity: String): BaseResponse

    class Base(
        private val service: IPBFavPromoRecService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), IPBFavPromoRecCloudDataSource {

        override suspend fun getIDKindOf(iDKindOf: String): IDKindOfResponse = handle {
            service.getIDKindOf(iDKindOf)
        }

        override suspend fun getClientEntityByType(accessToken: String, type: Int): IDKindOfResponse = handle {
            service.getClientEntityByType(accessToken, type)
        }

        override suspend fun addToFavorite(accessToken: String, idEntity: String, type: Int): BaseResponse = handle {
            service.addToFavorite(accessToken, idEntity, type)
        }

        override suspend fun removeFromFavorite(accessToken: String, idEntity: String): BaseResponse = handle {
            service.removeFromFavorite(accessToken, idEntity)
        }
    }
}