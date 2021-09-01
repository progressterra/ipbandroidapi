package com.progressterra.ipbandroidapi.remoteData.iProBonusApi

import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.CityResponse
import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.PurchaseDetailInfoResponse
import com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.PurchasesResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAmbassador.models.client_info.ClientInfoResponse


interface IProBonus {
    suspend fun getClientInfo(accessToken: String): ClientInfoResponse
    suspend fun updateClientInfo(
        accessToken: String,
        name: String,
        soname: String,
        patronymic: String
    ): ClientInfoResponse

    suspend fun getClientCity(accessToken: String): CityResponse

    interface Purchases {
        suspend fun getPurchasesList(accessToken: String): PurchasesResponse
        suspend fun getPurchaseDetailInfo(purchaseId: String): PurchaseDetailInfoResponse
    }

    companion object {
        fun IProBonus(): IProBonus = IProBonusApiImpl()
        fun Purchases(): Purchases = IProBonusApiImpl()
    }
}