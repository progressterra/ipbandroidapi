package com.progressterra.ipbandroidapi.core

abstract class AbstractRepository {

    //TODO remove error print
    protected suspend fun <T> handle(block: suspend () -> T): Result<T> = try {
        Result.success(block.invoke())
    } catch (exception: Exception) {
        exception.printStackTrace()
        Result.failure(exception)
    }
}