package com.progressterra.ipbandroidapi.core

import android.util.Log
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings
import java.net.SocketTimeoutException
import java.net.UnknownHostException

interface HandleException {

    fun handle(exception: Exception): Exception

    class Base : HandleException {

        override fun handle(exception: Exception): Exception {
            if (IpbAndroidApiSettings.DEBUG) {
                Log.e("API", exception.message, exception)
            }
            return when (exception) {
                is UnknownHostException, is SocketTimeoutException -> NoInternetConnectionException()
                else -> exception
            }
        }
    }
}