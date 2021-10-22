package com.progressterra.ipbandroidapi.utils.extentions

import java.text.SimpleDateFormat
import java.util.*


private const val serverDateFormat = "yyyy-MM-dd'T'HH:mm:ss"
private const val serverDateFormatTimeZone = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSXXX"

private val serverTimeZone = TimeZone.getTimeZone("Europe/Moscow")

fun String?.parseToDate(): Date? {
    if (this == null) return null

    val timeFormat = if (contains("+") || contains("-")) {
        when {
            indexOf("+") == -1 -> {
                serverDateFormat
            }
            else -> {
                serverDateFormatTimeZone
            }
        }
    } else {
        serverDateFormatTimeZone
    }

    val sdf = SimpleDateFormat(timeFormat, Locale.getDefault()).apply {
        timeZone = serverTimeZone
    }
    return tryOrNull { sdf.parse(this) }
}

fun Date?.orNow() = this.orIfNull { Date() }

