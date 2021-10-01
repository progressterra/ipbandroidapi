package com.progressterra.ipbandroidapi.api.iProBonusApi

import com.progressterra.ipbandroidapi.api.iProBonusApi.models.CityResponse
import com.progressterra.ipbandroidapi.api.iProBonusApi.models.PurchaseDetailInfoResponse
import com.progressterra.ipbandroidapi.api.iProBonusApi.models.PurchasesResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.ClientInfoResponse


interface IProBonus {
    interface ClientsV3 {
        suspend fun getClientInfo(accessToken: String): ClientInfoResponse
        suspend fun updateClientInfo(
            accessToken: String,
            name: String,
            soname: String,
            patronymic: String
        ): ClientInfoResponse
    }

    interface ClientCity {
        suspend fun getClientCity(accessToken: String): CityResponse
    }

    interface Purchases {
        suspend fun getPurchasesList(accessToken: String): PurchasesResponse
        suspend fun getPurchaseDetailInfo(purchaseId: String): PurchaseDetailInfoResponse
    }

    companion object {
        fun Purchases(): Purchases = IProBonusApiImpl()
        fun ClientsV3(): ClientsV3 = IProBonusApiImpl()
        fun ClientCity(): ClientCity = IProBonusApiImpl()
    }
}