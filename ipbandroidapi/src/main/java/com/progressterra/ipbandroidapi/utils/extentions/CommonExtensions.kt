package com.progressterra.ipbandroidapi.utils.extentions

inline fun <T> T?.orIfNull(onNull: () -> T): T = this ?: onNull.invoke()