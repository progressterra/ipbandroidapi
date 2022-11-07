package com.progressterra.ipbandroidapi.core

import com.progressterra.ipbandroidapi.exception.HandleException

abstract class AbstractRepository(private val handleException: HandleException) {

    protected suspend fun <T> handle(block: suspend () -> T): Result<T> = try {
        Result.success(block.invoke())
    } catch (exception: Exception) {
        Result.failure(handleException.handle(exception))
    }
}