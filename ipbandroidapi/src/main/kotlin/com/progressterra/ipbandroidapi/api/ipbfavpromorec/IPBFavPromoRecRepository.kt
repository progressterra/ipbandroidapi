package com.progressterra.ipbandroidapi.api.ipbfavpromorec

import com.progressterra.ipbandroidapi.api.ipbfavpromorec.model.TypeOfEntity

interface IPBFavPromoRecRepository {

    suspend fun getIDKindOf(iDKindOf: String): Result<List<String>>

    suspend fun getClientEntityByType(accessToken: String, type: TypeOfEntity): Result<List<String>>

    suspend fun addToFavorite(accessToken: String, idEntity: String, type: TypeOfEntity): Result<Unit>

    suspend fun removeFromFavorite(accessToken: String, idEntity: String): Result<Unit>
}