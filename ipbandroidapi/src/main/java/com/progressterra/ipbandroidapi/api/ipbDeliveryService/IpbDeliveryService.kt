package com.progressterra.ipbandroidapi.api.ipbDeliveryService

import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.GetOrderStatusResponse
import com.progressterra.ipbandroidapi.api.ipbDeliveryService.models.RegisterOrderResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

/**
 * http://84.201.188.117:5099/docsapi/v1/index.html
 */
interface IpbDeliveryService {

    interface IPBSberbank {
        /**
         * Регистрация заказа
         */
        suspend fun registerOrder(
            idDHSaleHead: String
        ): RegisterOrderResponse

        /**
         * Передача карточных данных на авторизацию
         */
        suspend fun sendCardData(idDHSaleHead: String, seToken: String): BaseResponse

        /**
         * Получение информации по заказу
         */
        suspend fun getOrderStatus(idDHSaleHead: String): GetOrderStatusResponse
    }


    companion object {
        fun IPBSberbank(): IPBSberbank = IpbDeliveryServiceImpl()
    }
}