package com.progressterra.ipbandroidapi.utils

import java.text.SimpleDateFormat
import java.util.*

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

fun String.convertDate(): String {
    val date = this.parseToDate()
    val sdf = SimpleDateFormat("dd.MM", Locale.getDefault())
    return sdf.format(date!!)
}

fun Date.format(pattern: String = "yyyy-MM-dd'T'HH:mm:ss"): String {
    val sdf = SimpleDateFormat(pattern, Locale.getDefault()).apply {
        timeZone = serverTimeZone
    }
    return sdf.format(this)
}
