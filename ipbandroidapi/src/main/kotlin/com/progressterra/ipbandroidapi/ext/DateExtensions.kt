package com.progressterra.ipbandroidapi.ext

import java.text.SimpleDateFormat
import java.util.TimeZone
import java.util.Date
import java.util.Locale

private const val serverDateFormat = "yyyy-MM-dd'T'HH:mm:ss"
private const val serverDateFormatTimeZone = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSXXX"

private val serverTimeZone = TimeZone.getTimeZone("Europe/Moscow")

fun String.parseToDate(): Date? {
    val timeFormat = if (indexOf("+", 8) != -1 || indexOf("-", 8) != -1) {
        serverDateFormatTimeZone
    } else {
        serverDateFormat
    }
    val sdf = SimpleDateFormat(timeFormat, Locale.getDefault()).apply {
        timeZone = serverTimeZone
    }
    return tryOrNull { sdf.parse(this) }
}

fun Date?.orNow() = this.orIfNull { Date() }

fun Date.format(pattern: String = serverDateFormat): String {
    val sdf = SimpleDateFormat(pattern, Locale.getDefault())
    sdf.timeZone = serverTimeZone
    return sdf.format(this)
}
