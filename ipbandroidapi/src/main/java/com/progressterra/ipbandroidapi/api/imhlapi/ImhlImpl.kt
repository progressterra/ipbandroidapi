package com.progressterra.ipbandroidapi.api.imhlapi

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.api.imhlapi.models.compile.CompiledSessionResponse
import com.progressterra.ipbandroidapi.api.imhlapi.models.session.SessionListResponse
import com.progressterra.ipbandroidapi.core.NetworkService

internal class ImhlImpl : Imhl.Compile, Imhl.Session {

    private val networkService: NetworkService = NetworkService.Base()

    private val imhlCompileApi =
        networkService.createService(ImhlApi.Compile::class.java, URL.IMHL_API_URL)

    private val imhlSessionApi =
        networkService.createService(ImhlApi.Session::class.java, URL.IMHL_API_URL)

    override suspend fun compileSession(sessionId: String): CompiledSessionResponse {
        return imhlCompileApi.compileSession(sessionId)
    }

    override suspend fun getSessionList(skipCount: Int, takeCount: Int): SessionListResponse {
        return imhlSessionApi.getSessionList(skipCount, takeCount)
    }
}