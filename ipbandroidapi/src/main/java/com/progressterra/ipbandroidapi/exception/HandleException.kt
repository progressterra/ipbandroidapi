package com.progressterra.ipbandroidapi.exception

import java.net.SocketTimeoutException
import java.net.UnknownHostException
import kotlin.Exception

interface HandleException {

    fun handle(exception: Exception): Exception

    class Base : HandleException {

        override fun handle(exception: Exception) = when (exception) {
            is UnknownHostException, is SocketTimeoutException -> NoInternetConnectionException()
            else -> ServiceUnavailableException()
        }
    }
}