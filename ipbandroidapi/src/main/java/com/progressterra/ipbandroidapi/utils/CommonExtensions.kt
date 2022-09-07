package com.progressterra.ipbandroidapi.utils

import com.progressterra.ipbandroidapi.user.SexType

inline fun <T> T?.orIfNull(onNull: () -> T): T = this ?: onNull.invoke()

inline fun <T> tryOrNull(block: () -> T): T? = try {
    block.invoke()
} catch (e: Exception) {
    null
}

fun Int.toSex(): SexType = SexType.values()[this]