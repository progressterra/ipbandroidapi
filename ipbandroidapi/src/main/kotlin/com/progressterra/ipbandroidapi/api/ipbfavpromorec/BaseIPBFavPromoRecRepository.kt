package com.progressterra.ipbandroidapi.api.ipbfavpromorec

import com.progressterra.ipbandroidapi.api.ipbfavpromorec.model.TypeOfEntity
import com.progressterra.core.AbstractRepository
import com.progressterra.core.HandleException

internal class BaseIPBFavPromoRecRepository(
    handleException: HandleException,
    private val service: IPBFavPromoRecService
) : AbstractRepository(handleException), IPBFavPromoRecRepository {

    override suspend fun getIDKindOf(iDKindOf: String): Result<List<String>> = handle {
        service.getIDKindOf(iDKindOf)
    }.map { it.dataList ?: emptyList() }

    override suspend fun getClientEntityByType(accessToken: String, type: TypeOfEntity): Result<List<String>> =
        handle {
            service.getClientEntityByType(accessToken, type.ordinal)
        }.map { it.dataList ?: emptyList() }

    override suspend fun addToFavorite(accessToken: String, idEntity: String, type: TypeOfEntity): Result<Unit> =
        handle {
            service.addToFavorite(accessToken, idEntity, type.ordinal)
        }

    override suspend fun removeFromFavorite(accessToken: String, idEntity: String): Result<Unit> = handle {
        service.removeFromFavorite(accessToken, idEntity)
    }
}