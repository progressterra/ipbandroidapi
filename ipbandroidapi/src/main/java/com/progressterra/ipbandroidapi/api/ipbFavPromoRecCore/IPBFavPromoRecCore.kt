package com.progressterra.ipbandroidapi.api.ipbFavPromoRecCore

import com.progressterra.ipbandroidapi.api.ipbFavPromoRecCore.models.IDKindOfResponse
import com.progressterra.ipbandroidapi.api.ipbFavPromoRecCore.models.TypeOfEntity
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

/**
 * http://84.201.188.117:5095/docsapi/v1/index.html
 */
interface IPBFavPromoRecCore {

    interface ClientFavorites {
        suspend fun getClientEntityByType(accessToken: String, typeOfEntity: TypeOfEntity): IDKindOfResponse
        suspend fun addToFavorite(
            accessToken: String,
            idEntity: String,
            typeOfEntity: TypeOfEntity
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