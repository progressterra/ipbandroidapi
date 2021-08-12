package com.progressterra.ipbandroidapi.remoteData.models.base

class ResponseWrapper<T> {
    lateinit var globalResponseStatus: GlobalResponseStatus
    var responseBody: T? = null
    var errorString: String = ""

    internal fun <modelOut> convertation(funForConvert: (T?) -> modelOut): ResponseWrapper<modelOut> {
        val newResponseWrapper = ResponseWrapper<modelOut>()
        newResponseWrapper.responseBody = funForConvert.invoke(this.responseBody)
        newResponseWrapper.globalResponseStatus = this.globalResponseStatus
        return newResponseWrapper
    }

    companion object {
        fun <T> responseIsSuccess(body: T?): ResponseWrapper<T> {
            return ResponseWrapper<T>().apply {
                responseBody = body
                globalResponseStatus = GlobalResponseStatus.SUCCESS
            }

        }

        fun <T> responseIsError(msg: String): ResponseWrapper<T> {
            return ResponseWrapper<T>().apply {
                globalResponseStatus = GlobalResponseStatus.ERROR
                errorString = msg
            }

        }
    }
}