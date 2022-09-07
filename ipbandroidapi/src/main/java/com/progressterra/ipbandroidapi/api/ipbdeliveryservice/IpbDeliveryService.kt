package com.progressterra.ipbandroidapi.api.ipbdeliveryservice

import com.progressterra.ipbandroidapi.api.ipbdeliveryservice.models.delivery.*

/**
 * http://84.201.188.117:5099/docsapi/v1/index.html
 * http://84.201.188.97:1955/docsapi/v1/index.html
 */
interface IpbDeliveryService {

    interface Delivery {
        /**
         * Метод для полученения списка возможных способов доставки для заданного города
         */
        suspend fun getDeliveryList(accessToken: String): ResultDeliveryList

        /**
         * Метод для создания заказа
         * Парметры заказа. rfMethodType - Метод доставки (0 - курьер, 1 - пункт выдачи, 2 - постамат); rfServiceType - Служба доставки (0 - IML) rdPickUpPoint - код (имя) пункта выдачи у выбранной службы
         */
        suspend fun createDeliveryOrder(
            accessToken: String,
            rfMethodType: DeliveryMethodType,
            rfServiceType: ServiceMethodType,
            rdPickUpPoint: String? = null,
        ): ResultOrderStatusCreation

        /**
         * Получение всех станий метро в городе клиента
         */
        suspend fun getMetroStations(accessToken: String): MetroStationsResponse

        /**
         *  Получение информации о заказе
         */
        suspend fun getOrderStatus(
            rdOrderId: String,
            rfServiceType: ServiceMethodType
        ): ResultDeliveryStatusInfo
    }


    companion object {
        fun IPBDelivery(): Delivery = IpbDeliveryServiceImpl()
    }
}