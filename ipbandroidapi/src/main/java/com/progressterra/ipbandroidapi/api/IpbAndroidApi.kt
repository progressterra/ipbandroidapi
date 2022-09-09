package com.progressterra.ipbandroidapi.api

import android.content.Context
import com.chibatching.kotpref.Kotpref
import com.chibatching.kotpref.gsonpref.gson
import com.google.gson.Gson
import com.progressterra.ipbandroidapi.NetworkSettings
import com.progressterra.ipbandroidapi.user.UserData
import com.progressterra.ipbandroidapi.ext.IdentUtils

interface IpbAndroidApi {

    companion object {
        fun init(
            context: Context,
            accessKey: String
        ) {
            UserData.androidId = IdentUtils.getAndroidId(context)
            Kotpref.gson = Gson()
            NetworkSettings.ACCESS_KEY = accessKey
        }
    }
}

