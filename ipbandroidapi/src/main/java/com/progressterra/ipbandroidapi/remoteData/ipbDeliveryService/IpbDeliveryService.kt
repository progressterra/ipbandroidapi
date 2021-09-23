package com.progressterra.ipbandroidapi.remoteData.ipbDeliveryService

import com.progressterra.ipbandroidapi.remoteData.ipbDeliveryService.models.GetOrderStatusResponse
import com.progressterra.ipbandroidapi.remoteData.ipbDeliveryService.models.RegisterOrderResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

interface IpbDeliveryService {

    interface IPBSberbank {
        // Регистрация заказа
        suspend fun registerOrder(
            idDHSaleHead: String
        ): RegisterOrderResponse

        // Передача карточных данных на авторизацию
        suspend fun sendCardData(idDHSaleHead: String, seToken: String): BaseResponse

        // Получение информации по заказу
        suspend fun getOrderStatus(idDHSaleHead: String): GetOrderStatusResponse
    }


    companion object {
        fun IPBSberbank(): IPBSberbank = IpbDeliveryServiceImpl()
    }
}