package com.progressterra.ipbandroidapi.api

import com.chibatching.kotpref.Kotpref
import com.chibatching.kotpref.gsonpref.gson
import com.google.gson.Gson
import com.progressterra.ipbandroidapi.NetworkSettings

object IPBAndroidAPI {

    fun initialize(
        accessKey: String
    ) {
        Kotpref.gson = Gson()
        NetworkSettings.ACCESS_KEY = accessKey
    }
}

