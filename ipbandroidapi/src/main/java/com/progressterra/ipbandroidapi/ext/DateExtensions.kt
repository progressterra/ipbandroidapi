package com.progressterra.ipbandroidapi.ext

import java.text.SimpleDateFormat
import java.util.TimeZone
import java.util.Date
import java.util.Locale

//TODO visibility modifiers on exts?

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

fun String.convertDate(pattern: String): String {
    val date = this.parseToDate() ?: return ""
    val sdf = SimpleDateFormat(pattern, Locale.getDefault())
    return sdf.format(date)
}

fun Date.format(pattern: String = "yyyy-MM-dd'T'HH:mm:ss"): String {
    val sdf = SimpleDateFormat(pattern, Locale.getDefault()).apply {
        timeZone = serverTimeZone
    }
    return sdf.format(this)
}
