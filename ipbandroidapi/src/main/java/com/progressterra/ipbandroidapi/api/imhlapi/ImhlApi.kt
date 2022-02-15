package com.progressterra.ipbandroidapi.api.imhlapi

import com.progressterra.ipbandroidapi.api.imhlapi.models.compile.CompiledSessionResponse
import com.progressterra.ipbandroidapi.api.imhlapi.models.session.SessionListResponse
import retrofit2.http.GET
import retrofit2.http.Path

internal interface ImhlApi {

    interface Compile {
        @GET("/compile/session/compile/{IDSession}")
        suspend fun compileSession(@Path("IDSession") sessionId: String): CompiledSessionResponse
    }

    interface Session {
        @GET("/session/list/{skip}/{take}")
        suspend fun getSessionList(
            @Path("skip") skip: Int,
            @Path("take") take: Int
        ): SessionListResponse
    }
}