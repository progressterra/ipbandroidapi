package com.progressterra.ipbandroidapi.interfaces.internal

internal interface NetworkService {

    fun <T> createService(apiClass: Class<T>): T
}

internal inline fun <T> NetworkService.safeApiCall(responseFunction: () -> T): T? =
    try {
        responseFunction.invoke()
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }