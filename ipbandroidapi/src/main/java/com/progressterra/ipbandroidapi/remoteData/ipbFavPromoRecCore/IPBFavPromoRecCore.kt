package com.progressterra.ipbandroidapi.remoteData.ipbFavPromoRecCore

import com.progressterra.ipbandroidapi.remoteData.ipbFavPromoRecCore.models.IDKindOfResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

/**
 * http://84.201.184.154:5095/docsapi/v1/index.html
 */
interface IPBFavPromoRecCore {

    interface ClientFavorites {
        suspend fun getClientEntityByType(accessToken: String, typeOfEntity: Int): IDKindOfResponse
        suspend fun addToFavorite(
            accessToken: String,
            idEntity: String,
            typeOfEntity: Int
        ): BaseResponse

        suspend fun removeFromFavorite(accessToken: String, idEntity: String): BaseResponse
    }

    interface Promo {
        suspend fun getIDKindOf(idKindOf: String): IDKindOfResponse
    }

    companion object {
        fun Promo(): Promo = IPBFavPromoRecCoreImpl()
        fun ClientFavorites(): ClientFavorites = IPBFavPromoRecCoreImpl()
    }
}