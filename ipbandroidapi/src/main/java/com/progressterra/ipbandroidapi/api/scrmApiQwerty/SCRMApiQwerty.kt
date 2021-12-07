package com.progressterra.ipbandroidapi.api.scrmApiQwerty

import com.progressterra.ipbandroidapi.api.iProBonusApi.models.CityResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests.DeviceParameters
import com.progressterra.ipbandroidapi.remoteData.DEFAULT_ID
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.entities.ParamName


/**
 * http://84.201.188.117:5021/docsapi/v3/index.html
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


        /**
         *  Получение клиета по двум параметрам, если клиента нет вернет status != 0
         *  В result.message - текст ошибки
         */
        suspend fun getClientInfo(
            registerAccessToken: String,
            paramName: ParamName,
            paramValue: String
        ): ClientInfoResponse

        /**
         * Добавляет/обновлят device token, который используется для отправки сообщений
         */
        suspend fun setDeviceToken(deviceParameters: DeviceParameters): ClientInfoResponse
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
            idEmployee: String = DEFAULT_ID,
            idOrder: String = DEFAULT_ID,
            idShop: String = DEFAULT_ID,
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