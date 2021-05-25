package com.progressterra.ipbandroidapi.remoteData.models.base

class ResponseWrapper<T> {
    lateinit var globalResponseStatus: GlobalResponseStatus
    var responseBody: T? = null
}