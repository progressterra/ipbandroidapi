package com.progressterra.ipbandroidapi.utils

import android.content.Context
import android.provider.Settings

internal object IdentUtils {
    /**
     * Получаем Android Id
     * @param context контекст
     * @return id
     */
    fun getAndroidId(context: Context): String {
        try {
            return Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
        } catch (e: Exception) {
            Debug.printThrowable(e)
        }

        return ""
    }
}