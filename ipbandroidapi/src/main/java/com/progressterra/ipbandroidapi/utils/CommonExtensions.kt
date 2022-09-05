package com.progressterra.ipbandroidapi.utils

inline fun <T> T?.orIfNull(onNull: () -> T): T = this ?: onNull.invoke()

inline fun <T> tryOrNull(block: () -> T): T? = try {
    block.invoke()
} catch (e: Exception) {
    null
}