package com.progressterra.ipbandroidapi.api.ipbfavpromoreccore

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.api.ipbfavpromoreccore.models.IDKindOfResponse
import com.progressterra.ipbandroidapi.api.ipbfavpromoreccore.models.TypeOfEntity
import com.progressterra.ipbandroidapi.base.BaseResponse
import com.progressterra.ipbandroidapi.core.NetworkService

internal class IPBFavPromoRecCoreImpl : IPBFavPromoRecCore.Promo,
    IPBFavPromoRecCore.ClientFavorites {

    private val networkService: NetworkService = NetworkService.Base()
    private val api =
        networkService.createService(
            IPBFavPromoRecCoreApi::class.java,
            URL.IPB_FAVPROMOREC_URL
        )

    override suspend fun getIDKindOf(idKindOf: String): IDKindOfResponse {
        return api.getIDKindOf(idKindOf)
    }

    override suspend fun getClientEntityByType(
        accessToken: String,
        typeOfEntity: TypeOfEntity
    ): IDKindOfResponse {
        return api.getClientEntityByType(accessToken, typeOfEntity.value)
    }

    override suspend fun addToFavorite(
        accessToken: String,
        idEntity: String,
        typeOfEntity: TypeOfEntity
    ): BaseResponse {
        return api.addToFavorite(accessToken, idEntity, typeOfEntity.value)
    }

    override suspend fun removeFromFavorite(accessToken: String, idEntity: String): BaseResponse {
        return api.removeFromFavorite(accessToken, idEntity)
    }
}