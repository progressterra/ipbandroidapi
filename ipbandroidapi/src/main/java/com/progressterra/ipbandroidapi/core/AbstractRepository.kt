package com.progressterra.ipbandroidapi.core

internal abstract class AbstractRepository {

    protected suspend fun <T> handle(block: suspend () -> T): Result<T> = try {
        Result.success(block.invoke())
    } catch (exception: Exception) {
        Result.failure(exception)
    }
}