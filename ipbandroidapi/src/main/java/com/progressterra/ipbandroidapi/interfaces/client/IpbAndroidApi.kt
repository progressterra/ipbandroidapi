package com.progressterra.ipbandroidapi.interfaces.client

import android.content.Context
import com.chibatching.kotpref.Kotpref
import com.chibatching.kotpref.gsonpref.gson
import com.google.gson.Gson
import com.progressterra.ipbandroidapi.localdata.shared_pref.UserData
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.models.base.GlobalResponseStatus
import com.progressterra.ipbandroidapi.repository.RepositoryImpl
import com.progressterra.ipbandroidapi.utils.IdentUtils
import kotlinx.coroutines.*

interface IpbAndroidApi {


    companion object {
        fun init(
            context: Context,
            accessKey: String,
            clientCreationListener: ClientCreationListener
        ) {
            UserData.androidId = IdentUtils.getAndroidId(context)
            Kotpref.gson = Gson()
            NetworkSettings.ACCESS_KEY = accessKey

            // если успешного создания клиента не произошло
            if (!UserData.clientAlreadyCreated) {
                CoroutineScope(Job()).launch {
                    createNewClient(clientCreationListener)
                }
            } else {
                // если клиет создан успешно был до этого
                clientCreationListener.onClientSuccessfullyCreated()
            }
        }

        private suspend fun createNewClient(clientCreationListener: ClientCreationListener) {
            val repository = RepositoryImpl()

            // получаем регистрационный токен
            val registerTokenResponse = repository.getRegisterAccessToken()

            if (registerTokenResponse.globalResponseStatus == GlobalResponseStatus.SUCCESS) {

                // сохраняем токен в префах
                UserData.registerAccessToken = registerTokenResponse.responseBody?.accessToken ?: ""

                // создаем клиента с ранее полученным токеном
                val createClientResponse = repository.createNewClient()

                if (createClientResponse.globalResponseStatus == GlobalResponseStatus.SUCCESS) {
                    repository.saveUserData(

                        // сохраняем полученные данные , а именно id клиента, в префах
                        createClientResponse.responseBody?.client?.convertToClientInfo(),
                        createClientResponse.responseBody?.clientAdditionalInfo?.convertToClientAdditionalInfo()
                    )
                    UserData.clientExist = false

                    // добавляем текущий девайс клиенту
                    val addDeviceResponse = repository.addDevice()

                    if (addDeviceResponse.globalResponseStatus == GlobalResponseStatus.SUCCESS) {
                        // сохраняем девайс айди для клиента в префах
                        UserData.deviceId = addDeviceResponse.responseBody?.idDevice ?: ""

                        // сохраняем успешное создание клиента в префах
                        UserData.clientAlreadyCreated = true

                        // отправляем колбек об успешном завершении регистрации
                        withContext(Dispatchers.Main) {
                            clientCreationListener.onClientSuccessfullyCreated()
                        }
                    } else {
                        // при ошибке отправляем событие о неуспешном создан
                        withContext(Dispatchers.Main) {
                            clientCreationListener.onClientCreatedError(addDeviceResponse.errorString)
                        }
                        return
                    }

                } else {
                    withContext(Dispatchers.Main) {
                        clientCreationListener.onClientCreatedError(createClientResponse.errorString)
                    }
                    return
                }
            } else {
                withContext(Dispatchers.Main) {
                    clientCreationListener.onClientCreatedError(registerTokenResponse.errorString)
                }
                return
            }

        }

    }
}

