package com.progressterra.ipbandroidapi.utils.extentions

import android.util.Log

inline fun <T> T?.orIfNull(onNull: () -> T): T = this ?: onNull.invoke()


inline fun <T> tryOrNull(block: () -> T): T? =
    try {
        block.invoke()
    } catch (e: Exception) {
        Log.e("tryOrNull", "${e.message}")
        e.printStackTrace()
        null
    }