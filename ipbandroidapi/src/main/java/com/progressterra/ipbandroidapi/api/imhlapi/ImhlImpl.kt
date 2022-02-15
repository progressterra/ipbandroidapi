package com.progressterra.ipbandroidapi.api.imhlapi

import com.progressterra.ipbandroidapi.api.imhlapi.models.compile.CompiledSessionResponse
import com.progressterra.ipbandroidapi.api.imhlapi.models.session.SessionListResponse
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings

internal class ImhlImpl : Imhl.Compile, Imhl.Session {

    private val networkService: NetworkService = NetworkServiceImpl()

    private val imhlCompileApi =
        networkService.createService(ImhlApi.Compile::class.java, NetworkSettings.IMHL_API_URL)

    private val imhlSessionApi =
        networkService.createService(ImhlApi.Session::class.java, NetworkSettings.IMHL_API_URL)

    override suspend fun compileSession(sessionId: String): CompiledSessionResponse {
        return imhlCompileApi.compileSession(sessionId)
    }

    override suspend fun getSessionList(skipCount: Int, takeCount: Int): SessionListResponse {
        return imhlSessionApi.getSessionList(skipCount, takeCount)
    }
}