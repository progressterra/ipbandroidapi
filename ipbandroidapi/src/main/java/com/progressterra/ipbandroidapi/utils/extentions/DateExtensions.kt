package com.progressterra.ipbandroidapi.utils.extentions

import java.text.SimpleDateFormat
import java.util.*

fun String?.parseToDate(): Date {
    val sdf = SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss", Locale.getDefault()).apply {
        timeZone = TimeZone.getTimeZone("UTC")
    }
    return sdf.parse(this).orNow()
}

fun Date?.orNow() = this.orIfNull { Date() }

