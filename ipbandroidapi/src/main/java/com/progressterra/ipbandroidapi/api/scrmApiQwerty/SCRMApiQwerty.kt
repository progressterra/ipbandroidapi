package com.progressterra.ipbandroidapi.api.scrmApiQwerty

import com.progressterra.ipbandroidapi.api.iProBonusApi.models.CityResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.ClientInfoResponse
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse


/**
 * http://84.201.184.154:5021/docsapi/v3/index.html
 */
interface SCRMApiQwerty {

    interface ClientManagement {
        /**
         * Инициируем удаление клиента - отправляем код подтверждения на основной канал (сейчас номер телефона)
         * @see BaseResponse
         */
        suspend fun removeClientBegin(accessToken: String): BaseResponse

        /**
         * Если код верификации отправленный на основной канал верен, то удаляем клиента - ОЧИЩАЕМ ФИО, Дату рождения, Пол. Рвем запись в ClientChannel
         * @param verificationCode - код из смс
         * @see BaseResponse
         */
        suspend fun removeClientEnd(accessToken: String, verificationCode: String): BaseResponse
    }

    interface ClientsV3 {
        suspend fun getClientInfo(accessToken: String): ClientInfoResponse
        suspend fun updateClientInfo(
            accessToken: String,
            name: String,
            soname: String,
            patronymic: String
        ): ClientInfoResponse
    }

    interface ClientCity {
        suspend fun getClientCity(accessToken: String): CityResponse
    }

    interface TestimonialsControllerV3 {

        /**
         * Добавление нового отзыва
         */
        suspend fun addTestimonial(
            accessToken: String,
            nickNameClient: String,
            message: String,
            idEmployee: String = NetworkSettings.DEFAULT_ID,
            idOrder: String = NetworkSettings.DEFAULT_ID,
            idShop: String = NetworkSettings.DEFAULT_ID,
            rating: Int,
            typeMessage: String = "0"
        ): BaseResponse
    }

    companion object {
        fun ClientManagement(): ClientManagement = SCRMApiQwertyImpl()
        fun ClientsV3(): ClientsV3 = SCRMApiQwertyImpl()
        fun ClientCity(): ClientCity = SCRMApiQwertyImpl()
        fun TestimonialsControllerV3(): TestimonialsControllerV3 = SCRMApiQwertyImpl()
    }
}