package com.progressterra.ipbandroidapi.remoteData.iProBonusApi

import com.progressterra.ipbandroidapi.remoteData.ipbAmbassador.models.client_info.ClientInfoResponse


interface IProBonus {
    suspend fun getClientInfo(accessToken: String): ClientInfoResponse
    suspend fun updateClientInfo(
        accessToken: String,
        name: String,
        soname: String,
        patronymic: String
    ): ClientInfoResponse

    companion object {
        fun IProBonus(): IProBonus = IProBonusApiImpl()
    }
}