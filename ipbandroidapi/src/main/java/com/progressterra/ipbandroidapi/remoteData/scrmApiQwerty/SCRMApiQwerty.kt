package com.progressterra.ipbandroidapi.remoteData.scrmApiQwerty

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

    companion object {
        fun ClientManagement(): SCRMApiQwerty.ClientManagement = SCRMApiQwertyImpl()
    }
}