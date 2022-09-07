package com.progressterra.ipbandroidapi.api.ipbfavpromoreccore

import com.progressterra.ipbandroidapi.api.ipbfavpromoreccore.models.TypeOfEntity
import com.progressterra.ipbandroidapi.core.AbstractRepository

interface IPBFavPromoRecRepository {

    suspend fun getIDKindOf(iDKindOf: String): Result<List<String>>

    suspend fun getClientEntityByType(accessToken: String, type: TypeOfEntity): Result<List<String>>

    suspend fun addToFavorite(accessToken: String, idEntity: String, type: TypeOfEntity): Result<Unit>

    suspend fun removeFromFavorite(accessToken: String, idEntity: String): Result<Unit>

    class Base(
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
}