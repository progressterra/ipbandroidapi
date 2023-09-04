package com.progressterra.ipbandroidapi.ext

import com.progressterra.ipbandroidapi.api.legacyscrm.model.SexType
import com.progressterra.ipbandroidapi.api.typecooperation.model.CooperationType

inline fun <T> T?.orIfNull(onNull: () -> T): T = this ?: onNull.invoke()

inline fun <T> tryOrNull(block: () -> T): T? = try {
    block.invoke()
} catch (e: Exception) {
    null
}

fun Int.toSex(): SexType = SexType.values()[this]

fun String.toCooperationType() = when (this) {
    "abcac371-62e1-4b4c-a37c-505f4adc6bd2" -> CooperationType.SELF_EMPLOYER
    "c0103bed-bfba-4979-9a66-3f6cc70bcb05" -> CooperationType.DIRECT_INCOME
    else -> CooperationType.OTHER
}