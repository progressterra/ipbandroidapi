package com.progressterra.ipbandroidapi.core

import android.util.Log
import com.progressterra.ipbandroidapi.exception.HandleException

abstract class AbstractCloudDataSource(
    private val handleException: HandleException
) {

    //TODO remove error print

    protected suspend fun <T> handle(block: suspend () -> T): T = try {
        block.invoke()
    } catch (error: Exception) {
        error.printStackTrace()
        Log.e("Cloud data source:", error.message ?: "no message")
        throw handleException.handle(error)
    }
}