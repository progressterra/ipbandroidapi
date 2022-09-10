package com.progressterra.ipbandroidapi.api.ipbfavpromorec

import com.progressterra.ipbandroidapi.api.ipbfavpromorec.model.TypeOfEntity
import com.progressterra.ipbandroidapi.core.AbstractRepository

internal class BaseIPBFavPromoRecRepository(
    private val cloudDataSource: IPBFavPromoRecCloudDataSource
) : AbstractRepository(), IPBFavPromoRecRepository {

    override suspend fun getIDKindOf(iDKindOf: String): Result<List<String>> = handle {
        cloudDataSource.getIDKindOf(iDKindOf)
    }.map { it.dataList ?: emptyList() }

    override suspend fun getClientEntityByType(accessToken: String, type: TypeOfEntity): Result<List<String>> =
        handle {
            cloudDataSource.getClientEntityByType(accessToken, type.ordinal)
        }.map { it.dataList ?: emptyList() }

    override suspend fun addToFavorite(accessToken: String, idEntity: String, type: TypeOfEntity): Result<Unit> =
        handle {
            cloudDataSource.addToFavorite(accessToken, idEntity, type.ordinal)
        }

    override suspend fun removeFromFavorite(accessToken: String, idEntity: String): Result<Unit> = handle {
        cloudDataSource.removeFromFavorite(accessToken, idEntity)
    }
}