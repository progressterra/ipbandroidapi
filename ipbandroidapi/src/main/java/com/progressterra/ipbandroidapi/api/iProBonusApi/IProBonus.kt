package com.progressterra.ipbandroidapi.api.iProBonusApi

import com.progressterra.ipbandroidapi.api.iProBonusApi.models.NotificationsResponse
import com.progressterra.ipbandroidapi.api.iProBonusApi.models.PurchaseDetailInfoResponse
import com.progressterra.ipbandroidapi.api.iProBonusApi.models.PurchasesResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse


interface IProBonus {


    interface Purchases {
        suspend fun getPurchasesList(accessToken: String): PurchasesResponse
        suspend fun getPurchaseDetailInfo(purchaseId: String): PurchaseDetailInfoResponse
    }

    interface MessageInApp {

        /**
         * Получение списка уведомлений
         * У прочитанных сообщений dateRead != null
         */
        suspend fun getInAppMessages(accessToken: String): NotificationsResponse


        /**
         * Установка прочитанного состояния
         */
        suspend fun setMessageIsRead(idMessage: String): BaseResponse

    }

    companion object {
        fun Purchases(): Purchases = IProBonusApiImpl()
        fun MessageInApp(): MessageInApp = IProBonusApiImpl()
    }
}