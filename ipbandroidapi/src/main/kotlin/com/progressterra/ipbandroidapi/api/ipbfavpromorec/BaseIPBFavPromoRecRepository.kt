package com.progressterra.ipbandroidapi.api.ipbfavpromorec

import com.progressterra.ipbandroidapi.api.ipbfavpromorec.model.RFKindOfEntity
import com.progressterra.ipbandroidapi.api.ipbfavpromorec.model.StatusResult
import com.progressterra.ipbandroidapi.core.BadRequestException

class BaseIPBFavPromoRecRepository(
    private val service: IPBFavPromoRecService
) : IPBFavPromoRecRepository {

    override suspend fun getIDKindOf(iDKindOf: String): Result<List<String>?> = runCatching {
        val response = service.getIDKindOf(iDKindOf)
        if (response.result?.status != StatusResult.ZERO)
            throw BadRequestException()
        response.dataList
    }

    override suspend fun getClientEntityByType(
        accessToken: String,
        type: Int
    ): Result<List<String>?> = runCatching {
        val response = service.getClientEntityByType(accessToken, type)
        if (response.result?.status != StatusResult.ZERO)
            throw BadRequestException()
        response.dataList
    }

    override suspend fun addToFavorite(
        accessToken: String,
        idEntity: String,
        type: Int
    ): Result<Unit> = runCatching {
        val response = service.addToFavorite(accessToken, idEntity, type)
        if (response.status != StatusResult.ZERO)
            throw BadRequestException()
    }

    override suspend fun removeFromFavorite(accessToken: String, idEntity: String): Result<Unit> =
        runCatching {
            val response = service.removeFromFavorite(accessToken, idEntity)
            if (response.status != StatusResult.ZERO)
                throw BadRequestException()
        }

    override suspend fun getCategoryInfo(idUnique: String): Result<RFKindOfEntity?> = runCatching {
        val response = service.getCategoryInfo(idUnique)
        if (response.result?.status != StatusResult.ZERO)
            throw BadRequestException()
        response.data
    }
}