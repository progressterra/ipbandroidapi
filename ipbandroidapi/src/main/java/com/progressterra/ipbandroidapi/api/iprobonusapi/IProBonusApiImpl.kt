package com.progressterra.ipbandroidapi.api.iprobonusapi

import com.progressterra.ipbandroidapi.api.iprobonusapi.models.NotificationsResponse
import com.progressterra.ipbandroidapi.api.iprobonusapi.models.PurchaseDetailInfoResponse
import com.progressterra.ipbandroidapi.api.iprobonusapi.models.PurchasesResponse
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remotedata.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remotedata.NetworkSettings
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

internal class IProBonusApiImpl : IProBonus.Purchases, IProBonus.MessageInApp {
    private val apbNetworkService: NetworkService = NetworkServiceImpl()
    private val ipbApi =
        apbNetworkService.createService(
            IProBonusApi::class.java,
            NetworkSettings.LIKEDISLIKE_ROOT_URL
        )


    override suspend fun getPurchasesList(accessToken: String): PurchasesResponse {
        return ipbApi.getPurchasesList(accessToken)
    }

    override suspend fun getPurchaseDetailInfo(purchaseId: String): PurchaseDetailInfoResponse {
        return ipbApi.getPurchaseDetailInfo(purchaseId)
    }

    override suspend fun getInAppMessages(accessToken: String): NotificationsResponse {
        return ipbApi.getInAppMessages(accessToken)
    }

    override suspend fun setMessageIsRead(idMessage: String): BaseResponse {
        return ipbApi.setMessageIsRead(idMessage)
    }
}

