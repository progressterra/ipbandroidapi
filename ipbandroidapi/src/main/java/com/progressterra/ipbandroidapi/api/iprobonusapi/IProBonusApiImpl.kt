package com.progressterra.ipbandroidapi.api.iprobonusapi

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.api.iprobonusapi.models.NotificationsResponse
import com.progressterra.ipbandroidapi.api.iprobonusapi.models.PurchaseDetailInfoResponse
import com.progressterra.ipbandroidapi.api.iprobonusapi.models.PurchasesResponse
import com.progressterra.ipbandroidapi.base.BaseResponse
import com.progressterra.ipbandroidapi.core.NetworkService

internal class IProBonusApiImpl : IProBonus.Purchases, IProBonus.MessageInApp {
    private val apbNetworkService: NetworkService = NetworkService.Base()
    private val ipbApi =
        apbNetworkService.createService(
            IProBonusApi::class.java,
            URL.LIKEDISLIKE_ROOT_URL
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

