package com.progressterra.ipbandroidapi.remoteData.ipbDeliveryService

import com.progressterra.ipbandroidapi.remoteData.ipbDeliveryService.models.GetOrderStatusResponse
import com.progressterra.ipbandroidapi.remoteData.ipbDeliveryService.models.RegisterOrderResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

/**
 * http://84.201.184.154:5099/docsapi/v1/index.html
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