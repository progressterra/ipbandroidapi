package com.progressterra.ipbandroidapi.interfaces.client

import android.content.Context
import com.chibatching.kotpref.Kotpref
import com.chibatching.kotpref.gsonpref.gson
import com.google.gson.Gson
import com.progressterra.ipbandroidapi.interfaces.client.login.LoginApi
import com.progressterra.ipbandroidapi.interfaces.client.login.LoginApiImpl
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CreateClientWithoutPhoneRequest
import com.progressterra.ipbandroidapi.localdata.shared_pref.UserData
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.models.base.GlobalResponseStatus
import com.progressterra.ipbandroidapi.repository.RepositoryImpl
import com.progressterra.ipbandroidapi.utils.IdentUtils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

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

            if (!UserData.clientAlreadyCreated) {
                CoroutineScope(Job()).launch {
                    createNewClient(clientCreationListener)
                }
            }
        }

        private suspend fun createNewClient(clientCreationListener: ClientCreationListener) {
            LoginApi.newInstance().createClientWithoutPhone(
                CreateClientWithoutPhoneRequest(
                    channelName = "device",
                    channelValue = UserData.deviceId,
                    "",
                    ""
                )
            ).let {
                if (it.globalResponseStatus == GlobalResponseStatus.SUCCESS) {
                    if (it.responseBody?.accessToken != null) {
                        UserData.clientAlreadyCreated = true
                        UserData.registerAccessToken = it.responseBody?.accessToken ?: ""
                        RepositoryImpl().createNewClient()
                        RepositoryImpl().addDevice()
                        clientCreationListener.onClientSuccessfullyCreated()
                    }
                } else {
                    clientCreationListener.onClientCreatedError(it.errorString)
                }
            }
        }


        fun getSavedAccessToken() = UserData.accessToken
    }
}

