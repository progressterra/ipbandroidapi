package com.progressterra.ipbandroidapi.api.iProBonusApi

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.api.iProBonusApi.models.CityResponse
import com.progressterra.ipbandroidapi.api.iProBonusApi.models.PurchaseDetailInfoResponse
import com.progressterra.ipbandroidapi.api.iProBonusApi.models.PurchasesResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.UpdateUserInfoRequest

internal class IProBonusApiImpl : IProBonus.Purchases, IProBonus.ClientsV3, IProBonus.ClientCity {
    private val apbNetworkService: NetworkService = NetworkServiceImpl()
    private val ipbApi =
        apbNetworkService.createService(
            IProBonusApi::class.java,
            NetworkSettings.LIKEDISLIKE_ROOT_URL
        )

    override suspend fun getClientInfo(accessToken: String): ClientInfoResponse {
        return ipbApi.getClientInfo(accessToken)
    }

    override suspend fun updateClientInfo(
        accessToken: String,
        name: String,
        soname: String,
        patronymic: String
    ): ClientInfoResponse {
        return ipbApi.updatePersonalInfo(
            accessToken,
            UpdateUserInfoRequest(soname, name, patronymic)
        )
    }

    override suspend fun getClientCity(accessToken: String): CityResponse {
        return ipbApi.getCityClient(accessToken)
    }

    override suspend fun getPurchasesList(accessToken: String): PurchasesResponse {
        return ipbApi.getPurchasesList(accessToken)
    }

    override suspend fun getPurchaseDetailInfo(purchaseId: String): PurchaseDetailInfoResponse {
        return ipbApi.getPurchaseDetailInfo(purchaseId)
    }
}

