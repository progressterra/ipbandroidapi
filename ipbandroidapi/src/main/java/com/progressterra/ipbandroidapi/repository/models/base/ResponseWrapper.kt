package com.progressterra.ipbandroidapi.repository.models.base

class ResponseWrapper<T> {
    lateinit var globalResponseStatus: GlobalResponseStatus
    var responseBody: T? = null
}