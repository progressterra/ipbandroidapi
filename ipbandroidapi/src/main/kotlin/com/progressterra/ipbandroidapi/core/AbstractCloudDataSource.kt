package com.progressterra.ipbandroidapi.core

import com.progressterra.ipbandroidapi.exception.HandleException

abstract class AbstractCloudDataSource(
    private val handleException: HandleException
) {

    protected suspend fun <T> handle(block: suspend () -> T): T = try {
        block.invoke()
    } catch (error: Exception) {
        throw handleException.handle(error)
    }
}