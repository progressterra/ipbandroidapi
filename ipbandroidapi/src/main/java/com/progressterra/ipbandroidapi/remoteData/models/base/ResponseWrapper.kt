package com.progressterra.ipbandroidapi.remoteData.models.base

internal class ResponseWrapper<T> {
    lateinit var globalResponseStatus: GlobalResponseStatus
    var responseBody: T? = null
}