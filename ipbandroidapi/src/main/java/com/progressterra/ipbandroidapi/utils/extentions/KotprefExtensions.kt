package com.progressterra.ipbandroidapi.utils.extentions

import com.google.gson.Gson
import com.progressterra.ipbandroidapi.localdata.shared_pref.base.JsonPrefModel

internal fun <T : JsonPrefModel> T.convertToJson(): String {
    return Gson().toJson(this)
}

internal inline fun <reified T : JsonPrefModel> String.convertFromJson(): T {
    return Gson().fromJson(this, T::class.java)
}