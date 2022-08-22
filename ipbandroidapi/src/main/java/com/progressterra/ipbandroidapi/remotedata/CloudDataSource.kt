package com.progressterra.ipbandroidapi.remotedata

import com.progressterra.ipbandroidapi.exception.HandleException

interface CloudDataSource {

    suspend fun <T> handle(block: suspend () -> T): T

    abstract class Abstract(
        private val handleException: HandleException
    ) : CloudDataSource {

        override suspend fun <T> handle(block: suspend () -> T): T =
            try {
                block.invoke()
            } catch (error: Exception) {
                throw handleException.handle(error)
            }
    }
}