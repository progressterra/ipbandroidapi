package com.progressterra.ipbandroidapi.api.ipbfavpromorec

import com.progressterra.ipbandroidapi.api.ipbfavpromorec.model.RFKindOfEntity

interface IPBFavPromoRecRepository {

    suspend fun getIDKindOf(iDKindOf: String): Result<List<String>?>

    suspend fun getClientEntityByType(
        accessToken: String,
        type: Int
    ): Result<List<String>?>

    suspend fun addToFavorite(
        accessToken: String,
        idEntity: String,
        type: Int
    ): Result<Unit>

    suspend fun removeFromFavorite(
        accessToken: String,
        idEntity: String
    ): Result<Unit>

    suspend fun getCategoryInfo(idUnique: String): Result<RFKindOfEntity?>
}