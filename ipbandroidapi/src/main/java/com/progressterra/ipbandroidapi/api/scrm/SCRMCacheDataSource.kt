package com.progressterra.ipbandroidapi.api.scrm

import android.content.SharedPreferences

interface SCRMCacheDataSource {

    suspend fun saveIdDevice(idDevice: String)

    suspend fun idDevice(): String

    class Base(
        private val sharedPreferences: SharedPreferences
    ) : SCRMCacheDataSource {

        override suspend fun saveIdDevice(idDevice: String) {
            sharedPreferences.edit().putString(SCRM_CACHE_KEY, idDevice).apply()
        }

        override suspend fun idDevice(): String = sharedPreferences.getString(SCRM_CACHE_KEY, null) ?: ""

        companion object {

            private const val SCRM_CACHE_KEY = "scrm cache key"
        }
    }
}