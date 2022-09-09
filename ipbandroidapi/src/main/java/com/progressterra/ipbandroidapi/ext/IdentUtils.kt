package com.progressterra.ipbandroidapi.ext

import android.content.Context
import android.provider.Settings

internal object IdentUtils {

    fun getAndroidId(context: Context): String {
        try {
            return Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return ""
    }
}