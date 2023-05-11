package com.progressterra.ipbandroidapi.core

import java.net.SocketTimeoutException
import java.net.UnknownHostException

interface HandleException {

    fun handle(exception: Exception): Exception

    class Base : HandleException {

        override fun handle(exception: Exception): Exception {
            return when (exception) {
                is UnknownHostException, is SocketTimeoutException -> NoInternetConnectionException()
                else -> ServiceUnavailableException()
            }
        }
    }
}