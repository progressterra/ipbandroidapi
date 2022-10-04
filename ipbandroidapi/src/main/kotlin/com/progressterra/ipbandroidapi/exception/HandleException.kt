package com.progressterra.ipbandroidapi.exception

import android.util.Log
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import kotlin.Exception

internal interface HandleException {

    fun handle(exception: Exception): Exception

    class Base : HandleException {

        override fun handle(exception: Exception) : Exception {
            Log.e("HE", "handled", exception)
            return when (exception) {
                is UnknownHostException, is SocketTimeoutException -> NoInternetConnectionException()
                else -> ServiceUnavailableException()
            }
        }
    }
}