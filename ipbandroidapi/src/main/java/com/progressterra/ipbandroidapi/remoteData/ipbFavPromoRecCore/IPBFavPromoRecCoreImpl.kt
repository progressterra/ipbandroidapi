package com.progressterra.ipbandroidapi.remoteData.ipbFavPromoRecCore

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.ipbFavPromoRecCore.models.IDKindOfResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

internal class IPBFavPromoRecCoreImpl : IPBFavPromoRecCore.Promo,
    IPBFavPromoRecCore.ClientFavorites {

    private val networkService: NetworkService = NetworkServiceImpl()
    private val api =
        networkService.createService(
            IPBFavPromoRecCoreApi::class.java,
            NetworkSettings.IPB_FAVPROMOREC_URL
        )

    override suspend fun getIDKindOf(idKindOf: String): IDKindOfResponse {
        return api.getIDKindOf(idKindOf)
    }

    override suspend fun getClientEntityByType(
        accessToken: String,
        typeOfEntity: Int
    ): IDKindOfResponse {
        return api.getClientEntityByType(accessToken, typeOfEntity)
    }

    override suspend fun addToFavorite(
        accessToken: String,
        idEntity: String,
        typeOfEntity: Int
    ): BaseResponse {
        return api.addToFavorite(accessToken, idEntity, typeOfEntity)
    }

    override suspend fun removeFromFavorite(accessToken: String, idEntity: String): BaseResponse {
        return api.removeFromFavorite(accessToken, idEntity)
    }
}