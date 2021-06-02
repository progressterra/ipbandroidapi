package com.progressterra.ipbandroidapi.interfaces.client

import android.content.Context
import com.chibatching.kotpref.Kotpref
import com.chibatching.kotpref.gsonpref.gson
import com.google.gson.Gson
import com.progressterra.ipbandroidapi.localdata.shared_pref.UserData
import com.progressterra.ipbandroidapi.utils.IdentUtils

interface IpbAndroidApi {

    companion object {
        fun init(context: Context) {
            UserData.androidId = IdentUtils.getAndroidId(context)
            Kotpref.gson = Gson()
        }

        fun getSavedAccessToken() = UserData.accessToken
    }
}

