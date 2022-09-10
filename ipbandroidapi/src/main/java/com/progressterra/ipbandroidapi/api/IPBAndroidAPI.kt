package com.progressterra.ipbandroidapi.api

import android.content.Context
import android.provider.Settings
import com.chibatching.kotpref.Kotpref
import com.chibatching.kotpref.gsonpref.gson
import com.google.gson.Gson
import com.progressterra.ipbandroidapi.NetworkSettings
import com.progressterra.ipbandroidapi.user.UserData

object IPBAndroidAPI {

    fun initialize(
        context: Context,
        accessKey: String
    ) {
        UserData.androidId = Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
        Kotpref.gson = Gson()
        NetworkSettings.ACCESS_KEY = accessKey
    }
}

