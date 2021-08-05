package com.progressterra.ipbandroidapi.utils.extentions

import java.text.SimpleDateFormat
import java.util.*


private const val serverDateFormat = "yyyy-MM-dd'T'hh:mm:ss"

private val serverTimeZone = TimeZone.getTimeZone("Europe/Moscow")

fun String?.parseToDate(): Date {
    val sdf = SimpleDateFormat(serverDateFormat, Locale.getDefault()).apply {
        timeZone = serverTimeZone
    }
    return tryOrNull { sdf.parse(this) }.orIfNull { Date() }
}

fun Date?.orNow() = this.orIfNull { Date() }

